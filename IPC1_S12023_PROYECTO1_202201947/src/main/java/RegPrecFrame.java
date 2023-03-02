/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pablo Rodriguez
 */
public class RegPrecFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegPrecFrame
     */
    public RegPrecFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRO DE PRECIOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodRegComboBox = new javax.swing.JComboBox<>();
        gcrButton = new javax.swing.JButton();
        RegionLabel1 = new javax.swing.JLabel();
        GButton = new javax.swing.JButton();
        Cbutton = new javax.swing.JButton();
        RegionLabel2 = new javax.swing.JLabel();
        RegionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CregLabel = new javax.swing.JLabel();
        RegTextField = new javax.swing.JTextField();
        EspTextField = new javax.swing.JTextField();
        peTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CodRegComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "NT", "NO", "SO", "SOC", "NOC" }));
        CodRegComboBox.setName(""); // NOI18N
        CodRegComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodRegComboBoxActionPerformed(evt);
            }
        });

        gcrButton.setText("APLICAR");
        gcrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcrButtonActionPerformed(evt);
            }
        });

        RegionLabel1.setText("PRECIO ESTANDAR:");

        GButton.setText("GUARDAR");
        GButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GButtonActionPerformed(evt);
            }
        });

        Cbutton.setText("CANCELAR");
        Cbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuttonActionPerformed(evt);
            }
        });

        RegionLabel2.setText("PRECIO ESPECIAL:");

        RegionLabel.setText("REGIÓN: ");

        jLabel1.setText("MANEJO DE DEPARTAMENTOS Y MUNICIPIOS");

        CregLabel.setText("CODIGO DE REGIÓN: ");

        RegTextField.setEnabled(false);

        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(CregLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gcrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(GButton, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CodRegComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(RegionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegionLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(RegionLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EspTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CregLabel)
                            .addComponent(CodRegComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegionLabel)
                            .addComponent(RegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(gcrButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Cbutton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RegionLabel1)
                                .addComponent(peTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RegionLabel2)
                                .addComponent(EspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(GButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodRegComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodRegComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodRegComboBoxActionPerformed

    private void GButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GButtonActionPerformed
        // TODO add your handling code here:
        peTextField.setEnabled(false);
        EspTextField.setEnabled(false);
        AdminFrame opframe = new AdminFrame();
        opframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_GButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminFrame opframe = new AdminFrame();
        opframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gcrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcrButtonActionPerformed
        // TODO add your handling code here:
        CodRegComboBox.setEnabled(false);
        RegTextField.setEnabled(false);
        
    }//GEN-LAST:event_gcrButtonActionPerformed

    private void CbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuttonActionPerformed
        // TODO add your handling code here:
        //Dejar todo como estaba
        RegTextField.setEnabled(true);
        peTextField.setEnabled(true);
        EspTextField.setEnabled(true);
        CodRegComboBox.setEnabled(true);

    }//GEN-LAST:event_CbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(RegPrecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegPrecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegPrecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegPrecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegPrecFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cbutton;
    private javax.swing.JComboBox<String> CodRegComboBox;
    private javax.swing.JLabel CregLabel;
    private javax.swing.JTextField EspTextField;
    private javax.swing.JButton GButton;
    private javax.swing.JTextField RegTextField;
    private javax.swing.JLabel RegionLabel;
    private javax.swing.JLabel RegionLabel1;
    private javax.swing.JLabel RegionLabel2;
    private javax.swing.JButton gcrButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField peTextField;
    // End of variables declaration//GEN-END:variables
}
