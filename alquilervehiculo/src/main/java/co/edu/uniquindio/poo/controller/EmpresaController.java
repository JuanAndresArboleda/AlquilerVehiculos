package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Reserva;

public class EmpresaController {
    
    private static EmpresaController instance;
    Empresa empresa;

    public EmpresaController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Reserva> obtenerListaReservas() {
        return empresa.getReservas();
    }

    public static EmpresaController getInstance() {
        if (instance == null) {
            // instance = new EmpresaController();
        }
        return instance;
    }
}
