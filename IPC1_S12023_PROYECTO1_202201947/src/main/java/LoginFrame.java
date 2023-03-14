
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pablo Rodriguez
 */

public class LoginFrame extends javax.swing.JFrame {
    static long contras;
    static String contrass;
    static UsuariosFrame usu = new UsuariosFrame();
     static String asd;
    public LoginFrame() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("LOGIN");
        UsuariosFrame usu = new UsuariosFrame();
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        ingresarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contrasenaTextField = new javax.swing.JPasswordField();
        contrasenaLabel = new javax.swing.JLabel();
        CrearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("CORREO:");

        nombreTextField.setForeground(new java.awt.Color(153, 153, 153));
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        ingresarButton.setBackground(new java.awt.Color(153, 153, 153));
        ingresarButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        ingresarButton.setForeground(new java.awt.Color(204, 204, 255));
        ingresarButton.setText("INGRESAR");
        ingresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("CONTRASEÑA:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("LOGIN");

        contrasenaTextField.setForeground(new java.awt.Color(153, 153, 153));
        contrasenaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaTextFieldActionPerformed(evt);
            }
        });

        CrearButton.setBackground(new java.awt.Color(153, 153, 153));
        CrearButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        CrearButton.setForeground(new java.awt.Color(204, 204, 255));
        CrearButton.setText("CREAR USUARIO");
        CrearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(contrasenaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contrasenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(ingresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CrearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasenaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingresarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(CrearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void ingresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarButtonActionPerformed
        String usuario =nombreTextField.getText();
        String contra = contrasenaTextField.getText();
        
        asd = nombreTextField.getText();
        
        PerfilUsuarioJFRAME pu = new PerfilUsuarioJFRAME();
        //contrass = pu.jTextField2.getText();
        System.out.println(contrass);
        //contras = Long.parseLong(contrass);*/
        if(nombreTextField.getText().isEmpty()||contrasenaTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacíos, Debe llenar todos los campos."); 
            contrass = "202201947";
        }   
        else if(usuario.equals("ipc1_202201947@ipc1delivery.com") && contra.equals(contrass)){      
            AdminFrame mena = new AdminFrame();
            
            mena.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Bievenido Administrador");
        }else if(!usuario.equals("pablo") && !contra.equals(contrass)){
          
            boolean existe=false;
            for (int i=0;i<AppState.listaUsuario.size();i++){
                if (nombreTextField.getText().toString().equals(AppState.listaUsuario.get(i).getcorreo().toString())==true||contrasenaTextField.getText().toString().equals(AppState.listaUsuario.get(i).getpassword().toString())==true){
                    existe=true;
                    break;
                }
            }
            if(existe){
                boolean validarUsuario=false;
                for (int i=0;i<AppState.listaUsuario.size();i++){
                    if (nombreTextField.getText().toString().equals(AppState.listaUsuario.get(i).getcorreo().toString())==true&&contrasenaTextField.getText().toString().equals(AppState.listaUsuario.get(i).getpassword().toString())==true){
                        validarUsuario=true;
                        break;
                    }
                }
                if(validarUsuario){
                    for (int i=0;i<AppState.listaUsuario.size();i++){
                    if (AppState.listaUsuario.get(i).getrol().toString().equals("Admin")){
                    AdminFrame af = new AdminFrame();
                    af.setVisible(true);
                    String correo1 = nombreTextField.getText();
                    dispose();
                    JOptionPane.showMessageDialog(null, "Bievenido Admin");
                    }
                    else if (AppState.listaUsuario.get(i).getrol().toString().equals("Kiosco")){
                    UsuarioMenuJFRAME ASD = new UsuarioMenuJFRAME();
                    ASD.setVisible(true);
                    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                    String correo1 = nombreTextField.getText();
                    dispose();
                    JOptionPane.showMessageDialog(null, "Bievenido Usuario");
                    }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Correo | Contraseña Incorrecta");   
                }
            }else{
                JOptionPane.showMessageDialog(null, "El correo no está registrado");
                nombreTextField.setText(null);
                contrasenaTextField.setText(null);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Correo | Contraseña Incorrecta");   
        }
    }//GEN-LAST:event_ingresarButtonActionPerformed

    private void contrasenaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaTextFieldActionPerformed

    private void CrearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearButtonActionPerformed
        // TODO add your handling code here:
        UsuariosFrame ADMI = new UsuariosFrame();
        ADMI.setVisible(true);
        dispose();
        ADMI.adminRadioButton.setVisible(false);
    }//GEN-LAST:event_CrearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearButton;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JPasswordField contrasenaTextField;
    private javax.swing.JButton ingresarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField nombreTextField;
    // End of variables declaration//GEN-END:variables
}
