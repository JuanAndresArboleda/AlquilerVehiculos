package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private int cedula;
    private int telefono;
    private String correo;
    private List<Reserva> reservas;

    public Cliente(String nombre, int cedula, int telefono, String correo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.reservas = new ArrayList<>();
    }

    public void reservarVehiculo(Vehiculo vehiculo, int dias, String marca, String modelo) {
       if (!vehiculo.getMarca().equals(marca) || !vehiculo.getModelo().equals(modelo)) {
            System.out.printf("El vehículo solicitado no coincide con la marca y modelo:", marca, modelo);
            return;
        }


        if (vehiculo.reservar()) {
            double costo = vehiculo.calcularCostoReserva(dias);
            System.out.printf("Reserva realizada para  por  días. Costo total: ", 
                            nombre, vehiculo.getMatricula(), dias, costo);
        } else {
            System.out.printf("Lo sentimos, el vehículo %s no está disponible.%n", vehiculo.getMatricula());
        } 
}
     
    public int obtenerDiasReserva(int index) {
        if (index < 0 || index >= reservas.size()) {
            System.out.println("Índice de reserva no válido.");
            return -1; 
        }
        return reservas.get(index).getTiempoReserva();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void reservarVehiculo(){
        
    }
    
}

    