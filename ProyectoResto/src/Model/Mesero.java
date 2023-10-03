
package Model;

import java.util.List;

public class Mesero {
    int idMesero;
    String nombre;
    int dni;
    List<Pedido> pedidos;
    User user;

    public Mesero() {
    }

    public Mesero(String nombre, int dni, List<Pedido> pedidos, User user) {
        this.nombre = nombre;
        this.dni = dni;
        this.pedidos = pedidos;
        this.user = user;
    }

    public Mesero(int idMesero, String nombre, int dni, List<Pedido> pedidos, User user) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.dni = dni;
        this.pedidos = pedidos;
        this.user = user;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
