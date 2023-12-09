/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Dueño;
import modelo.Usuarios;
import modelo.Cita;
import modelo.CitaDAO;
import modelo.Veterinarios;
import vista.frmRegistrarCitas;

/**
 *
 * @author rafig
 */
public class ControllerCitas implements ActionListener {

    frmRegistrarCitas vistaCita = new frmRegistrarCitas();
    Cita c = new Cita();
    CitaDAO dao = new CitaDAO();
    Dueño d = new Dueño();
    Veterinarios v = new Veterinarios();
    Helpers h = new Helpers();
    Usuarios us = new Usuarios();
    
    
     public ControllerCitas (frmRegistrarCitas frm){
        this.vistaCita = frm;
        this.vistaCita.btnBuscarV.addActionListener(this);
        this.vistaCita.btnBuscarC.addActionListener(this);
        this.vistaCita.btnGuardar.addActionListener(this);
        this.vistaCita.btnCancelar.addActionListener(this);
        this.vistaCita.btnEliminar.addActionListener(this);
        this.vistaCita.btnActualizar.addActionListener(this);
        this.vistaCita.btnRefrescar1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vistaCita.btnBuscarV){  
            dao.TraerDueño(d);
            TraerDueño();
        }
        if(e.getSource() == vistaCita.btnBuscarC){  
            dao.TraerVeterinario(v);
            TraerVeterinario();
        }
        if(e.getSource() == vistaCita.btnGuardar){              
            try {
                AgregarCita();
            } catch (ParseException ex) {
                Logger.getLogger(ControllerCitas.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        if(e.getSource() == vistaCita.btnCancelar){             
            limpiarCampos();
        }
        if(e.getSource() == vistaCita.btnEliminar){ 
            eliminarCita();
            limpiarCampos();
        }
        if(e.getSource() == vistaCita.btnActualizar){ 
            try {
                actualizarCita();
            } catch (ParseException ex) {
                Logger.getLogger(ControllerCitas.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiarCampos();
        }
        if (e.getSource() == vistaCita.btnRefrescar1) {
            filtrarTablaPorNombre(vistaCita.tblDatos1, "");
        }
        if (e.getSource() == vistaCita.btnBuscar) {
            filtrarTablaPorNombre(vistaCita.tblDatos1, vistaCita.txtBuscar.getText());
        }
    }
    
    public void TraerDueño(){
    vistaCita.txtId.setText(String.valueOf(d.getIdDueno()));
    vistaCita.txtCedulaD.setText(d.getCedula());     
    }
    
    public void TraerVeterinario(){
    vistaCita.txtIdV.setText(String.valueOf(v.getIdVeterinario()));
    vistaCita.txtNombreV.setText(v.getNombre()+ " " + v.getApellido1() + " " + v.getApellido2());     
    }
    
    public void AgregarCita() throws ParseException{
        
        String asunto = vistaCita.txtAsunto.getText();        
        int idDueno = Integer.parseInt(vistaCita.txtId.getText());
        int idVeterinario = Integer.parseInt(vistaCita.txtIdV.getText());
        String cedulaD = vistaCita.txtCedulaD.getText();
        
        c.setAsunto(asunto);
        c.setFecha(h.fechaActual());
        c.setHora(h.horaActual());
        c.setFechaCreacion(h.fechaActual());
        c.setIdDueño(idDueno);
        c.setIdVeterinarios(idVeterinario);
        c.setIdUsuario(us.getIdUsuario());
        c.setCedula(cedulaD);

        int r = dao.agregarCita(c);
        
        if (r == 1){
            JOptionPane.showMessageDialog(vistaCita, "Cita Agregada Correctamente");
            limpiarCampos();
        }
        else{
             JOptionPane.showMessageDialog(vistaCita, "Cita No Agregada");
        }  
    }
    
    public void actualizarCita() throws ParseException {

        String asunto = vistaCita.txtAsunto.getText();        
        int idDueno = Integer.parseInt(vistaCita.txtId.getText());
        int idVeterinario = Integer.parseInt(vistaCita.txtIdV.getText());
        String cedulaD = vistaCita.txtCedulaD.getText();
        c.setAsunto(asunto);
        c.setFecha(h.fechaActual());
        c.setHora(h.horaActual());
        c.setFechaCreacion(h.fechaActual());
        c.setIdDueño(idDueno);
        c.setIdVeterinarios(idVeterinario);
        c.setIdUsuario(us.getIdUsuario());
        c.setCedula(cedulaD);
        
        int r = dao.actualizarCita(c);

        if (r == 1) {
            JOptionPane.showMessageDialog(vistaCita, "Mascota actualizada con exito");
            filtrarTablaPorNombre(vistaCita.tblDatos1, "");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vistaCita, "Mascota NO actualizada");
        }
    }
    
    public void eliminarCita() {

        int fila = vistaCita.tblDatos1.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaCita, "Debe seleccionar un registro en la tabla");
        } else {
            int id = Integer.parseInt(vistaCita.tblDatos1.getValueAt(fila, 0).toString());

            int r = dao.eliminarCita(id);

            if (r == 1) {
                JOptionPane.showMessageDialog(vistaCita, "La mascota se elimino con exito");
                filtrarTablaPorNombre(vistaCita.tblDatos1, "");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(vistaCita, "La mascota NO se elimino");
            }
        }
    }
    
    public void filtrarTablaPorNombre(JTable table, String filtro) {
        dao.filtrarTablaPorNombre(table, filtro);
    }
    
    public void limpiarCampos(){
        vistaCita.txtId.setText("");
        vistaCita.txtIdV.setText("");
        vistaCita.txtNombreV.setText("");
        vistaCita.txtCedulaD.setText("");  
        vistaCita.txtAsunto.setText("");
    }
    
    public void inicio() {
        filtrarTablaPorNombre(vistaCita.tblDatos1, "");
        limpiarCampos();
    }
}
