package co.edu.uniquindio.poo.model;

public class Reserva {
    private String vehiculo;
    private String tiempoReserva;
    private String cliente;
    private String id;

    public Reserva(String vehiculo, String tiempoReserva, String cliente, String id) {
        this.vehiculo = vehiculo;
        this.tiempoReserva = tiempoReserva;
        this.cliente = cliente;
        this.id = id;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTiempoReserva() {
        return tiempoReserva;
    }

    public void setTiempoReserva(String tiempoReserva) {
        this.tiempoReserva = tiempoReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
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