package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String matricula, String modelo, String añoFabricacion, int cantidadPuertas) {
        super(marca, matricula, modelo, añoFabricacion);
        this.cantidadPuertas = cantidadPuertas;
    }

    public double calcularCostoReserva(int dias){
        return dias*6000;

    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto [cantidadPuertas=" + cantidadPuertas + "]";
    }

}
