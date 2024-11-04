package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo{

    private int capacidadCarga;

    public Camioneta(String marca, String matricula, String modelo, String añoFabricacion, int capacidadCarga){
        super(marca, matricula, modelo, añoFabricacion);
        this.capacidadCarga = capacidadCarga;
    }
 public double calcularCostoReserva(int dias) {
        double costoTotal = 80000 * dias;

        double costoCarga = capacidadCarga * 100000;
        costoTotal += costoCarga;

        return costoTotal;
    }
  


   
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta [capacidadCarga=" + capacidadCarga + "]";
    }
    
}
