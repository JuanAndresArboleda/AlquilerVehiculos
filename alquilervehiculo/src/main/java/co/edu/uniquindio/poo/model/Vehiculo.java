package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {

    private String marca, matricula, modelo, añoFabricacion;
    private boolean disponible;

    public Vehiculo(String marca, String matricula, String modelo, String añoFabricacion) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.disponible = true;
    }

    public abstract double calcularCostoReserva(int dias);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean reservar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", añoFabricacion="
                + añoFabricacion + "]";
    }

}
