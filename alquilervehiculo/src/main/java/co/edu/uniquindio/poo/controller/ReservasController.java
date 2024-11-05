package co.edu.uniquindio.poo.controller;

import java.util.Collection;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Empresa;

public class ReservasController {
    
    private static ReservasController instance;
    Empresa empresa;

    public ReservasController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Reserva> obtenerListaReservas() {
        return empresa.getReservas();
    }

    public static ReservasController getInstance() {
        if (instance == null) {
            // instance = new ReservasController();
        }
        return instance;
    }
}
