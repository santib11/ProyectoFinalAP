
package Controller;

import Model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoController {
    private static Connection con;
    
    public ProductoController() {

        con = Conexion.getConexion();
        
    }
    
    //INSERTAR
     public void altaProducto(Producto producto){
        String sql = "INSERT INTO producto (idProducto, precio, nombre, codigo, stock) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getIdProducto());
            ps.setDouble(2, producto.getPrecio());
            ps.setString(3, producto.getNombre());
            ps.setInt(4, producto.getCodigo());
            ps.setInt(5, producto.getStock());
           
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
    }
     
     
    //BUSCAR
    public Producto buscarProducto(int codigo){
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setCodigo(codigo);
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
            }else {
                JOptionPane.showMessageDialog(null, "No existe el producto con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }      
        return producto;
    }
    
    public Producto buscarProductoxCodigo(int codigo){

        Producto producto = null;

        String sql = "SELECT * FROM producto WHERE codigo = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){

                producto = new Producto();

                producto.setIdProducto(rs.getInt("idProducto"));

                producto.setCodigo(codigo);

                producto.setNombre(rs.getString("nombre"));

                producto.setStock(rs.getInt("stock"));

                producto.setPrecio(rs.getDouble("precio"));

            }else {

                JOptionPane.showMessageDialog(null, "No existe el producto con ese codigo");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");

        }      

        return producto;

    }
    
    //BUSCAR TODOS LOS PRODUCTOS
     public List<Producto> listarProductos() {

        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Producto ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();

                producto = new Producto();
              //  producto.setIdProducto(rs.getInt("idProducto"));
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                
                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return productos;
    }

    

public void modificarProducto(Producto producto){

        String sql = "UPDATE producto SET stock = ?, nombre = ?, precio = ? WHERE codigo = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, producto.getStock());

            ps.setString(2, producto.getNombre());

            ps.setDouble(3, producto.getPrecio());

            ps.setInt(4, producto.getCodigo());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");

        }

    }

    public void deleteProducto(int codigo){
       String sql = "DELETE FROM producto WHERE codigo = ?";

       
       try {
            PreparedStatement ps = con.prepareStatement(sql);
          

            ps.setInt(1, codigo);

            
            
            int filas = ps.executeUpdate(); //devuelve cantidad de filas afectadas por el update
            
            if(filas>0){
               JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");
            }
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos ");

        }
       
    }
    
}
