/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import com.example.App;

/**
 *
 * @author davidflores
 */
public class InicioPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InicioPrincipal
     */
    public InicioPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        iniciarPartida = new javax.swing.JButton();
        comoJugar = new javax.swing.JButton();
        configuracion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        fondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittle.setFont(new java.awt.Font("Devanagari MT", 1, 48)); // NOI18N
        tittle.setText("WEREWOLF GAME");
        jPanel1.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        iniciarPartida.setText("INICIAR PARTIDA ");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 160, 60));

        comoJugar.setText("COMO JUGAR");
        comoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoJugarActionPerformed(evt);
            }
        });
        jPanel1.add(comoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 160, 60));

        configuracion.setText("CONFIGURACION ");
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });
        jPanel1.add(configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 160, 60));

        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoInicio1.jpeg"))); // NOI18N
        jPanel1.add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
        // TODO add your handling code here:
        AsignacionDeJugadores AdJPanel = new AsignacionDeJugadores();
        AdJPanel.setVisible(true);
        App.sendMessage("Iniciar Partida");
        dispose();
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    private void comoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comoJugarActionPerformed
        // TODO add your handling code here:
        ComoJugar CJPanel = new ComoJugar();
        CJPanel.setVisible(true);
        App.sendMessage("Entrando a 'Como Jugar'");
        
        dispose();
    }//GEN-LAST:event_comoJugarActionPerformed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed
        // TODO add your handling code here:
        ConfiguracionMenu CMPanel = new ConfiguracionMenu();
        CMPanel.setVisible(true);
        App.sendMessage("Entrando a configuracion");
        
        dispose();
    }//GEN-LAST:event_configuracionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        App.sendMessage("Cliente desconectando por el boton de salir");
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(InicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton comoJugar;
    private javax.swing.JButton configuracion;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
