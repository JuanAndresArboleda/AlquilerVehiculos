package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Empresa;

public class GestionAutoController {
    
    private static GestionAutoController instance;
    Empresa empresa;

    public GestionAutoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearAuto(Auto auto) {
        return empresa.agregarAuto(auto);
    }

    public Collection<Auto> obtenerListaAutos() {
        return empresa.getAutos();
    }

    public boolean eliminarAuto(String matricula) {
        return empresa.eliminarAuto(matricula);
    }

    public boolean actualizarAuto(String matricula, Auto auto) {
        return empresa.actualizarAuto(matricula, auto);
    }

    public static GestionAutoController getInstance() {
        if (instance == null) {
            // instance = new GestionAutoController();
        }
        return instance;
    }
}
