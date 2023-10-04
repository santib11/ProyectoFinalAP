
package Controller;

import java.sql.Connection;

public class MeseroController {
    private static Connection con;
    
    public MeseroController() {

        con = Conexion.getConexion();
    }
}
