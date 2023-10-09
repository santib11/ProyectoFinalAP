
package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private int idReserva;
    private String nombre;
    private int dni;
    private boolean estado;
    private LocalDate fecha;
    private Mesa mesa;

    public Reserva() {
    }

    public Reserva(String nombre, int dni, boolean estado, LocalDate fecha, Mesa mesa) {
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
        this.fecha = fecha;
        this.mesa = mesa;
    }

    public Reserva(int idReserva, String nombre, int dni, boolean estado, LocalDate fecha, Mesa mesa) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
        this.fecha = fecha;
        this.mesa = mesa;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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
    
}
