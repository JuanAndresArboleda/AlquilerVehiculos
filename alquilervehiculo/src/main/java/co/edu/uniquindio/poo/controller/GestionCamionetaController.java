package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Empresa;

public class GestionCamionetaController {
    
    private static GestionCamionetaController instance;
    Empresa empresa;

    public GestionCamionetaController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearCamioneta(Camioneta camioneta) {
        return empresa.agregarCamioneta(camioneta);
    }

    public Collection<Camioneta> obtenerListaCamionetas() {
        return empresa.getCamionetas();
    }

    public boolean eliminarCamioneta(String matricula) {
        return empresa.eliminarCamioneta(matricula);
    }

    public boolean actualizarCamioneta(String matricula, Camioneta camioneta) {
        return empresa.actualizarCamioneta(matricula, camioneta);
    }

    public static GestionCamionetaController getInstance() {
        if (instance == null) {
            // instance = new GestionCamionetaController();
        }
        return instance;
    }
}
