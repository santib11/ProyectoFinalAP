
package Controller;

public class PedidoController {
    
<<<<<<< Updated upstream
=======
    public PedidoController() {

        con = Conexion.getConexion();
    }
    
    public void ingresarPedido(Pedido pedido){
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }
    
    public void entregarPedido (int idPedido){
        String sql = "UPDATE pedido SET estado = 0 WHERE idPedido = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }
    
    public void cobrarPedido(int idPedido){
        String sql = "UPDATE pedido SET cobrado = 0 WHERE idPedido = ?";
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
            String sql = "SELECT * FROM pedido WHERE idMesero = ? AND fecha = ? AND estado = 1";
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
    
    
    
    //PEDIDOS QUE COBRO UN MESERO EN EL DIA
      public List<Pedido> getPedidosCobradosXMeseroEnElDia(int idMesero){
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        
        String sql = "SELECT * FROM pedido WHERE idMesero = ? AND estado = 1 AND cobrado = 1 AND DATE(FECHA) >= DATE(NOW())";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,idMesero);
            ResultSet rs = ps.executeQuery(); 
            
            while(rs.next()){
            Pedido pedido = new Pedido();
            pedido.setIdPedido(rs.getInt("idPedido"));
            Mesero mese = meseroc.buscarMesero(rs.getInt("idMesero"));
            Mesa mesa = mc.buscarMesa(rs.getInt("idMesa"));
           // Mesa produ = producont.buscarMesaId(rs.getInt("idProducto"));
            pedido.setMesero(mese);
            pedido.setMesa(mesa);
           // pedido.setProducto(produ);
            
            listaPedidos.add(pedido); 
            
            
               
            }
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");

        }
        
        return listaPedidos;
    }
    
    
      
      // LISTAR LOS PEDIDOS QUE HA HECHO UNA MESA EN UNA FECHA ENTRE HORAS
     public List<Pedido> obtenerPedidosXMesaXFechaHoras(int idMesa, LocalDate fecha, LocalTime hora1,LocalTime hora2){
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        
        String sql = "SELECT * FROM pedido WHERE idMesa = ?  AND fecha=? AND hora BETWEEN ? AND ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,idMesa);
          ps.setDate(2, Date.valueOf(fecha));    //localDate a Date
          ps.setTime(3,Time.valueOf(hora1));
          ps.setTime(4,Time.valueOf(hora2));
            ResultSet rs = ps.executeQuery(); 
            
            while(rs.next()){
            Pedido pedido = new Pedido();
            pedido.setIdPedido(rs.getInt("idPedido"));
            Mesa mesa = mc.buscarMesa(rs.getInt("idMesa"));
            Mesero mese = meseroc.buscarMesero(rs.getInt("idMesero"));
            pedido.setMesa(mesa);
            pedido.setMesero(mese);
            
            pedido.setEstado(rs.getBoolean("estado"));
            pedido.setFecha(rs.getDate("fecha").toLocalDate());
            pedido.setImporte(rs.getDouble("importe"));
            pedido.setCobrado(rs.getBoolean("cobrado"));
            pedido.setHora(rs.getTime("hora").toLocalTime());
            
           
            
           
            
            listaPedidos.add(pedido); 
            
            
               
            }
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido ");

        }
        
        return listaPedidos;
    }
    
    
>>>>>>> Stashed changes
}
