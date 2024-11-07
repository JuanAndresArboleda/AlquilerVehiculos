package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Empresa;

public class GestionMotoController {
    
    private static GestionMotoController instance;
    Empresa empresa;

    public GestionMotoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearMoto(Moto moto) {
        return empresa.agregarMoto(moto);
    }

    public Collection<Moto> obtenerListaMotos() {
        return empresa.getMotos();
    }

    public boolean eliminarMoto(String matricula) {
        return empresa.eliminarMoto(matricula);
    }

    public boolean actualizarMoto(String matricula, Moto moto) {
        return empresa.actualizarMoto(matricula, moto);
    }

    public static GestionMotoController getInstance() {
        if (instance == null) {
            // instance = new GestionMotoController();
        }
        return instance;
    }
}
