
package Controller;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserController {
    private static Connection con;
    
    public UserController() {

        con = Conexion.getConexion();
    }
    
    public void altaUser(User user) {

        String sql = "INSERT INTO user (usuario, contraseña) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla User" + ex.getMessage());
        }
    }
    
    public User buscarUser(String username, String password) {
        User user = null;
        String sql = "SELECT idUser FROM user WHERE usuario = ? AND contraseña = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setIdUser(rs.getInt("idUser"));
                user.setUsuario(username);
                user.setPassword(password);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla User " + e.getMessage());
        }
        return user;
    }
    
    public User buscarUserxId(int id) {
        User user = null;
        String sql = "SELECT * FROM user WHERE idUser = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setIdUser(id);
                user.setUsuario(rs.getString("usuario"));
                user.setPassword(rs.getString("contraseña"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla User " + e.getMessage());
        }
        return user;
    }
    
    public boolean existUsuario(String username) {
        boolean ok = false;
        String sql = "SELECT * FROM user WHERE usuario = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ok = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla User " + e.getMessage());
        }
        return ok;
    }
}
