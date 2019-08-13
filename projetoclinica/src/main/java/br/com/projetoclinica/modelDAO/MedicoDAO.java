package br.com.projetoclinica.modelDAO;

import br.com.projetoclinica.modelConnection.ConexaoBD;
import br.com.prjetoclinica.modelEntities.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
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
             showMessageDialog(null, "Erro ao inserir! \n"+ ex.getMessage());
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
            /**
             * O código abaixo é uma pesquisa montada na linguagem estruturada
             * de consulta que tem como funcionalidade buscar no campo
             * nome_medico o nome digitado pelo usuário no FormMedico campo
             * txtPesquisa que foi setado pelo metodo de encapsulamento
             * setPesquisa() contido na camada MedicoDTO e agora recuperado pelo
             * parametro medico que recupera o valor digitado pelo
             * getPesquisa(). OBSERVAÇÃO IMPORTANTE:O operador ILIKE é
             * específico do PostgreSQL e seu comportamento é semelhante ao
             * LIKE. A única diferença é que ele é case-insensitive, ou seja,
             * não diferencia maiúsculas de minúsculas.
             * Fontes:https://pt.stackoverflow.com/questions/96926/como-fazer-consulta-sql-que-ignora-mai%C3%BAsculas-min%C3%BAsculas-e-acentos
             */
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
    
