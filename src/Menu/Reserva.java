package Menu;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Reserva extends javax.swing.JFrame {
    public Reserva() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtver = new javax.swing.JTextArea();
        btnver = new javax.swing.JButton();
        btnconfirmar = new javax.swing.JButton();
        datefechareserva = new com.toedter.calendar.JDateChooser();
        datefechaingreso = new com.toedter.calendar.JDateChooser();
        datefechasalida = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reserva");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE RESERVA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("Fecha Reserva:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 53, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Ingreso:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 88, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Fecha Salida:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 133, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Ver:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 168, -1, -1));

        jtxtver.setColumns(20);
        jtxtver.setRows(5);
        jScrollPane1.setViewportView(jtxtver);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 168, -1, -1));

        btnver.setBackground(new java.awt.Color(255, 255, 0));
        btnver.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnver.setForeground(new java.awt.Color(255, 255, 255));
        btnver.setText("Ver...");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        jPanel3.add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        btnconfirmar.setBackground(new java.awt.Color(255, 255, 0));
        btnconfirmar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnconfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirmar.setText("CONFIRMAR");
        btnconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(btnconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 214, -1, -1));
        jPanel3.add(datefechareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 48, 129, -1));
        jPanel3.add(datefechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 88, 148, -1));
        jPanel3.add(datefechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 128, 148, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        // TODO add your handling code here:
        // Verificar que las fechas estén seleccionadas
    if (datefechareserva.getDate() == null || 
        datefechaingreso.getDate() == null || 
        datefechasalida.getDate() == null) {
        JOptionPane.showMessageDialog(null, "Selecciona todas las fechas");
        return;
    }
    
    Date fechaIngreso = datefechaingreso.getDate();
    Date fechaSalida  = datefechasalida.getDate();
    
    // Validar que salida sea después de ingreso
    if (!fechaSalida.after(fechaIngreso)) {
        JOptionPane.showMessageDialog(null, "La fecha de salida debe ser despues del ingreso");
        return;
    }
    
    // Calcular días y monto
    long diferencia = fechaSalida.getTime() - fechaIngreso.getTime();
    int dias = (int) (diferencia / (1000 * 60 * 60 * 24));
    double montoPorDia = 120.0;
    double total = dias * montoPorDia;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    try {
        Connection con = Conexion.conectar();
        
        // Obtener último cliente registrado
        String sqlCliente = "SELECT nombre, apellido FROM clientes ORDER BY id DESC LIMIT 1";
        PreparedStatement psC = con.prepareStatement(sqlCliente);
        ResultSet rsC = psC.executeQuery();
        
        // Obtener última habitación registrada
        String sqlHab = "SELECT numero, piso, tipo FROM habitaciones ORDER BY id DESC LIMIT 1";
        PreparedStatement psH = con.prepareStatement(sqlHab);
        ResultSet rsH = psH.executeQuery();
        
        String resumen = "";
        
        if (rsC.next() && rsH.next()) {
            resumen = 
                "=== RESUMEN DE RESERVA ===\n" +
                "Cliente: " + rsC.getString("nombre") + " " + rsC.getString("apellido") + "\n" +
                "Habitación N°: " + rsH.getInt("numero") + "\n" +
                "Tipo: " + rsH.getString("tipo") + "\n" +
                "Piso: " + rsH.getInt("piso") + "\n" +
                "Fecha Ingreso: " + sdf.format(fechaIngreso) + "\n" +
                "Fecha Salida: " + sdf.format(fechaSalida) + "\n" +
                "Días: " + dias + "\n" +
                "Precio/día: S/. 120.00\n" +
                "TOTAL: S/. " + String.format("%.2f", total);
        }
        
        jtxtver.setText(resumen);
        con.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnverActionPerformed

    private void btnconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarActionPerformed
        // TODO add your handling code here:
        if (datefechareserva.getDate() == null || 
        datefechaingreso.getDate() == null || 
        datefechasalida.getDate() == null) {
        JOptionPane.showMessageDialog(null, "Selecciona todas las fechas");
        return;
    }
    
    if (jtxtver.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Primero presiona Ver... para revisar el resumen");
        return;
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String fechaReserva = sdf.format(datefechareserva.getDate());
    String fechaIngreso = sdf.format(datefechaingreso.getDate());
    String fechaSalida  = sdf.format(datefechasalida.getDate());
    
    try {
        Connection con = Conexion.conectar();
        
        // Obtener ID del último cliente
        String sqlCliente = "SELECT id FROM clientes ORDER BY id DESC LIMIT 1";
        PreparedStatement psC = con.prepareStatement(sqlCliente);
        ResultSet rsC = psC.executeQuery();
        int idCliente = 0;
        if (rsC.next()) idCliente = rsC.getInt("id");
        
        // Obtener ID de la última habitación
        String sqlHab = "SELECT id FROM habitaciones ORDER BY id DESC LIMIT 1";
        PreparedStatement psH = con.prepareStatement(sqlHab);
        ResultSet rsH = psH.executeQuery();
        int idHabitacion = 0;
        if (rsH.next()) idHabitacion = rsH.getInt("id");
        
        // Guardar reserva
        String sql = "INSERT INTO reservas (id_cliente, id_habitacion, fecha_reserva, fecha_ingreso, fecha_salida) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idCliente);
        ps.setInt(2, idHabitacion);
        ps.setString(3, fechaReserva);
        ps.setString(4, fechaIngreso);
        ps.setString(5, fechaSalida);
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Reserva confirmada");
        con.close();
        
        // Abrir Pago
        Pago pag = new Pago();
        pag.setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        if (e.getMessage().contains("Duplicate")) {
            JOptionPane.showMessageDialog(null, "Esta habitación ya está reservada en esas fechas");
        } else {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnconfirmarActionPerformed
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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirmar;
    private javax.swing.JButton btnver;
    private com.toedter.calendar.JDateChooser datefechaingreso;
    private com.toedter.calendar.JDateChooser datefechareserva;
    private com.toedter.calendar.JDateChooser datefechasalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtver;
    // End of variables declaration//GEN-END:variables
}
