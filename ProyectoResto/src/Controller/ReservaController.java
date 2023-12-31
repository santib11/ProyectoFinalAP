package Controller;

import Model.Mesa;
import Model.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaController {

    private static Connection con;
    private MesaController mController = new MesaController();
    private PedidoController pController = new PedidoController();

    public ReservaController() {

        con = Conexion.getConexion();
    }

    public void altaReserva(Reserva reserva) {
        String sql = "INSERT INTO reserva (nombre, dni, fecha, estado, idMesa) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, reserva.getNombre());
            ps.setInt(2, reserva.getDni());
            ps.setDate(3, Date.valueOf(reserva.getFecha()));
            ps.setBoolean(4, reserva.isEstado());
            ps.setInt(5, reserva.getMesa().getIdMesa());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reserva creada correctamente");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva");
        }
    }
    
    public Reserva getReserva(int id) {
        Reserva reserva = new Reserva();
        try {
            String sql = "SELECT * FROM reserva WHERE idReserva = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getInt("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setMesa(mController.buscarMesaXId(rs.getInt("idMesa")));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return reserva;
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
                reserva.setMesa(mController.buscarMesaXId(rs.getInt("idMesa")));
                reservas.add(reserva);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return reservas;
    }

    public List<Mesa> getMesasDisponiblesDe(LocalDate fecha) {
        List<Mesa> mesas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mesa m WHERE NOT EXISTS (SELECT 1 FROM reserva r WHERE r.idMesa = m.idMesa AND r.estado = 1 AND r.fecha = ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setPedidos(pController.pedidosxMesa(mesa.getIdMesa()));
                mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return mesas;
    }

    public void bajaReserva(int idReserva) {
        String sql = "UPDATE reserva SET estado = 0 WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("Reserva eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva " + ex.getMessage());
        }
    }
}
