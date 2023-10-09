
package Controller;

import Model.Mesa;
import Model.Mesero;
import Model.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoController {
    private static Connection con;
    MesaController mc = new MesaController();
    MeseroController meseroc = new MeseroController(); 
    
    public PedidoController() {

        con = Conexion.getConexion();
    }
    
    public void ingresarPedido(Pedido pedido){
        String sql = "INSERT INTO pedido (idMesa, idProducto, idMesero, estado, fecha, importe) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            //ps.setInt(2, pedido.getProductos()); //tener un atributo producto
            ps.setInt(3, pedido.getMesero().getIdMesero());
            ps.setBoolean(4, pedido.isEstado());
            ps.setDate(5, Date.valueOf(pedido.getFecha()));
            ps.setDouble(6, pedido.getImporte());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido realizado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }
    
    //falta la lista x hora
    
    public List <Pedido> pedidosxFecha(LocalDate fecha){
        List<Pedido> pedidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido WHERE fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mc.buscarMesaXId(rs.getInt("idMesa"));
                Mesero mesero = meseroc.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                //faltaidProducto
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List <Pedido> pedidosXMesero(int idMesero){
        List<Pedido> pedidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido WHERE idMesero = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mc.buscarMesaXId(rs.getInt("idMesa"));
                Mesero mesero = meseroc.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                //faltaidProducto
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List <Pedido> pedidosXMeseroxFecha(int idMesero, LocalDate fecha){
        List<Pedido> pedidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido WHERE idMesero = ? AND fecha = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ps.setDate(2,Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mc.buscarMesaXId(rs.getInt("idMesa"));
                Mesero mesero = meseroc.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                //faltaidProducto
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return pedidos;
    }
    
    
}
