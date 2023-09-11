/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadulp.views;

import universidadulp.Views.InscripcionesView;

/**
 *
 * @author Kaniory
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormAlumno = new javax.swing.JMenuItem();
        jmFormularioMateria = new javax.swing.JMenu();
        jmFormMateria = new javax.swing.JMenuItem();
        jmManejoInscripciones = new javax.swing.JMenu();
        jmManejoInscripcion = new javax.swing.JMenuItem();
        jmManipNotas = new javax.swing.JMenuItem();
        sd = new javax.swing.JMenu();
        jmAlumnoxMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpMainLayout = new javax.swing.GroupLayout(jdpMain);
        jdpMain.setLayout(jdpMainLayout);
        jdpMainLayout.setHorizontalGroup(
            jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jdpMainLayout.setVerticalGroup(
            jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmFormAlumno.setText("Formulario de Alumno");
        jmFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormAlumno);

        jMenuBar1.add(jMenu1);

        jmFormularioMateria.setText("Materia");
        jmFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriaActionPerformed(evt);
            }
        });

        jmFormMateria.setText("Formulario de Materia");
        jmFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormMateriaActionPerformed(evt);
            }
        });
        jmFormularioMateria.add(jmFormMateria);

        jMenuBar1.add(jmFormularioMateria);

        jmManejoInscripciones.setText("Administración");

        jmManejoInscripcion.setText("Manejo de Inscripciones");
        jmManejoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionActionPerformed(evt);
            }
        });
        jmManejoInscripciones.add(jmManejoInscripcion);

        jmManipNotas.setText("Manipulacion de notas");
        jmManejoInscripciones.add(jmManipNotas);

        jMenuBar1.add(jmManejoInscripciones);

        sd.setText("Consultas");

        jmAlumnoxMateria.setText("Alumnos por materia");
        sd.add(jmAlumnoxMateria);

        jMenuBar1.add(sd);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormAlumnoActionPerformed
        // TODO add your handling code here:
        jdpMain.removeAll();
        jdpMain.repaint();
        GestionAlumno p = new GestionAlumno();
        p.setVisible(true);
        jdpMain.add(p);
        jdpMain.moveToFront(p);
    }//GEN-LAST:event_jmFormAlumnoActionPerformed

    private void jmManejoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionActionPerformed
        // TODO add your handling code here:
        jdpMain.removeAll();
        jdpMain.repaint();
        InscripcionesView iview = new InscripcionesView();
        iview.setVisible(true);
        jdpMain.add(iview);
        jdpMain.moveToFront(iview);
    }//GEN-LAST:event_jmManejoInscripcionActionPerformed

    private void jmFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriaActionPerformed
        //IGNOREN ESTE METODO
    }//GEN-LAST:event_jmFormularioMateriaActionPerformed

    private void jmFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormMateriaActionPerformed
        // TODO add your handling code here:
        jdpMain.removeAll();
        jdpMain.repaint();
        GestionMaterias gM = new GestionMaterias();
        gM.setVisible(true);
        jdpMain.add(gM);
        jdpMain.moveToFront(gM);
    }//GEN-LAST:event_jmFormMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpMain;
    private javax.swing.JMenuItem jmAlumnoxMateria;
    private javax.swing.JMenuItem jmFormAlumno;
    private javax.swing.JMenuItem jmFormMateria;
    private javax.swing.JMenu jmFormularioMateria;
    private javax.swing.JMenuItem jmManejoInscripcion;
    private javax.swing.JMenu jmManejoInscripciones;
    private javax.swing.JMenuItem jmManipNotas;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu sd;
    // End of variables declaration//GEN-END:variables
}
