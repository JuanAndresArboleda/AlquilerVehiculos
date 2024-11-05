package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Empresa;

public class AlquilarCamionetaController {

    private static AlquilarCamionetaController instance;
    Empresa empresa;

    public AlquilarCamionetaController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Camioneta> obtenerListaCamionetas() {
        return empresa.getCamionetas();
    }

    public static AlquilarCamionetaController getInstance() {
        if (instance == null) {
            // instance = new AlquilarCamionetaController();
        }
        return instance;
    }
}
