/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author USUARIO
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuVerTodosLosRegistros = new javax.swing.JMenu();
        jMenuAnadirUnidad = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        jMenuEditarUnidad = new javax.swing.JMenu();
        jMenuAnadirReparacion = new javax.swing.JMenu();
        jMenuVer = new javax.swing.JMenu();
        jMenuVerUnidad = new javax.swing.JMenu();
        jMenuVerHistorialReparaciones = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArchivoActionPerformed(evt);
            }
        });

        jMenu1.setText("Abrir Unidad");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuArchivo.add(jMenu1);

        jMenuVerTodosLosRegistros.setText("Ver Todos Los Registros");
        jMenuVerTodosLosRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVerTodosLosRegistrosMouseClicked(evt);
            }
        });
        jMenuArchivo.add(jMenuVerTodosLosRegistros);

        jMenuAnadirUnidad.setText("Añadir Unidad");
        jMenuAnadirUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAnadirUnidadMouseClicked(evt);
            }
        });
        jMenuArchivo.add(jMenuAnadirUnidad);

        jMenuBar1.add(jMenuArchivo);

        jMenuEditar.setText("Editar");

        jMenuEditarUnidad.setText("Editar Unidad");
        jMenuEditar.add(jMenuEditarUnidad);

        jMenuAnadirReparacion.setText("Añadir Reparación");
        jMenuEditar.add(jMenuAnadirReparacion);

        jMenuBar1.add(jMenuEditar);

        jMenuVer.setText("Ver");

        jMenuVerUnidad.setText("Ver Unidad");
        jMenuVer.add(jMenuVerUnidad);

        jMenuVerHistorialReparaciones.setText("Ver Historial de Reparaciones");
        jMenuVer.add(jMenuVerHistorialReparaciones);

        jMenuBar1.add(jMenuVer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArchivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuArchivoActionPerformed

    private void jMenuAnadirUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAnadirUnidadMouseClicked
        // TODO add your handling code here:
        anadirUnidad newFrame = new anadirUnidad();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jMenuAnadirUnidadMouseClicked

    private void jMenuVerTodosLosRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVerTodosLosRegistrosMouseClicked
        // TODO add your handling code here:
        verTodosLosRegistros newFrame = new verTodosLosRegistros();
        newFrame.setVisible(true);
       
    }//GEN-LAST:event_jMenuVerTodosLosRegistrosMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        abrirUnidad frame = new abrirUnidad();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAnadirReparacion;
    private javax.swing.JMenu jMenuAnadirUnidad;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuEditarUnidad;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JMenu jMenuVerHistorialReparaciones;
    private javax.swing.JMenu jMenuVerTodosLosRegistros;
    private javax.swing.JMenu jMenuVerUnidad;
    // End of variables declaration//GEN-END:variables
}
