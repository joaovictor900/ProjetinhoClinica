
package br.com.projetoclinica.modelConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author victor
 */
public class ConexaoBD {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/clinica";
    private final String USER = "clinica";
    private final String PASS = "senha";              
    public ResultSet rs;
    public Statement stm;
    public Connection con;
  
    public void conexao() {
        System.setProperty("jdbc.Drivers", DRIVER);
        try {
            con=DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Conexao sem sucesso! \n"+ex.getMessage());
        }
           
    }
    
    public void desconecta(){
        try {
           con.close();
            
        } catch (SQLException ex) {
            showMessageDialog(null, "Erro ao desconectar o Banco de Dados: \n"+ ex.getMessage());
        }
    }
    
    public void executaSQL(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao executar o SQL \n"+ ex.getMessage());
        }
    }
    
}
