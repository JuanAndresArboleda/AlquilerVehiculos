package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import java.util.Collection;

public class ClienteController2 {

    private static ClienteController2 instance;
    Empresa empresa;

    public ClienteController2(Empresa empresa) {
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

    public static ClienteController2 getInstance() {
        if (instance == null) {
            //instance = new ClienteController();
        }
        return instance;
    }
}