package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import java.util.Collection;

public class ClienteController {

    private static ClienteController instance;
    Empresa empresa;

    public ClienteController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearCliente(Cliente cliente) {
        return empresa.agregarCliente(cliente);
    }

    public Collection<Cliente> obtenerListaClientes() {
        return empresa.getClientes();
    }

    public boolean eliminarCliente(int cedula) {
       return empresa.eliminarCliente(cedula);
    }

    public boolean actualizarCliente(int cedula, Cliente cliente) {
       return empresa.actualizarCliente(cedula, cliente);
    }

    public static ClienteController getInstance() {
        if (instance == null) {
            // instance = new ClienteController();
        }
        return instance;
    }
}

