
package View;

import Controller.MeseroController;
import Controller.UserController;
import Model.Mesero;
import Model.User;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    public static Mesero mesero = null;
    
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIAR SESION");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Usuario");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña");

        jButtonLogin.setBackground(new java.awt.Color(204, 204, 204));
        jButtonLogin.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("Ingresar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(204, 204, 204));
        jButtonRegister.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegister.setText("Registrarse");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jPasswordField))))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonLogin)
                .addGap(34, 34, 34)
                .addComponent(jButtonRegister)
                .addGap(274, 274, 274))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegister)
                    .addComponent(jButtonLogin))
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        UserController uController = new UserController();
        MeseroController mController = new MeseroController();
        String username = jTextFieldUsername.getText();
        String password = jPasswordField.getText();
        System.out.println(password);
        User user = uController.buscarUser(username, password);
        if (user != null) {
            mesero = mController.buscarMesero(user.getIdUser());
            this.setVisible(false);
            HomeView hv = new HomeView();
            hv.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña invalido", "Login", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        this.setVisible(false);
        RegisterView rv = new RegisterView();
        rv.setVisible(true);
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
