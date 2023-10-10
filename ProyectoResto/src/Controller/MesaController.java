
package Controller;

import Model.Mesa;
import Model.Mesero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MesaController {
    private static Connection con;
    
    public MesaController() {

        con = Conexion.getConexion();
    }
    
    public void agregarMesa(Mesa mesa){
        String sql = "INSERT INTO mesa (numero, capacidad, estado) VALUES (?,?,?)";
        try {  
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            int exito = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa añadida con exito");
            }
            ps.close();
        }catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Ya existe una mesa con ese numero");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());
        }       
    }
    
    public Mesa buscarMesa(int numero) {
        Mesa mesa = null;
        String sql = "SELECT * FROM mesa WHERE numero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(numero);
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setCapacidad(rs.getInt("capacidad"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa mesa");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + e.getMessage());
        }
        return mesa;
    }
    
    public Mesa buscarMesaXId(int idMesa) {
        Mesa mesa = null;
        String sql = "SELECT * FROM mesa WHERE idMesa = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt(idMesa));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setCapacidad(rs.getInt("capacidad"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa mesa");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + e.getMessage());
        }
        return mesa;
    }
    
    public void modificarMesa(Mesa mesa){
        String sql = "UPDATE mesa SET capacidad = ?, estado = ? WHERE numero = ?"; 
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2, mesa.isEstado());
            ps.setInt(3, mesa.getNumero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe la mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + ex.getMessage());
        }
    }
    
//    public void estadoMesa (Mesa mesa){
//        String sql = "UPDATE mesa SET estado = ? WHERE numero = ?"; //una lista de mesas y dependiendo de la que eliges le llegue un 0 o 1
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//           
//            ps.setBoolean(1, mesa.isEstado());
//            ps.setInt(2, mesa.getNumero());
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se pudo modificar");
//            }
//    ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + ex.getMessage());
//        }
//    }
    
    public void borrarMesa(int numero){
        String sql = "DELETE FROM mesa WHERE numero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa eliminada.");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + ex.getMessage());
        }
    }
    
    public List <Mesa> listarMesas(){
        String sql = "SELECT * FROM mesa";
        ArrayList <Mesa> mesas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Mesa mesa = new Mesa();
                
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MesaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesas;
        
    }
}
