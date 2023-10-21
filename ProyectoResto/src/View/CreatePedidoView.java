
package View;

import Controller.MesaController;
import Controller.MeseroController;
import Controller.PedidoController;
import Controller.ProductoController;
import Controller.ReservaController;
import Model.Mesa;
import Model.Mesero;
import Model.Pedido;
import Model.Producto;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CreatePedidoView extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    private static double suma = 0;
    private static MesaController mesac = new MesaController();
    private static MeseroController mc = new MeseroController();
    private static ProductoController pc = new ProductoController();
    private static PedidoController pedidoc = new PedidoController();
    private static ReservaController rController = new ReservaController();
    
    public CreatePedidoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        armarCabecera();
        armarCombosBoxs();
        borrarFilas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcMesa = new javax.swing.JComboBox<>();
        jcProducto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtImporte = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jcStock = new javax.swing.JComboBox<>();
        jbAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButtonBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonBack)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Mesa:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Producto:");

        jcProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductoActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTabla);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Importe:");

        jtImporte.setEditable(false);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbQuitar.setText("Quitar");
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(329, 329, 329))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcMesa, 0, 175, Short.MAX_VALUE)
                            .addComponent(jcProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jcStock, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAgregar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtImporte))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbQuitar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbQuitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbCancelar))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        HomeView Hv = new HomeView();
        Hv.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jcProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductoActionPerformed
        // TODO add your handling code here:
        jcStock.removeAllItems();
        Producto prod = new Producto();
        prod = (Producto)jcProducto.getSelectedItem();
        actualizarStockTabla(prod.getStock());
    }//GEN-LAST:event_jcProductoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        borrarFilas();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
        // TODO add your handling code here:
        int filaselec = jtTabla.getSelectedRow();
        if (filaselec !=-1){
            int stock = jcStock.getItemCount();
            stock += (Integer)jtTabla.getValueAt(jtTabla.getSelectedRow(), 3);
            suma -= ((Double)jtTabla.getValueAt(jtTabla.getSelectedRow(), 2) * (Integer)jtTabla.getValueAt(jtTabla.getSelectedRow(), 3));
            jtImporte.setText(suma+"");
            modelo.removeRow(filaselec);
            actualizarStockTabla(stock);
        }
    }//GEN-LAST:event_jbQuitarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        List <Integer> cantidades = new ArrayList<>();
        List <Producto> productos = new ArrayList<>();
        
        for(int i = 0; i<jtTabla.getRowCount(); i++){
            cantidades.add((Integer)jtTabla.getValueAt(i, 3));
        }
        for(int i = 0; i<jtTabla.getRowCount(); i++){
            
            int codigo = (Integer)jtTabla.getValueAt(i, 0);
            Producto produc = pc.buscarProductoxCodigo(codigo);
            productos.add(produc);
        }
        actualizarStock(productos, cantidades);
        
        Mesa mesa =(Mesa) jcMesa.getSelectedItem();
        Mesero mesero = LoginView.mesero;
        boolean estado = false;
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        double importe = Double.parseDouble(jtImporte.getText());
        boolean cobrado = false;
        
        Pedido ped = new Pedido(estado, fecha, hora, mesa, mesero, productos, importe, cobrado);
        pedidoc.ingresarPedido(ped, cantidades);
        if (ReservaView.reservaSeleccionada != null) {  // Si hay reserva seleccionada, eliminar reserva.
            rController.bajaReserva(ReservaView.reservaSeleccionada.getIdReserva());
        }
        borrarFilas();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        Producto prod = new Producto();
        prod = (Producto)jcProducto.getSelectedItem();
        int cantidad = (Integer) jcStock.getSelectedItem();
        if(modelo.getRowCount() != 0){
            for(int i = 0; i<modelo.getRowCount(); i++){
                if(prod.getCodigo() == (Integer)modelo.getValueAt(i, 0)){
                    modelo.setValueAt((Integer)modelo.getValueAt(i, 3)+cantidad, i, 3);
                    break;
                }else if(i == modelo.getRowCount()-1){
                    modelo.addRow(new Object[]{prod.getCodigo(), prod.getNombre(), prod.getPrecio(), cantidad});
                    break;
                }
            }
        }else{
        modelo.addRow(new Object[]{prod.getCodigo(), prod.getNombre(), prod.getPrecio(), cantidad});
        }
        prod.setStock(prod.getStock()-cantidad);
        jcStock.removeAllItems();
        actualizarStockTabla(prod.getStock());
        double valor = prod.getPrecio()*cantidad;
        suma+=valor;
        jtImporte.setText(suma+"");
    }//GEN-LAST:event_jbAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<Mesa> jcMesa;
    private javax.swing.JComboBox<Producto> jcProducto;
    private javax.swing.JComboBox<Integer> jcStock;
    private javax.swing.JTextField jtImporte;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        jtTabla.setModel(modelo);
    }
    
    private void armarCombosBoxs(){
        for(Mesa mesa: mesac.listarMesas()){
            jcMesa.addItem(mesa);
        }
        
        for(Producto producto : pc.listarProductos()){
            jcProducto.addItem(producto);
        }
    }
    
    private void borrarFilas(){
        int f=jtTabla.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
        jtImporte.setText("");
        suma = 0;
    }
    
    private void actualizarStockTabla(int stock){
        for(int i = 1;i <= stock;i++){
            jcStock.addItem(i);
        }
        if (jcStock.getItemCount()!=0){
            jbAgregar.setVisible(true);
            jcStock.setVisible(true);
        }else{
            jbAgregar.setVisible(false);
            jcStock.setVisible(false);
        }
    }
    
    private void actualizarStock(List <Producto> productos, List <Integer> cantidad){
        int i=0;
        for(Producto p: productos){
            p.setStock(p.getStock()-cantidad.get(i));
            pc.modificarProducto(p);
            i++;
        }
    }
}
