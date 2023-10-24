
package View;

import Controller.MeseroController;
import Controller.PedidoController;
import Model.Mesero;
import Model.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministrarView extends javax.swing.JFrame {
    
    private PedidoController pc ;
    private List<Pedido> p;
    private List<Mesero> m;
    private MeseroController meseroControl;
    
    private DefaultTableModel modelPedidos = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            
            return false;
        }
    };

    public AdministrarView() {
        pc = new PedidoController();
        meseroControl= new MeseroController();
        m = (ArrayList)meseroControl.listarMeseros();
       
        
       
        initComponents();
        this.setLocationRelativeTo(null);
         cargarJComboMeseros();
         armarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboMesero = new javax.swing.JComboBox<>();
        jrbPedidosAtendidos = new javax.swing.JRadioButton();
        jrbPedidosCobrados = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jbReportesMesa = new javax.swing.JButton();
        jbReportesIngresos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setText("REPORTES MESERO");

        jLabel2.setText("Seleccionar mesero:");

        jrbPedidosAtendidos.setText("Pedidos atendidos");
        jrbPedidosAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPedidosAtendidosActionPerformed(evt);
            }
        });

        jrbPedidosCobrados.setText("Pedidos cobrados en el día");
        jrbPedidosCobrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPedidosCobradosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jrbPedidosAtendidos)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(63, 63, 63)))
                        .addComponent(jComboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jrbPedidosCobrados)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbPedidosAtendidos)
                    .addComponent(jrbPedidosCobrados))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jbReportesMesa.setText("Reportes Mesa");
        jbReportesMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReportesMesaActionPerformed(evt);
            }
        });

        jbReportesIngresos.setText("Reporte Ingresos");
        jbReportesIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReportesIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbReportesMesa)
                .addGap(34, 34, 34)
                .addComponent(jbReportesIngresos)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jbReportesMesa)
                    .addComponent(jbReportesIngresos))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        HomeView hv = new HomeView();
        hv.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jbReportesMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReportesMesaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ReportesMesaView rmesa = new ReportesMesaView();
        rmesa.setVisible(true);
    }//GEN-LAST:event_jbReportesMesaActionPerformed

    private void jbReportesIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReportesIngresosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ReportesIngresosView ringresos = new ReportesIngresosView();
        ringresos.setVisible(true);
    }//GEN-LAST:event_jbReportesIngresosActionPerformed

    private void jrbPedidosAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPedidosAtendidosActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        jrbPedidosCobrados.setSelected(false);
        pedidosAtendidosXMesero();
    }//GEN-LAST:event_jrbPedidosAtendidosActionPerformed

    private void jrbPedidosCobradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPedidosCobradosActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        jrbPedidosAtendidos.setSelected(false);
        pedidosCobradosXMesero();
    }//GEN-LAST:event_jrbPedidosCobradosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JComboBox<Mesero> jComboMesero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbReportesIngresos;
    private javax.swing.JButton jbReportesMesa;
    private javax.swing.JRadioButton jrbPedidosAtendidos;
    private javax.swing.JRadioButton jrbPedidosCobrados;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {
        modelPedidos.addColumn("ID Pedido");
        modelPedidos.addColumn("ID Mesa");
        modelPedidos.addColumn("Fecha");
        modelPedidos.addColumn("Estado");
        
        jTable1.setModel(modelPedidos);
    }

    private void cargarJComboMeseros(){
        MeseroController mc = new MeseroController();
        List<Mesero> meseros = mc.listarMeseros();
        for (Mesero m : meseros) {
            jComboMesero.addItem(m);
        }
    }
    
    
    
    private void borrarFilas(){
      //getRowCount devuelve el nro total de filas de la tabla, visubles o no
        int filas = jTable1.getRowCount()-1; /*le resto 1 para usar 
ese nro como el indice de la ultima fila, borramas las filas de atras para adelante*/
        
        for(int f=filas; f>=0; f--){
          modelPedidos.removeRow(f);
        }
        
        
    }
    
    
    private void pedidosAtendidosXMesero(){
      try{  
        Mesero meseroSelec = (Mesero)jComboMesero.getSelectedItem();
        p = (ArrayList) pc.pedidosxMesero(meseroSelec.getIdMesero());
        
        for(Pedido item: p){
            
           modelPedidos.addRow(new Object[]{
                
                item.getIdPedido(),                
                item.getMesa().getIdMesa(),
                item.getFecha(),
                item.isEstado()
                
            
            });
           
        }
     }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar datos","Error de datos", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    private void pedidosCobradosXMesero(){
      try{  
        Mesero meseroSelec = (Mesero)jComboMesero.getSelectedItem();
        p = (ArrayList) pc.getPedidosCobradosXMeseroEnElDia(meseroSelec.getIdMesero());
        
        for(Pedido item: p){
            
           modelPedidos.addRow(new Object[]{
                
                item.getIdPedido(),                
                item.getMesa().getIdMesa(),
                item.getFecha()
                
            
            });
           
        }
    }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar datos","Error de datos", JOptionPane.WARNING_MESSAGE);
        }
    }
    


}
