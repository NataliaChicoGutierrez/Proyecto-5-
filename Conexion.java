/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Conexion {

    Connection ccn = null;
    Statement st = null;

    public Conexion() {

        try {
            String rutaFile;
            rutaFile = "./DB/VeterinariaDB1.accdb";
            String url = "jdbc:ucanaccess://" + rutaFile;
            ccn = DriverManager.getConnection(url);
            st = ccn.createStatement();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERROR DE CONEXION" + e);
        }
    }

    public Connection getConecction() {
        return ccn;
    }

    public void desconexion() {

        try {
            ccn.close();
            System.exit(0);
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERROR DE DESCONEXION" + e);
        }
    }
}
