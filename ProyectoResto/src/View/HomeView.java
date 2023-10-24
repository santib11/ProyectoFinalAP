package View;

import Controller.PedidoController;
import Model.Pedido;
import Model.Producto;
import java.time.LocalDate;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomeView extends javax.swing.JFrame {

    private PedidoController pController = new PedidoController();
    private DefaultListModel modelProductos = new DefaultListModel();
    private DefaultTableModel modelPedidos = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public HomeView() {
        initComponents();
        this.setLocationRelativeTo(null);
        jListProductos.setModel(modelProductos);
        editModelPedidos();
        loadTablePedidos();
        jLabelName.setText("Mesero: " + LoginView.mesero.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonReserva = new javax.swing.JButton();
        jButtonProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButtonCreatePedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProductos = new javax.swing.JList<>();
        jButtonCobrar = new javax.swing.JButton();
        jButtonAdmPedido = new javax.swing.JButton();
        jButtonMesa = new javax.swing.JButton();
        jButtonEntrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelName.setBackground(new java.awt.Color(204, 204, 204));
        jLabelName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(204, 204, 204));
        jLabelName.setText("Mesero:  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelName)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jLabelName))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jButtonReserva.setText("Manejar reservas");
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });

        jButtonProducto.setText("Manejar Productos");
        jButtonProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos actuales");

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);

        jButtonCreatePedido.setText("Nuevo pedido");
        jButtonCreatePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreatePedidoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListProductos);

        jButtonCobrar.setText("Cobrar Pedido");
        jButtonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCobrarActionPerformed(evt);
            }
        });

        jButtonAdmPedido.setText("Administracion");
        jButtonAdmPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmPedidoActionPerformed(evt);
            }
        });

        jButtonMesa.setText("Manejar Mesas");
        jButtonMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMesaActionPerformed(evt);
            }
        });

        jButtonEntrega.setText("Entregar Pedido");
        jButtonEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonCreatePedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jButtonReserva)
                            .addGap(78, 78, 78)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAdmPedido)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButtonMesa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonProducto)
                                    .addGap(90, 90, 90))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(316, 316, 316))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProducto)
                    .addComponent(jButtonReserva)
                    .addComponent(jButtonMesa))
                .addGap(38, 38, 38)
                .addComponent(jButtonAdmPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCreatePedido)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
        this.setVisible(false);
        ReservaView rv = new ReservaView();
        rv.setVisible(true);
    }//GEN-LAST:event_jButtonReservaActionPerformed

    private void jButtonProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductoActionPerformed
        this.setVisible(false);
        ProductoView pv = new ProductoView();
        pv.setVisible(true);
    }//GEN-LAST:event_jButtonProductoActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_NO_OPTION) {
            this.setVisible(false);
            LoginView lv = new LoginView();
            lv.setVisible(true);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        modelProductos.removeAllElements();
        int idPedido = (int) jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 0);
        showProductosOf(idPedido);
        Pedido p = pController.buscarPedido(idPedido);
        jButtonCobrar.setVisible(!p.isCobrado());
        jButtonEntrega.setVisible(!p.isEstado());
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void jButtonAdmPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmPedidoActionPerformed
        this.setVisible(false);
        AdministrarView av = new AdministrarView();
        av.setVisible(true);
    }//GEN-LAST:event_jButtonAdmPedidoActionPerformed

    private void jButtonCreatePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreatePedidoActionPerformed
        this.setVisible(false);
        CreatePedidoView cpv = new CreatePedidoView();
        cpv.setVisible(true);
    }//GEN-LAST:event_jButtonCreatePedidoActionPerformed

    private void jButtonMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMesaActionPerformed
        this.setVisible(false);
        MesaView mv = new MesaView();
        mv.setVisible(true);
    }//GEN-LAST:event_jButtonMesaActionPerformed

    private void jButtonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCobrarActionPerformed
        try {
            int idPedido = (int) jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 0);
            int confirm = JOptionPane.showConfirmDialog(this, "¿Esta seguro de marcar el pedido como cobrado?", "Cobrar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (confirm == JOptionPane.YES_NO_OPTION) {
                pController.cobrarPedido(idPedido);
                JOptionPane.showMessageDialog(null, "Pedido cobrado!! ");
            }
        } catch (Exception e) {
            System.out.println("Seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_jButtonCobrarActionPerformed

    private void jButtonEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntregaActionPerformed
        try {
            int idPedido = (int) jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 0);
            int confirm = JOptionPane.showConfirmDialog(this, "¿Esta seguro de marcar el pedido como entregado?", "Entregar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (confirm == JOptionPane.YES_NO_OPTION) {
                pController.entregarPedido(idPedido);
                JOptionPane.showMessageDialog(null, "Pedido Entregado!! ");
            }
        } catch (Exception e) {
            System.out.println("Seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_jButtonEntregaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmPedido;
    private javax.swing.JButton jButtonCobrar;
    private javax.swing.JButton jButtonCreatePedido;
    private javax.swing.JButton jButtonEntrega;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMesa;
    private javax.swing.JButton jButtonProducto;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JList<String> jListProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables

    private void editModelPedidos() {
        modelPedidos.addColumn("Nro pedido");
        modelPedidos.addColumn("Nro mesa");
        modelPedidos.addColumn("Cobrado");
        modelPedidos.addColumn("Entregado");
        modelPedidos.addColumn("Hora");
        jTablePedidos.setModel(modelPedidos);
    }

    private void loadTablePedidos() {
        for (Pedido p : pController.getAllPedidosOf(LoginView.mesero.getIdMesero(), LocalDate.now())) {
            String cobrado = "Si";
            String estado = "No";
            if (!p.isCobrado()) {
                cobrado = "No";
            }
            if (p.isEstado()) {
                estado = "Si";
            }
            modelPedidos.addRow(new Object[]{
                p.getIdPedido(),
                p.getMesa().getNumero(),
                cobrado,
                estado,
                p.getHora()
            });
        }
    }

    private void showProductosOf(int idPedido) {
        List<String> productosXcant = pController.getAllProductosXCantOfPedido(idPedido);
        for (String item : productosXcant) {
            modelProductos.addElement(item);
        }
    }
}
