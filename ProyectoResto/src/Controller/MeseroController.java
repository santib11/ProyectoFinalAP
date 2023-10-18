
package Controller;

import Model.Mesero;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MeseroController {
    private static Connection con;
    UserController uc = new UserController();
    
    public MeseroController() {

        con = Conexion.getConexion();
    }
    
    public void altaMesero(Mesero mesero) {

        String sql = "INSERT INTO mesero (nombre, dni, idUser) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setInt(2, mesero.getDni());
            ps.setInt(3, mesero.getUser().getIdUser());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero" + ex.getMessage());
        }
    }
    
    public Mesero buscarMesero(int id) {   //no seria x dni?
        Mesero mesero = null;
        String sql = "SELECT idMesero, nombre, dni FROM mesero WHERE idUser = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setDni(rs.getInt("dni"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + e.getMessage());
        }
        return mesero;
    }
    
    public boolean existDni(int dni) {
        boolean ok = false;
        String sql = "SELECT * FROM mesero WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ok = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + e.getMessage());
        }
        return ok;
    }
    
    public void borrarMesero(Mesero mesero){
        String sql = "DELETE FROM mesero WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesero.getDni());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesero eliminada.");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
    }
    
    public List <Mesero> listarMeseros(){
        String sql = "SELECT * FROM mesero";
        ArrayList <Mesero> meseros = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Mesero mesero = new Mesero();
                
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setDni(rs.getInt("dni"));
                User usuario = uc.buscarUserxId(rs.getInt("idUser"));
                mesero.setUser(usuario);
                meseros.add(mesero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
        return meseros;
    }
}
