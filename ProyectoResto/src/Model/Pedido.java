
package Model;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    int idPedido;
    boolean estado;
    LocalDate fecha;
    Mesa mesa;
    Mesero mesero;
    List<Producto> productos;

    public Pedido() {
    }

    public Pedido(boolean estado, LocalDate fecha, Mesa mesa, Mesero mesero, List<Producto> productos) {
        this.estado = estado;
        this.fecha = fecha;
        this.mesa = mesa;
        this.mesero = mesero;
        this.productos = productos;
    }

    public Pedido(int idPedido, boolean estado, LocalDate fecha, Mesa mesa, Mesero mesero, List<Producto> productos) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.fecha = fecha;
        this.mesa = mesa;
        this.mesero = mesero;
        this.productos = productos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
