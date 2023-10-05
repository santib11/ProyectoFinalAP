
package Controller;

import Model.Mesa;
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
    
    public Mesa buscarMesa(int id) {
        Mesa mesa = null;
        String sql = "SELECT * FROM mesa WHERE idMesa = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(id);
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setCapacidad(rs.getInt("capacidad"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa mesa?=????");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + e.getMessage());
        }
        return mesa;
    }
}
