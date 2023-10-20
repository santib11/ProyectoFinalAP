package View;

import Controller.ReservaController;
import Model.Reserva;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservaView extends javax.swing.JFrame {

    private ReservaController rController = new ReservaController();
    public static Reserva reservaSeleccionada = null;
    
    private DefaultTableModel modelReserva = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ReservaView() {
        initComponents();
        this.setLocationRelativeTo(null);
        editModelReservas();
        loadTableReservas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jButtonCrearReserva = new javax.swing.JButton();
        jButtonTomarReserva = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reservas");

        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableReservas);

        jButtonCrearReserva.setText("Nueva reserva");
        jButtonCrearReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearReservaActionPerformed(evt);
            }
        });

        jButtonTomarReserva.setText("Tomar reserva");
        jButtonTomarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTomarReservaActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Quitar Reserva");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButtonCrearReserva)
                        .addGap(117, 117, 117)
                        .addComponent(jButtonTomarReserva)
                        .addGap(106, 106, 106)
                        .addComponent(jButtonDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTomarReserva)
                    .addComponent(jButtonCrearReserva)
                    .addComponent(jButtonDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButtonBack.setText("Volver");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonBack)
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void jButtonCrearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearReservaActionPerformed
        this.setVisible(false);
        CreateReservaView crv = new CreateReservaView();
        crv.setVisible(true);
    }//GEN-LAST:event_jButtonCrearReservaActionPerformed

    private void jButtonTomarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTomarReservaActionPerformed
        try {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Esta seguro que quiere tomar esta reserva?", "Tomar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (confirm == JOptionPane.YES_NO_OPTION) {
                int idReserva = (int) jTableReservas.getValueAt(jTableReservas.getSelectedRow(), 0);
                reservaSeleccionada = rController.getReserva(idReserva);
                this.setVisible(false);
                CreatePedidoView cpv = new CreatePedidoView();
                cpv.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("Seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_jButtonTomarReservaActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        HomeView hv = new HomeView();
        hv.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Esta seguro que quiere quitar esta reserva?", "Quitar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirm == JOptionPane.YES_NO_OPTION) {
                int idReserva = (int) jTableReservas.getValueAt(jTableReservas.getSelectedRow(), 0);
                rController.bajaReserva(idReserva);
                JOptionPane.showMessageDialog(null, "Reserva cancelada correctamente");
            }
        } catch (Exception e) {
            System.out.println("Seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCrearReserva;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonTomarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservas;
    // End of variables declaration//GEN-END:variables

    private void editModelReservas() {
        modelReserva.addColumn("Nro Reserva");
        modelReserva.addColumn("Nombre");
        modelReserva.addColumn("Dni");
        modelReserva.addColumn("Fecha");
        modelReserva.addColumn("Nro mesa");
        jTableReservas.setModel(modelReserva);
    }

    private void loadTableReservas() {
        for (Reserva r : rController.getAllReserva()) {
            modelReserva.addRow(new Object[]{
                r.getIdReserva(),
                r.getNombre(),
                r.getDni(),
                r.getFecha(),
                r.getMesa().getNumero()
            });
        }
    }
}
