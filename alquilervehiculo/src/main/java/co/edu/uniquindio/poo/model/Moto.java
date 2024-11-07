package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private Caja caja;

    public Moto(String marca, String matricula, String modelo, String añoFabricacion, String disponible, Caja caja) {
        super(marca, matricula, modelo, añoFabricacion, disponible);
        this.caja = caja;
    }

    /*
    @Override
    public String determinarDisponibilidad(String matricula, Vehiculo vehiculo) {
       for(Vehiculo moto: motos){
            if(moto.getMatricula.equals(matricula)){

            }
        }

    }*/

    @Override
    public double calcularCostoReserva(int dias) {
        double costoTotal = 100000 * dias;

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
}