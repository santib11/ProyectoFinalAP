
package Controller;

import Model.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaController {
    
    private static Connection con;
    private MesaController mController = new MesaController();
    
    public ReservaController() {

        con = Conexion.getConexion();
    }
    
    public List<Reserva> getAllReserva() {

        List<Reserva> reservas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM reserva WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getInt("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setHora(rs.getTime("hora").toLocalTime());
                reserva.setMesa(mController.buscarMesa(rs.getInt("idMesa")));
                reservas.add(reserva);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return reservas;
    }
    
}
