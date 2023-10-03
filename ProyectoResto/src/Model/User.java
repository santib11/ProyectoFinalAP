
package Model;

public class User {
    int idUser;
    String usuario;
    String password;

    public User() {
    }

    public User(int idUser, String usuario, String password) {
        this.idUser = idUser;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
