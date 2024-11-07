package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo {

    private String capacidadCarga;

    public Camioneta(String marca, String matricula, String modelo, String añoFabricacion,String disponible, String capacidadCarga) {
        super(marca, matricula, modelo, añoFabricacion, disponible);
        this.capacidadCarga = capacidadCarga;
    }

    public double calcularCostoReserva(int dias) {
        double costoTotal = 80000 * dias;

        int capacidadCargaInt = Integer.parseInt(capacidadCarga);
        double costoCarga = capacidadCargaInt * 100000;
        costoTotal += costoCarga;

        return costoTotal;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta [capacidadCarga=" + capacidadCarga + "]";
    }

   

}
