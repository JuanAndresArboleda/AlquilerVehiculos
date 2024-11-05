package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private int id;
    private Collection<Cliente> clientes;
    private Collection<Auto> autos;
    private Collection<Reserva> reservas;
    private Collection<Camioneta> camionetas;
    private Collection<Moto> motos; 

    public Empresa(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        clientes = new LinkedList<>();
    }

    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCliente(int cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula() == cedula) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(int cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula() == cedula) {
                cliente.setCedula(actualizado.getCedula());
                cliente.setNombre(actualizado.getNombre());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setCorreo(actualizado.getCorreo());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarCliente(int cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula() == cedula) {
                centinela = true;
            }
        }
        return centinela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Auto> getAutos() {
        return autos;
    }

    public void setAutos(Collection<Auto> autos) {
        this.autos = autos;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Collection<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas(Collection<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    public Collection<Moto> getMotos() {
        return motos;
    }

    public void setMotos(Collection<Moto> motos) {
        this.motos = motos;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", id=" + id + ", clientes=" + clientes + ", autos=" + autos
                + ", reservas=" + reservas + ", camionetas=" + camionetas + ", motos=" + motos + "]";
    }

   

    

}
