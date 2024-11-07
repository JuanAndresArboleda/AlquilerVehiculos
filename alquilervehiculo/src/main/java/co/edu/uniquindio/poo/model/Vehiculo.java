package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {

    private String marca, matricula, modelo, añoFabricacion;
    private String disponible;

    public Vehiculo(String marca, String matricula, String modelo, String añoFabricacion, String disponible) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.disponible = disponible;
    }

    //public abstract String determinarDisponibilidad(String matricula, Vehiculo vehiculo);

    public abstract double calcularCostoReserva(int dias);

 
    public boolean reservar() {
    if (disponible.equalsIgnoreCase("sí")) {
        disponible = "no";
        return true;
    }
    return false;
}

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

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", añoFabricacion="
                + añoFabricacion + ", disponible=" + disponible + "]";
    }


}
