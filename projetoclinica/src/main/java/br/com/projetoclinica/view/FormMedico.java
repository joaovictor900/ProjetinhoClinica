/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoclinica.view;

import br.com.projetoclinica.modelConnection.ConexaoBD;
import br.com.prjetoclinica.controller.MedicoController;
import br.com.prjetoclinica.modelEntities.Medico;
import br.com.prjetoclinica.modelEntities.ModeloTabela;
import br.com.projetoclinica.modelDAO.MedicoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor
 */
public class FormMedico extends javax.swing.JFrame {
    Medico med = new Medico();
    ConexaoBD conex = new ConexaoBD();
    private final MedicoController medController;
    MedicoDAO md = new MedicoDAO();
    int flag = 0;
    
    public FormMedico() {
        initComponents();
        medController = new MedicoController(this);
        preencherTabela("select * from medicos order by nome_medico");
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldCrm = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxExpecializacao = new javax.swing.JComboBox();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setText("Crm:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(119, 103, 30, 30);

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(111, 56, 40, 40);

        jFormattedTextFieldCrm.setEnabled(false);
        jPanel1.add(jFormattedTextFieldCrm);
        jFormattedTextFieldCrm.setBounds(150, 100, 160, 30);

        jLabel4.setText("Expecialização:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 60, 90, 30);

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(149, 60, 340, 30);

        jComboBoxExpecializacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cirurgião" }));
        jPanel1.add(jComboBoxExpecializacao);
        jComboBoxExpecializacao.setBounds(590, 60, 110, 30);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovo);
        jButtonNovo.setBounds(12, 34, 81, 30);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(12, 70, 81, 32);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(12, 108, 80, 32);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluir);
        jButtonExcluir.setBounds(12, 184, 81, 32);

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(12, 146, 81, 32);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(380, 140, 90, 30);

        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableMedico);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(111, 190, 563, 200);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(150, 140, 220, 30);

        jLabel5.setText("ID:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 20, 20, 30);

        jTCodigo.setEnabled(false);
        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jTCodigo);
        jTCodigo.setBounds(150, 20, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(23, 43, 710, 410);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Médicos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(271, 13, 183, 24);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(20, 10, 64, 30);

        setSize(new java.awt.Dimension(769, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jComboBoxExpecializacao.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCrm.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jComboBoxExpecializacao.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTCodigo.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisa.setText("");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(flag == 1){
        med.setNome(jTextFieldNome.getText());
        med.setExpecialidade((String)jComboBoxExpecializacao.getSelectedItem());
        med.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
        md.salvar(med);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldCrm.setEnabled(false);
        jComboBoxExpecializacao.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTCodigo.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisa.setText("");
        preencherTabela("select * from medicos order by nome_medico");
        }else{
            med.setCodigo((Integer.parseInt(jTCodigo.getText())));
            med.setNome(jTextFieldNome.getText());
            med.setExpecialidade((String)jComboBoxExpecializacao.getSelectedItem());
            med.setCrm(Integer.parseInt(jFormattedTextFieldCrm.getText()));
            md.editar(med);
            jTCodigo.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jComboBoxExpecializacao.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTabela("select * from medicos order by nome_medico");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        /*Utilizamos aqui o método encapsulado set para pegar o que o usuário digitou no campo txtPesquisa
            */
        med.setPesquisa(jTextFieldPesquisa.getText());
        
        Medico modelo;

        try {
            modelo = md.buscarPor(med);
            if (modelo != null) {
                jTextFieldNome.setText(modelo.getNome());
                /**
                 * String.valueOf() pega um Valor Inteiro e transforma em String
                 * e seta em jFormattedTextFieldCRM que é um campo do tipo texto
                 */
                jFormattedTextFieldCrm.setText((String.valueOf(modelo.getCrm())));
                /*Para setarmos um campos Combobox utilizamos o método setSelectedItem**/
                jComboBoxExpecializacao.setSelectedItem(modelo.getExpecialidade());
                jTCodigo.setText((String.valueOf(modelo.getCodigo())));
                /**
                 * Liberar os botões abaixo
                 */
                jButtonEditar.setEnabled(true);
                jButtonExcluir.setEnabled(true);
                jButtonCancelar.setEnabled(true);
                jButtonSalvar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Médico não Cadastrado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na camada gui FormMedico" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCrm.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jComboBoxExpecializacao.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTCodigo.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCrm.setText("");
        jTextFieldPesquisa.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta = 0;
       resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir esse medico?");
       if(resposta == JOptionPane.YES_OPTION){
            med.setCodigo(Integer.parseInt(jTCodigo.getText()));
            md.excluir(med);
            jTCodigo.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCrm.setText("");
            jTextFieldPesquisa.setText("");
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCrm.setEnabled(false);
            jComboBoxExpecializacao.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonEditar.setEnabled(false);
       }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaPrincipal telPrin = new TelaPrincipal();
        telPrin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Nome", "Especialidade", "Crm"};    
        conex.conexao();
        conex.executaSQL(sql);
        try {
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("nome_medico"),
                    conex.rs.getString("expecializacao"), conex.rs.getInt("crm")
                });
            }while(conex.rs.next());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList"+ex);
        }
        ModeloTabela  modelo = new ModeloTabela(dados, colunas);
        jTableMedico.setModel(modelo);
        jTableMedico.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableMedico.getColumnModel().getColumn(0).setResizable(false);
        jTableMedico.getColumnModel().getColumn(1).setPreferredWidth(306);
        jTableMedico.getColumnModel().getColumn(1).setResizable(false);
        jTableMedico.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableMedico.getColumnModel().getColumn(2).setResizable(false);
        jTableMedico.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableMedico.getColumnModel().getColumn(3).setResizable(false);
        jTableMedico.getTableHeader().setReorderingAllowed(false);
        jTableMedico.setAutoResizeMode(jTableMedico.AUTO_RESIZE_OFF);
        jTableMedico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox jComboBoxExpecializacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldCrm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTable jTableMedico;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables

    public JComboBox getjComboBoxExpecializacao() {
        return jComboBoxExpecializacao;
    }

    public void setjComboBoxExpecializacao(JComboBox jComboBoxExpecializacao) {
        this.jComboBoxExpecializacao = jComboBoxExpecializacao;
    }

    public JFormattedTextField getjFormattedTextFieldCrm() {
        return jFormattedTextFieldCrm;
    }

    public void setjFormattedTextFieldCrm(JFormattedTextField jFormattedTextFieldCrm) {
        this.jFormattedTextFieldCrm = jFormattedTextFieldCrm;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JButton getjButtonPesquisar() {
        return jButtonPesquisar;
    }

    public void setjButtonPesquisar(JButton jButtonPesquisar) {
        this.jButtonPesquisar = jButtonPesquisar;
    }

    

}