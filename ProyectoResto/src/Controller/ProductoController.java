
package Controller;

import java.sql.Connection;

public class ProductoController {
    private static Connection con;
    
    public ProductoController() {

        con = Conexion.getConexion();
    }
    
    
}
