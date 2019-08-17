package br.com.projetoclinica.modelDAO;

import br.com.projetoclinica.modelConnection.ConexaoBD;
import br.com.prjetoclinica.modelEntities.Medico;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class MedicoDAO {
    ConexaoBD conex = new ConexaoBD();
   
    public void salvar(Medico medico) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome_medico, expecializacao, crm) values(?,?,?)");           
            pst.setString(1, medico.getNome());
            pst.setString(2, medico.getExpecialidade());
            pst.setInt(3, medico.getCrm());
            pst.execute();
            pst.close();            
            JOptionPane.showMessageDialog(null, "Medico inserido com sucesso!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao inserir! \n"+ ex.getMessage());
        }
         
       conex.desconecta();
    }
    
    
    
    public void editar(Medico medico){
        conex.conexao();
     
        try {
            PreparedStatement pst = conex.con.prepareStatement("update medicos set nome_medico=?, expecializacao=?,"
                    + " crm=? where id=?");
            pst.setString(1, medico.getNome());
            pst.setString(2, medico.getExpecialidade());
            pst.setInt(3, medico.getCrm());
            pst.setInt(4, medico.getCodigo());
            pst.execute();    
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!/nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void excluir(Medico medico){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicos where id=?");
            pst.setInt(1, medico.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ao excluir dados!/nErro:"+ex);
        }
        
        conex.desconecta();
    }
     
    public Medico buscarPor(Medico medico) {
        /**
         * FLAG agente retorna null caso não encontre o médico buscado no banco
         * ele retorna nulo, ou seja, não foi encontrado no banco o médico
         * buscado
         */
        Medico medicoD = null;

        try {
            /*
    * Logo abaixo teremos um objeto do Tipo Connection que é o connection, e que
    * irá receber da Classe ConexaoUtil o retorno da conexão da aplicação com o
    * Banco de Dados MYSQL
             */

            conex.conexao();
           
            String sql = "SELECT *FROM medicos WHERE nome_medico LIKE '%" + medico.getPesquisa() + "%'";

            //PreparedStatement statement = connection.prepareStatement(sql);
            PreparedStatement statement = conex.con.prepareStatement(sql);

            //statement.setString(1, medico);
            ResultSet resultSet = statement.executeQuery();
            /**
             * como sabemos que pelo sql disparado no banco irá trazer no máximo
             * um dado em vez de fazer um laço de repetição faremos um if
             */

            if (resultSet.next()) {

                /*
                 * Dentro do loop não se esquecer de inicializar o objeto como abaixo, caso
                 * contrário erro de exception
                 */
                medicoD = new Medico();
                medicoD.setCodigo(resultSet.getInt("id"));
                medicoD.setNome(resultSet.getString("nome_medico"));
                medicoD.setExpecialidade(resultSet.getString("expecializacao"));
                medicoD.setCrm(resultSet.getInt("crm"));
                
                return medicoD;
            }

            conex.desconecta();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro metodo novo" + e.getMessage());
        }

        return null;
    }
 
      /*esse metodo pega aconexao direto do connection,
        porem não ultiliza o TYPE_SCROLL_INSENSITIVE, CONCUR_READ_ONLY.
        Classe @ConexaoBD - Metodo @executaSQL.
            
        String sql = "Select * from medicos where nome_medico like' %"+med.getPesquisa()+"%'";
           PreparedStatement statement;
           statement = connection.prepareCall(sql);
           statement.execute();
           connection.close();
           */     
}
    
