/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prjetoclinica.controller;

import br.com.projetoclinica.modelConnection.ConexaoBD;
import br.com.projetoclinica.modelDAO.MedicoDAO;
import br.com.prjetoclinica.modelEntities.Medico;
import br.com.projetoclinica.view.FormMedico;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author victor
 */
public class MedicoController {
    
    private FormMedico fmMedico;
    
    public MedicoController(FormMedico pFMMedico){
        this.fmMedico = pFMMedico;
    }   

   /* public void salvaUsuario(){
        String nomeMed = fmMedico.getjTextFieldNome().getText();
        int crm = (Integer.parseInt(fmMedico.getjFormattedTextFieldCrm().getText()));
        String expecializacao =(String) fmMedico.getjComboBoxExpecializacao().getSelectedItem();
        
        Medico medico = new Medico(nomeMed, expecializacao, crm);
        
        try {
            Connection conexao = new ConexaoBD().conexao();
            MedicoDAO medicoDAO = new MedicoDAO(conexao);
            medicoDAO.salvar(medico);
            
            JOptionPane.showMessageDialog(null, "Medico Cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    
    /*public void buscandoMedico(){
        String campBuscar = fmMedico.getjButtonPesquisar().getText();
         Medico medico = new Medico(campBuscar);
        try {
            Connection conexao = new ConexaoBD().getConnection();
            MedicoDAO medicoDAO = new MedicoDAO(conexao);
            medicoDAO.buscaMedico(medico);
            
            JOptionPane.showMessageDialog(null, "Medico encontrado com sucesso!");
            
        } catch (SQLException ex) {
            showMessageDialog(null, "Erro ao buscar o Médico! \n"+ ex.getMessage());
        }
        
    }*/

}
