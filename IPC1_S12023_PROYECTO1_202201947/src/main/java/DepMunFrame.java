/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pablo Rodriguez
 */
public class DepMunFrame extends javax.swing.JFrame {

    /**
     * Creates new form DepMunFrame
     */
    public DepMunFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("DEPARTAMENTOS Y MUNICIPIOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CregLabel = new javax.swing.JLabel();
        CodRegComboBox = new javax.swing.JComboBox<>();
        gcrButton = new javax.swing.JButton();
        ccrButton1 = new javax.swing.JButton();
        RegionLabel = new javax.swing.JLabel();
        RegionLabel1 = new javax.swing.JLabel();
        DepComboBox = new javax.swing.JComboBox<>();
        RegionLabel2 = new javax.swing.JLabel();
        MunComboBox1 = new javax.swing.JComboBox<>();
        regionTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MANEJO DE DEPARTAMENTOS Y MUNICIPIOS");

        CregLabel.setText("CODIGO DE REGIÓN: ");

        CodRegComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "NT", "NO", "SO", "SOC", "NOC" }));
        CodRegComboBox.setName(""); // NOI18N
        CodRegComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodRegComboBoxActionPerformed(evt);
            }
        });

        gcrButton.setText("GUARDAR");
        gcrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcrButtonActionPerformed(evt);
            }
        });

        ccrButton1.setText("CANCELAR");
        ccrButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccrButton1ActionPerformed(evt);
            }
        });

        RegionLabel.setText("REGIÓN: ");

        RegionLabel1.setText("DEPARTAMENTO");

        DepComboBox.setName(""); // NOI18N
        DepComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepComboBoxActionPerformed(evt);
            }
        });

        RegionLabel2.setText("MUNICIPIO:");

        MunComboBox1.setName(""); // NOI18N
        MunComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MunComboBox1ActionPerformed(evt);
            }
        });

        regionTextField.setEnabled(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(CregLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodRegComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(RegionLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegionLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(DepComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(RegionLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(MunComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(gcrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ccrButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CregLabel)
                            .addComponent(CodRegComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegionLabel)
                            .addComponent(regionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(gcrButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RegionLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DepComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RegionLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MunComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ccrButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodRegComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodRegComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodRegComboBoxActionPerformed

    private void DepComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepComboBoxActionPerformed

    private void MunComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MunComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MunComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminFrame opframe = new AdminFrame();
        opframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gcrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcrButtonActionPerformed
        // TODO add your handling code here:
        CodRegComboBox.setEnabled(false);
        DepComboBox.setEnabled(false);
        MunComboBox1.setEnabled(false);
        
        AdminFrame opframe = new AdminFrame();
        opframe.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_gcrButtonActionPerformed

    private void ccrButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccrButton1ActionPerformed
        // TODO add your handling code here:
        CodRegComboBox.setEnabled(true);
        DepComboBox.setEnabled(true);
        MunComboBox1.setEnabled(true);
    }//GEN-LAST:event_ccrButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DepMunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepMunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepMunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepMunFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepMunFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CodRegComboBox;
    private javax.swing.JLabel CregLabel;
    private javax.swing.JComboBox<String> DepComboBox;
    private javax.swing.JComboBox<String> MunComboBox1;
    private javax.swing.JLabel RegionLabel;
    private javax.swing.JLabel RegionLabel1;
    private javax.swing.JLabel RegionLabel2;
    private javax.swing.JButton ccrButton1;
    private javax.swing.JButton gcrButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField regionTextField;
    // End of variables declaration//GEN-END:variables
}
