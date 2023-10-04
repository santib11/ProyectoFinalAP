
package View;

public class HomeView extends javax.swing.JFrame {

    public HomeView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonReserva = new javax.swing.JButton();
        jButtonPedido = new javax.swing.JButton();
        jButtonProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jLabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUserMouseClicked(evt);
            }
        });

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUser)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUser)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jButtonReserva.setText("Manejar reservas");
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });

        jButtonPedido.setText("Manejar pedidos");
        jButtonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidoActionPerformed(evt);
            }
        });

        jButtonProducto.setText("Manejar Productos");
        jButtonProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButtonReserva)
                .addGap(84, 84, 84)
                .addComponent(jButtonProducto)
                .addGap(81, 81, 81)
                .addComponent(jButtonPedido)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReserva)
                    .addComponent(jButtonProducto)
                    .addComponent(jButtonPedido))
                .addContainerGap(461, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserMouseClicked
        this.setVisible(false);
        UserView uv = new UserView();
        uv.setVisible(true);
    }//GEN-LAST:event_jLabelUserMouseClicked

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
        this.setVisible(false);
        ReservaView rv = new ReservaView();
        rv.setVisible(true);
    }//GEN-LAST:event_jButtonReservaActionPerformed

    private void jButtonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPedidoActionPerformed

    private void jButtonProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductoActionPerformed
        this.setVisible(false);
        ProductoView pv = new ProductoView();
        pv.setVisible(true);
    }//GEN-LAST:event_jButtonProductoActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.setVisible(false);
        LoginView lv = new LoginView();
        lv.setVisible(true);
    }//GEN-LAST:event_jButtonExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPedido;
    private javax.swing.JButton jButtonProducto;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
