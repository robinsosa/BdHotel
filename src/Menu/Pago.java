package Menu;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Login.login;
import java.util.Date;

public class Pago extends javax.swing.JFrame {
    public Pago() {
        initComponents();
        this.setLocationRelativeTo(this);
        setImageLabel(jLabel1,"src/imagenes/pago.png");
    // Esto manda la imagen al fondo
        jPanel3.setComponentZOrder(jLabel1, 0);
        jPanel3.repaint();
        cargarMonto();
    }
    
    private void cargarMonto() {
    try {
        Connection con = Conexion.conectar();
        
        String sql = "SELECT fecha_ingreso, fecha_salida FROM reservas ORDER BY id DESC LIMIT 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date ingreso = sdf.parse(rs.getString("fecha_ingreso"));
            Date salida  = sdf.parse(rs.getString("fecha_salida"));
            
            long diferencia = salida.getTime() - ingreso.getTime();
            int dias = (int) (diferencia / (1000 * 60 * 60 * 24));
            double total = dias * 120.0;
            
            // Mostrar monto calculado automáticamente
            jtxtmontopago.setText(String.format("%.2f", total));
        }
        con.close();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar monto: " + e.getMessage());
                }
          }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxttipopago = new javax.swing.JTextField();
        jtxtfechapago = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jtxtestadopago = new javax.swing.JTextField();
        btnpagar = new javax.swing.JButton();
        jtxtmontopago = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel10)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("pago");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 152, 120, 79));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setText("Tipo:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 48, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setText("Fecha pago:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 96, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel4.setText("Monto:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 152, -1, -1));
        jPanel3.add(jtxttipopago, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 48, 164, -1));
        jPanel3.add(jtxtfechapago, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 94, 164, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 192, -1, -1));

        jtxtestadopago.setForeground(new java.awt.Color(204, 204, 204));
        jtxtestadopago.setText("Procesando...");
        jtxtestadopago.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel3.add(jtxtestadopago, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 192, 141, -1));

        btnpagar.setBackground(new java.awt.Color(255, 255, 0));
        btnpagar.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        btnpagar.setForeground(new java.awt.Color(255, 255, 255));
        btnpagar.setText("PAGAR");
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });
        jPanel3.add(btnpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 232, -1, -1));
        jPanel3.add(jtxtmontopago, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 152, 147, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
        // TODO add your handling code here:
        String tipo  = jtxttipopago.getText();
    String monto = jtxtmontopago.getText();
    
    // Validar campos
    if (tipo.isEmpty() || jtxtfechapago.getDate() == null || monto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        return;
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String fecha = sdf.format(jtxtfechapago.getDate());
    
    try {
        Connection con = Conexion.conectar();
        
        // Obtener ID de la última reserva
        String sqlRes = "SELECT id FROM reservas ORDER BY id DESC LIMIT 1";
        PreparedStatement psR = con.prepareStatement(sqlRes);
        ResultSet rsR = psR.executeQuery();
        int idReserva = 0;
        if (rsR.next()) idReserva = rsR.getInt("id");
        
        // Guardar pago
        String sql = "INSERT INTO pagos (id_reserva, tipo, fecha, monto) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idReserva);
        ps.setString(2, tipo);
        ps.setString(3, fecha);
        ps.setDouble(4, Double.parseDouble(monto));
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, 
            "Pago registrado correctamente\n" +
            "Tipo: " + tipo + "\n" +
            "Monto: S/. " + monto + "\n\n" +
            "Gracias por su preferencia");
        
        con.close();
        
        // Volver al login
        login log = new login();
        log.setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnpagarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
            image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtxtestadopago;
    private com.toedter.calendar.JDateChooser jtxtfechapago;
    private javax.swing.JFormattedTextField jtxtmontopago;
    private javax.swing.JTextField jtxttipopago;
    // End of variables declaration//GEN-END:variables
}
