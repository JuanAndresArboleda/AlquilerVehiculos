package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Empresa;

public class AlquilarMotoController {

    private static AlquilarMotoController instance;
    Empresa empresa;

    public AlquilarMotoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Moto> obtenerListaAutos() {
        return empresa.getMotos();
    }

    public static AlquilarMotoController getInstance() {
        if (instance == null) {
            // instance = new AlquilarMotoController();
        }
        return instance;
    }
}
