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

    //Metodos Auto//
    
    public boolean agregarAuto(Auto auto) {
        boolean centinela = false;
        if (!verificarAuto(auto.getMatricula())) {
            autos.add(auto);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarAuto(String matricula) {
        boolean centinela = false;
        for (Auto auto : autos) {
            if (auto.getMatricula().equals(matricula)) {
                autos.remove(auto);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarAuto(String matricula, Auto actualizado) {
        boolean centinela = false;
        for (Auto auto : autos) {
            if (auto.getMatricula().equals(matricula)) {
                auto.setMarca(actualizado.getMarca());
                auto.setMatricula(actualizado.getMatricula());
                auto.setModelo(actualizado.getModelo());
                auto.setAñoFabricacion(actualizado.getAñoFabricacion());
                auto.setCantidadPuertas(actualizado.getCantidadPuertas());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarAuto(String matricula) {
        boolean centinela = false;
        for (Auto auto : autos) {
            if (auto.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    //Metodos Camioneta
    public boolean agregarCamioneta(Camioneta camioneta) {
        boolean centinela = false;
        if (!verificarCamioneta(camioneta.getMatricula())) {
            camionetas.add(camioneta);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCamioneta(String matrcicula) {
        boolean centinela = false;
        for (Camioneta camioneta : camionetas) {
            if (camioneta.getMatricula().equals(matrcicula)) {
                camionetas.remove(camioneta);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCamioneta(String matricula, Camioneta actualizada) {
        boolean centinela = false;
        for (Camioneta camioneta : camionetas) {
            if (camioneta.getMarca().equals(matricula)) {
                camioneta.setMarca(actualizada.getMarca());
                camioneta.setMatricula(actualizada.getMatricula());
                camioneta.setModelo(actualizada.getModelo());
                camioneta.setAñoFabricacion(actualizada.getAñoFabricacion());
                camioneta.setCapacidadCarga(actualizada.getCapacidadCarga());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarCamioneta(String matricula) {
        boolean centinela = false;
        for (Camioneta camioneta : camionetas) {
            if (camioneta.getMatricula().equals(matricula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    //Metodos Motos
    public boolean agregarMoto(Moto moto) {
        boolean centinela = false;
        if (!verificarMoto(moto.getMatricula())) {
            motos.add(moto);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarMoto(String matrcicula) {
        boolean centinela = false;
        for (Moto moto : motos) {
            if (moto.getMatricula().equals(matrcicula)) {
                motos.remove(moto);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarMoto(String matricula, Moto actualizada) {
        boolean centinela = false;
        for (Moto moto : motos) {
            if (moto.getMarca().equals(matricula)) {
                moto.setMarca(actualizada.getMarca());
                moto.setMatricula(actualizada.getMatricula());
                moto.setModelo(actualizada.getModelo());
                moto.setAñoFabricacion(actualizada.getAñoFabricacion());
                moto.setCaja(actualizada.getCaja());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarMoto(String matricula) {
        boolean centinela = false;
        for (Moto moto : motos) {
            if (moto.getMatricula().equals(matricula)) {
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
