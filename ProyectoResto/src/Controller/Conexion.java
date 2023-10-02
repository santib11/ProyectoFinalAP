
package Controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "resto";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
        
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
            }catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver"+e.getMessage());
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion"+ex.getMessage());
            }
        }
        return connection;
    }
}
