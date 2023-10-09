
package Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Pedido {
    private int idPedido;
    private boolean estado;
    private LocalDate fecha;
    private LocalTime hora;
    private Mesa mesa;
    private Mesero mesero;
    private List<Producto> productos;
    private double importe;
    private boolean cobrado;

    public Pedido() {
    }

    public Pedido(boolean estado, LocalDate fecha, LocalTime hora, Mesa mesa, Mesero mesero, List<Producto> productos, double importe, boolean cobrado) {
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.mesero = mesero;
        this.productos = productos;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public Pedido(int idPedido, boolean estado, LocalDate fecha, LocalTime hora, Mesa mesa, Mesero mesero, List<Producto> productos, double importe, boolean cobrado) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.mesero = mesero;
        this.productos = productos;
        this.importe = importe;
        this.cobrado = cobrado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
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

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }
    
}
