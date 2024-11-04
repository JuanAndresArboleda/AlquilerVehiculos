package co.edu.uniquindio.poo.model;

public class Reserva {
    private Vehiculo vehiculo;
    private int tiempoReserva;
    private Cliente cliente;
    private String id;

    public Reserva(Vehiculo vehiculo, int tiempoReserva, Cliente cliente, String id) {
        this.vehiculo = vehiculo;
        this.tiempoReserva = tiempoReserva;
        this.cliente = cliente;
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getTiempoReserva() {
        return tiempoReserva;
    }

    public void setTiempoReserva(int tiempoReserva) {
        this.tiempoReserva = tiempoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reserva [vehiculo=" + vehiculo + ", tiempoReserva=" + tiempoReserva + ", cliente=" + cliente + ", id="
                + id + "]";
    }


}