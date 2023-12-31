/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controller.ControllerCitas;
import controller.ControllerDueño;
import controller.ControllerMascota;
import controller.ControllerReportes;
import controller.ControllerUsuarios;
import controller.ControllerVeterinarios;
import java.text.ParseException;
import vista.frmAcercaDe;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author 50688
 */
public class frmVentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmVentanaPrincipal
     */
    public frmVentanaPrincipal(int idUsuarios,String nombreUsuario, String tipoUsario) throws ParseException{
        initComponents();
        setLocationRelativeTo(null); //poner la pantalla en el centro 
        this.setExtendedState(MAXIMIZED_BOTH); //maximizar 
        setTitle("MI MASCOTA S.A");
        lblIdUsuario.setText(String.valueOf(idUsuarios));
        lblNombre.setText(nombreUsuario);
        lblTipoUsuario.setText(tipoUsario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        lblIdUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnUsuario = new javax.swing.JMenuItem();
        btnVeterinarios = new javax.swing.JMenuItem();
        btnMascotas = new javax.swing.JMenuItem();
        btnDueño = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnRegistroCitas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnCitasDueño = new javax.swing.JMenuItem();
        btnCitasFecha = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();
        btnAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIdUsuario.setText("id");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("nombre de usurio");

        lblTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoUsuario.setText("tipo usuario");

        jDesktopPane.setLayer(lblIdUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(lblTipoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(lblTipoUsuario))
                .addContainerGap(641, Short.MAX_VALUE))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblIdUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipoUsuario)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jMenuFile.setText("Archivo");

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenuFile.add(btnSalir);

        jMenuBar.add(jMenuFile);

        jMenu1.setText("Catálogo de Datos");

        btnUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUsuario.setText("Usuarios");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnUsuario);

        btnVeterinarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnVeterinarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVeterinarios.setText("Veterinarios");
        btnVeterinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeterinariosActionPerformed(evt);
            }
        });
        jMenu1.add(btnVeterinarios);

        btnMascotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnMascotas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMascotas.setText("Mascota");
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });
        jMenu1.add(btnMascotas);

        btnDueño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnDueño.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDueño.setText("Dueño");
        btnDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueñoActionPerformed(evt);
            }
        });
        jMenu1.add(btnDueño);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Gestión de Procesos");

        btnRegistroCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnRegistroCitas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistroCitas.setText("Registro de Citas");
        btnRegistroCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCitasActionPerformed(evt);
            }
        });
        jMenu2.add(btnRegistroCitas);

        jMenuBar.add(jMenu2);

        jMenu3.setText("Reportes");

        btnCitasDueño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnCitasDueño.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCitasDueño.setText("Citas por dueño");
        btnCitasDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasDueñoActionPerformed(evt);
            }
        });
        jMenu3.add(btnCitasDueño);

        btnCitasFecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnCitasFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCitasFecha.setText("Citas por fecha");
        btnCitasFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasFechaActionPerformed(evt);
            }
        });
        jMenu3.add(btnCitasFecha);

        jMenuBar.add(jMenu3);

        jMenuAcercaDe.setText("Acerca de");
        jMenuAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAcercaDeMouseClicked(evt);
            }
        });
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaDeActionPerformed(evt);
            }
        });

        btnAcercade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnAcercade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAcercade.setText("Acerca de");
        btnAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercadeActionPerformed(evt);
            }
        });
        jMenuAcercaDe.add(btnAcercade);

        jMenuBar.add(jMenuAcercaDe);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAcercaDeMouseClicked
        // TODO add your handling code here:                
    }//GEN-LAST:event_jMenuAcercaDeMouseClicked

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaDeActionPerformed

    }//GEN-LAST:event_jMenuAcercaDeActionPerformed

    private void btnAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercadeActionPerformed
        // TODO add your handling code here:
        frmAcercaDe obj = new frmAcercaDe();
        jDesktopPane.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnAcercadeActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
        frmUsuarios obj = new frmUsuarios();
        jDesktopPane.add(obj);
        ControllerUsuarios con = new ControllerUsuarios(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnVeterinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeterinariosActionPerformed
        // TODO add your handling code here:
        frmVeterinarios obj = new frmVeterinarios();
        jDesktopPane.add(obj);
        ControllerVeterinarios con = new ControllerVeterinarios(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnVeterinariosActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        // TODO add your handling code here:
        frmMascota obj = new frmMascota();
        jDesktopPane.add(obj);
        ControllerMascota con = new ControllerMascota(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueñoActionPerformed
        // TODO add your handling code here:
        frmDueño obj = new frmDueño();
        jDesktopPane.add(obj);
        ControllerDueño con = new ControllerDueño(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnDueñoActionPerformed

    private void btnCitasDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasDueñoActionPerformed
        // TODO add your handling code here:
        frmReportesCedula obj = new frmReportesCedula();
        jDesktopPane.add(obj);
        ControllerReportes con = new ControllerReportes(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCitasDueñoActionPerformed

    private void btnCitasFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasFechaActionPerformed
        // TODO add your handling code here:
        frmReportesFecha obj = new frmReportesFecha();
        jDesktopPane.add(obj);
        ControllerReportes con = new ControllerReportes(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCitasFechaActionPerformed

    private void btnRegistroCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCitasActionPerformed
        // TODO add your handling code here:
        frmRegistrarCitas obj = new frmRegistrarCitas();
        jDesktopPane.add(obj);
        ControllerCitas con = new ControllerCitas(obj);
        con.inicio();
        obj.toFront();// se ponga al frente
        obj.setLocation(jDesktopPane.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnRegistroCitasActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmVentanaPrincipal(Integer.valueOf(lblIdUsuario.getText()), lblNombre.getText(), lblTipoUsuario.getText()).setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(frmVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAcercade;
    private javax.swing.JMenuItem btnCitasDueño;
    private javax.swing.JMenuItem btnCitasFecha;
    private javax.swing.JMenuItem btnDueño;
    private javax.swing.JMenuItem btnMascotas;
    private javax.swing.JMenuItem btnRegistroCitas;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnUsuario;
    private javax.swing.JMenuItem btnVeterinarios;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    public static javax.swing.JLabel lblIdUsuario;
    public static javax.swing.JLabel lblNombre;
    public static javax.swing.JLabel lblTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
