
package Controller;

import Model.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MesaController {
    private static Connection con;
    
    public MesaController() {

        con = Conexion.getConexion();
    }
    
}
