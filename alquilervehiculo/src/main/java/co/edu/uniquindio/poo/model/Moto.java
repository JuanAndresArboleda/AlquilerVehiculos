package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private boolean disponible;
    private Caja caja;
    public Moto(String marca, String matricula, String modelo, String añoFabricacion,Caja caja){
        super(marca, matricula, modelo, añoFabricacion);
        this.caja=caja;
        this.disponible = true;
    }

 @Override
    public double calcularCostoReserva(int dias) {
        double costoTotal =  100000* dias;

        
        if (caja == Caja.AUTOMATICA) {
            costoTotal += 300 * dias; 
        }

        return costoTotal;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
