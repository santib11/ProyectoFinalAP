
package Model;

import java.util.List;

public class Mesero {
    int idMesero;
    String nombre;
    int dni;
    List<Pedido> pedidos;

    public Mesero() {
    }

    public Mesero(String nombre, int dni, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.dni = dni;
        this.pedidos = pedidos;
    }

    public Mesero(int idMesero, String nombre, int dni, List<Pedido> pedidos) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.dni = dni;
        this.pedidos = pedidos;
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
    
    
}
