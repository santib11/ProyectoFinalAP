
package Controller;

import Model.Mesa;
import Model.Mesero;
import Model.Pedido;
import Model.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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
    
    public void ingresarPedido(Pedido pedido, List <Integer> cantidades){
        String sql = "INSERT INTO pedido (idMesa, idMesero, estado, fecha, importe, cobrado, hora) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setBoolean(3, pedido.isEstado());
            ps.setDate(4, Date.valueOf(pedido.getFecha()));
            ps.setDouble(5, pedido.getImporte());
            ps.setBoolean(6, pedido.isCobrado());
            ps.setTime(7,Time.valueOf(pedido.getHora()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido realizado.");
            }
            ps.close();
            int i=0;
            for(Producto p: pedido.getProductos()){
                String sql2 = "INSERT INTO pedidoproducto (idPedido, idProducto, cantidad) VALUES (?,?,?)";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, pedido.getIdPedido());
                ps2.setInt(2, p.getIdProducto());
                ps2.setInt(3, cantidades.get(i));
                ps2.executeUpdate();
                i++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }
    
    public Pedido buscarPedido(int id){
        Pedido pedido = new Pedido();
        try {
            String sql = "SELECT * FROM pedido WHERE idPedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mc.buscarMesaXId(rs.getInt("idMesa"));
                Mesero mesero = meseroc.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedido;
    }
    
    public void entregarPedido (int idPedido){
        String sql = "UPDATE pedido SET estado = 1 WHERE idPedido = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }
    
    public void cobrarPedido(int idPedido){
        String sql = "UPDATE pedido SET cobrado = 1 WHERE idPedido = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }
    
    public List <Pedido> pedidosxFechaxHora(LocalDate fecha, LocalTime hora){
        List<Pedido> pedidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido WHERE fecha = ? AND hora = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ps.setTime(2, Time.valueOf(hora));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mc.buscarMesaXId(rs.getInt("idMesa"));
                Mesero mesero = meseroc.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
    }
    
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
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List <Pedido> pedidosxMesero(int idMesero){
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
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
    }

    public List <Pedido> pedidosxMesa(int idMesa){
        List<Pedido> pedidos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pedido WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mc.buscarMesaXId(rs.getInt("idMesa"));
                Mesero mesero = meseroc.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List <Pedido> pedidosxMeseroxFecha(int idMesero, LocalDate fecha){
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
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List <Pedido> getAllPedidosOf(int idMesero, LocalDate fecha){
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
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List <String> getAllProductosXCantOfPedido(int id){
        List<String> productosXcant = new ArrayList<>();
        try {
            String sql = "SELECT pp.cantidad, pr.nombre FROM pedido p JOIN pedidoproducto pp ON p.idPedido = pp.idPedido JOIN producto pr ON pp.idProducto = pr.idProducto WHERE p.idPedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("nombre");
                int cant = rs.getInt("cantidad");
                String item = name + " (cant: " + cant +")";
                productosXcant.add(item);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return productosXcant;
    }
}
