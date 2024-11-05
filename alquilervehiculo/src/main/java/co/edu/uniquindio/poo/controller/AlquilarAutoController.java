package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Auto;

public class AlquilarAutoController {

    private static AlquilarAutoController instance;
    Empresa empresa;

    public AlquilarAutoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Auto> obtenerListaAutos() {
        return empresa.getAutos();
    }

    public static AlquilarAutoController getInstance() {
        if (instance == null) {
            // instance = new AlquilarAutoController();
        }
        return instance;
    }
}
