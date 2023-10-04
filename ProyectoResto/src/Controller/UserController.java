
package Controller;

import java.sql.Connection;

public class UserController {
    private static Connection con;
    
    public UserController() {

        con = Conexion.getConexion();
    }
    
    
}
