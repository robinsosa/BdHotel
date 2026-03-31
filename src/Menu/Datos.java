package Menu;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Login.login;

public class Datos extends javax.swing.JFrame {
    public Datos() {
        initComponents();
        cargarDatos(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtdatosarea = new javax.swing.JTextArea();
        btnnuevo = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtdatosarea.setColumns(20);
        jtxtdatosarea.setRows(5);
        jtxtdatosarea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtxtdatosareaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jtxtdatosarea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 24, 258, 261));

        btnnuevo.setBackground(new java.awt.Color(255, 0, 0));
        btnnuevo.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        btnsalir.setBackground(new java.awt.Color(255, 0, 0));
        btnsalir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 81, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        Habitacion hab = new Habitacion();
        hab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jtxtdatosareaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtxtdatosareaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdatosareaAncestorAdded
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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }
        private void cargarDatos() {
    try {
        Connection con = Conexion.conectar();
        
        String sql;
        PreparedStatement ps;
        
        if (login.rolUsuario.equals("admin")) {
            // Admin ve TODOS los clientes
            sql =
                "SELECT c.nombre, c.apellido, c.dni, c.telefono, c.correo, " +
                "h.tipo, h.piso, h.numero, " +
                "r.fecha_ingreso, r.fecha_salida, " +
                "p.tipo AS tipo_pago, p.monto " +
                "FROM clientes c " +
                "JOIN reservas r ON r.id_cliente = c.id " +
                "JOIN habitaciones h ON h.id = r.id_habitacion " +
                "JOIN pagos p ON p.id_reserva = r.id " +
                "ORDER BY r.id DESC";
            ps = con.prepareStatement(sql);
            
        } else {
            // Cliente solo ve SUS datos
            sql =
                "SELECT c.nombre, c.apellido, c.dni, c.telefono, c.correo, " +
                "h.tipo, h.piso, h.numero, " +
                "r.fecha_ingreso, r.fecha_salida, " +
                "p.tipo AS tipo_pago, p.monto " +
                "FROM clientes c " +
                "JOIN reservas r ON r.id_cliente = c.id " +
                "JOIN habitaciones h ON h.id = r.id_habitacion " +
                "JOIN pagos p ON p.id_reserva = r.id " +
                "WHERE c.id = ? " +
                "ORDER BY r.id DESC LIMIT 1";
            ps = con.prepareStatement(sql);
            ps.setInt(1, login.idUsuarioActual);
        }
        
        ResultSet rs = ps.executeQuery();
        StringBuilder resumen = new StringBuilder();
        SimpleDateFormat sdf        = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfMostrar = new SimpleDateFormat("dd/MM/yyyy");
        boolean hayDatos = false;
        
        while (rs.next()) {
            hayDatos = true;
            java.util.Date ingreso = sdf.parse(rs.getString("fecha_ingreso"));
            java.util.Date salida  = sdf.parse(rs.getString("fecha_salida"));
            int dias = (int) ((salida.getTime() - ingreso.getTime()) / (1000 * 60 * 60 * 24));
            
            resumen.append("==============================\n")
                   .append("CLIENTE\n")
                   .append("  Nombre:     ").append(rs.getString("nombre")).append(" ").append(rs.getString("apellido")).append("\n")
                   .append("  DNI:        ").append(rs.getString("dni")).append("\n")
                   .append("  Teléfono:   ").append(rs.getString("telefono")).append("\n")
                   .append("  Correo:     ").append(rs.getString("correo")).append("\n")
                   .append("------------------------------\n")
                   .append("HABITACIÓN\n")
                   .append("  Tipo:       ").append(rs.getString("tipo")).append("\n")
                   .append("  Piso:       ").append(rs.getInt("piso")).append("\n")
                   .append("  Número:     ").append(rs.getInt("numero")).append("\n")
                   .append("------------------------------\n")
                   .append("RESERVA\n")
                   .append("  F. Ingreso: ").append(sdfMostrar.format(ingreso)).append("\n")
                   .append("  F. Salida:  ").append(sdfMostrar.format(salida)).append("\n")
                   .append("  Días:       ").append(dias).append("\n")
                   .append("------------------------------\n")
                   .append("PAGO\n")
                   .append("  Tipo:       ").append(rs.getString("tipo_pago")).append("\n")
                   .append("  Precio/día: S/. 120.00\n")
                   .append("  TOTAL:      S/. ").append(String.format("%.2f", rs.getDouble("monto"))).append("\n")
                   .append("==============================\n\n");
        }
        
        if (!hayDatos) {
            resumen.append("No hay reservas registradas.");
        }
        
        jtxtdatosarea.setText(resumen.toString());
        jtxtdatosarea.setEditable(false);
        con.close();
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtdatosarea;
    // End of variables declaration//GEN-END:variables
}
