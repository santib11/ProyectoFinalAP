
package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    int idReserva;
    String nombre;
    int dni;
    boolean estado;
    LocalDate fecha;
    LocalTime hora;

    public Reserva() {
    }

    public Reserva(String nombre, int dni, boolean estado, LocalDate fecha, LocalTime hora) {
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Reserva(int idReserva, String nombre, int dni, boolean estado, LocalDate fecha, LocalTime hora) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
}
