/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author davidflores
 */
public class ConfiguracionMenu extends javax.swing.JFrame {

    /**
     * Creates new form ConfiguracionMenu
     */
    public ConfiguracionMenu() {
        initComponents();
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
        FondoMenu = new javax.swing.JPanel();
        checkBoxMusica = new javax.swing.JCheckBox();
        checkBoxSFX = new javax.swing.JCheckBox();
        CBTamanioRel = new javax.swing.JComboBox<>();
        CBTamanioP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));

        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoMenu.setPreferredSize(new java.awt.Dimension(1080, 720));

        checkBoxMusica.setText("Musica");
        checkBoxMusica.setMaximumSize(new java.awt.Dimension(100, 50));
        checkBoxMusica.setMinimumSize(new java.awt.Dimension(100, 50));
        checkBoxMusica.setPreferredSize(new java.awt.Dimension(100, 50));
        checkBoxMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMusicaActionPerformed(evt);
            }
        });

        checkBoxSFX.setText("SFX");
        checkBoxSFX.setMaximumSize(new java.awt.Dimension(100, 50));
        checkBoxSFX.setMinimumSize(new java.awt.Dimension(100, 50));
        checkBoxSFX.setPreferredSize(new java.awt.Dimension(100, 50));
        checkBoxSFX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSFXActionPerformed(evt);
            }
        });

        CBTamanioRel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "1080x720", "800x6" }));
        CBTamanioRel.setToolTipText("");

        CBTamanioP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Full Screen", "Windows" }));

        jLabel1.setText("Modo de Pantalla");

        jLabel2.setText("Resolucion");

        javax.swing.GroupLayout FondoMenuLayout = new javax.swing.GroupLayout(FondoMenu);
        FondoMenu.setLayout(FondoMenuLayout);
        FondoMenuLayout.setHorizontalGroup(
            FondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(196, 196, 196))
            .addGroup(FondoMenuLayout.createSequentialGroup()
                .addGroup(FondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoMenuLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(checkBoxMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(checkBoxSFX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoMenuLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(FondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBTamanioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBTamanioRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoMenuLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        FondoMenuLayout.setVerticalGroup(
            FondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoMenuLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(FondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxSFX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CBTamanioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBTamanioRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jPanel1.add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 440, 440));

        tittle.setFont(new java.awt.Font("Devanagari MT", 1, 48)); // NOI18N
        tittle.setText("WEREWOLF GAME");
        jPanel1.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        btnVolver.setText("Regresar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoInicio1.jpeg"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(1080, 720));
        fondo.setMinimumSize(new java.awt.Dimension(1080, 720));
        fondo.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1010));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxMusicaActionPerformed

    private void checkBoxSFXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSFXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxSFXActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        InicioPrincipal btnVolverObj = new InicioPrincipal();
        btnVolverObj.show();
        
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracionMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTamanioP;
    private javax.swing.JComboBox<String> CBTamanioRel;
    private javax.swing.JPanel FondoMenu;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox checkBoxMusica;
    private javax.swing.JCheckBox checkBoxSFX;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}