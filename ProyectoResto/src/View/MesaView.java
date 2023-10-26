package View;

import Controller.MesaController;
import Model.Mesa;
import javax.swing.table.DefaultTableModel;

public class MesaView extends javax.swing.JFrame {

    private MesaController mController = new MesaController();
    private DefaultTableModel modelMesa = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public MesaView() {
        initComponents();
        this.setLocationRelativeTo(null);
        editModelMesas();
        loadTableMesas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMesas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbAdministrar = new javax.swing.JButton();
        jbOcuparMesa = new javax.swing.JButton();
        jbLiberarMesa = new javax.swing.JButton();

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
                .addGap(14, 14, 14)
                .addComponent(jButtonBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonBack)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jTableMesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMesas);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Mesas");

        jbAdministrar.setText("Administrar mesas");
        jbAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdministrarActionPerformed(evt);
            }
        });

        jbOcuparMesa.setText("Ocupar mesa");
        jbOcuparMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOcuparMesaActionPerformed(evt);
            }
        });

        jbLiberarMesa.setText("Liberar mesa");
        jbLiberarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLiberarMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbAdministrar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLiberarMesa)
                    .addComponent(jbOcuparMesa))
                .addGap(321, 321, 321))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbAdministrar)
                .addGap(18, 18, 18)
                .addComponent(jbOcuparMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLiberarMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        HomeView hv = new HomeView();
        hv.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jbAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdministrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CreateMesaView mv = new CreateMesaView();
        mv.setVisible(true);
    }//GEN-LAST:event_jbAdministrarActionPerformed

    private void jbOcuparMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOcuparMesaActionPerformed
        try {
            int numero = (int) jTableMesas.getValueAt(jTableMesas.getSelectedRow(), 0);
            Mesa m = mController.buscarMesa(numero);
            mController.estadoMesa(m);
        } catch (Exception e) {
            System.out.println("Seleccione un elemento de la tabla");
        }

    }//GEN-LAST:event_jbOcuparMesaActionPerformed

    private void jbLiberarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLiberarMesaActionPerformed
        int numero = (int) jTableMesas.getValueAt(jTableMesas.getSelectedRow(), 0);
        mController.estadoMesa(mController.buscarMesa(numero));
    }//GEN-LAST:event_jbLiberarMesaActionPerformed

    private void jTableMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMesasMouseClicked
        int numero = (int) jTableMesas.getValueAt(jTableMesas.getSelectedRow(), 0);
        Mesa m = mController.buscarMesa(numero);
        jbLiberarMesa.setVisible(!m.isEstado());
        jbOcuparMesa.setVisible(m.isEstado());
    }//GEN-LAST:event_jTableMesasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMesas;
    private javax.swing.JButton jbAdministrar;
    private javax.swing.JButton jbLiberarMesa;
    private javax.swing.JButton jbOcuparMesa;
    // End of variables declaration//GEN-END:variables

    private void editModelMesas() {
        modelMesa.addColumn("Numero");
        modelMesa.addColumn("Capacidad");
        modelMesa.addColumn("Estado");
        jTableMesas.setModel(modelMesa);
    }

    private void loadTableMesas() {
        for (Mesa m : mController.listarMesas()) {
            String estado = "Libre";
            if (!m.isEstado()) {
                estado = "Ocupado";
            }
            modelMesa.addRow(new Object[]{
                m.getNumero(),
                m.getCapacidad(),
                estado
            });
        }
    }
}
