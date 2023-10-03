
package Model;

import java.util.List;

public class Mesa {
    int idMesa;
    int numero;
    int capacidad;
    boolean estado;
    Reserva reserva;
    List<Pedido> pedidos;

    public Mesa() {
    }

    public Mesa(int numero, int capacidad, boolean estado, Reserva reserva, List<Pedido> pedidos) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
        this.reserva = reserva;
        this.pedidos = pedidos;
    }

    public Mesa(int idMesa, int numero, int capacidad, boolean estado, Reserva reserva, List<Pedido> pedidos) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
        this.reserva = reserva;
        this.pedidos = pedidos;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
}
