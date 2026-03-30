package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    
    // Datos de tu base de datos
    private static final String URL    = "jdbc:mysql://localhost:3306/hotel";
    private static final String USER   = "root";
    private static final String PASS   = ""; 
    
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion exitosa...");
            return con;
            
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}