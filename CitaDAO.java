/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import helpers.Helpers;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafig
 */
public class CitaDAO {
    
    Helpers h = new Helpers();
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();
    
    public int agregarCita(Cita cita) {
        
        int r = 0;
        String sql = "INSERT INTO cita (asunto, fecha, hora, fechaCreacion, IdDueno, IdVeterinario, IdUsuario, CedulaDueno) VALUES (?,?,?,?,?,?,?,?)";

        try{
            con = conectar.getConecction(); 
            ps = con.prepareStatement(sql); 
            ps.setString(1, cita.getAsunto()); 
            ps.setDate(2, cita.getFecha());
            ps.setDate(3, cita.getHora());
            ps.setDate(4,cita.getFechaCreacion());
            ps.setInt(5, cita.getIdDueño());
            ps.setInt(6, cita.getIdVeterinarios());
            ps.setInt(7, cita.getIdUsuario());
            ps.setString(8, cita.getCedula());
            r = ps.executeUpdate(); 
        }
        catch(SQLException e){
        }
        return r;
    }
    
    public void TraerDueño(Dueño d) {
        
        String id = JOptionPane.showInputDialog("Ingrese el ID del Dueño");
        String sql = "SELECT IdDueno, cedulaDueno FROM dueno WHERE IdDueno=" + id;
        
        try {
            con = conectar.getConecction(); // Abrir conexion con base de datos
            ps = con.prepareStatement(sql); //Peparar el query de sql
            rs = ps.executeQuery();
            if (rs.next()) {
                d.setIdDueno(rs.getInt("IdDueno"));
                d.setCedula(rs.getString("cedulaDueno"));  
            }
        } catch (SQLException e) {
        }
    }
    
    public void TraerVeterinario(Veterinarios vete) {
        
        String id = JOptionPane.showInputDialog("Ingrese el ID del Veterinario");
        String sql = "SELECT IdVeterinario, nombre, apellido1, apellido2 FROM veterinario WHERE IdVeterinario=" + id;
        
        try {
            con = conectar.getConecction(); // Abrir conexion con base de datos
            ps = con.prepareStatement(sql); //Peparar el query de sql
            rs = ps.executeQuery();
            if (rs.next()) {
                vete.setIdVeterinario(rs.getInt("IdVeterinario"));
                vete.setNombre(rs.getString("Nombre"));
                vete.setApellido1(rs.getString("apellido1"));
                vete.setApellido2(rs.getString("apellido2"));    
            }
        } catch (SQLException e) {
        }
    }   
    
    public int actualizarCita(Cita cita) {

        int r = 0;
        //int id = Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Indique el ID CITA"));
        String sql = "UPDATE cita SET asunto=?, fecha=?, hora=?, fechaCreacion=?, IdDueno=?, IdVeterinario=?, IdUsuario=?, CedulaDueno=? WHERE IdCita=11";
        try {
            con = conectar.getConecction();
            ps = con.prepareStatement(sql);
            ps.setString(1, cita.getAsunto()); 
            ps.setDate(2, cita.getFecha());
            ps.setDate(3, cita.getHora());
            ps.setDate(4,cita.getFechaCreacion());
            ps.setInt(5, cita.getIdDueño());
            ps.setInt(6, cita.getIdVeterinarios());
            ps.setInt(7, cita.getIdUsuario());
            ps.setString(8, cita.getCedula());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    
    public int eliminarCita(int id) {

        int r = 0;
        String sql = "DELETE FROM cita WHERE IdCita=" + id;
        try {
            con = conectar.getConecction();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    
public void filtrarTablaPorNombre(JTable table, String filtro) {

        String[] titulos = {"ID CITA", "ASUNTO", "FECHA", "HORA", "FECHA CREACIÓN", "ID DUEÑO", "ID VETERINARIO", "ID USUARIO", "CEDULA DUEÑO"};
        String[] registros = new String[9];
        String sql = "SELECT * FROM cita WHERE fecha LIKE '%" + filtro + "%'";
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConecction();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("IdCita");
                registros[1] = rs.getString("asunto");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("hora");
                registros[4] = rs.getString("fechaCreacion");
                registros[5] = rs.getString("IdDueno");
                registros[6] = rs.getString("IdVeterinario");
                registros[7] = rs.getString("IdUsuario");
                registros[8] = rs.getString("CedulaDueno");
                modelo.addRow(registros);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
    }
}
