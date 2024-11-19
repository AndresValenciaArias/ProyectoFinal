package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Excepciones;
import co.edu.uniquindio.poo.model.TipoTransaccion;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;

public class EmpleadoClController {
    private Concesionario concesionario;
    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, Vehiculo> vehiculos = new HashMap<>();

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public EmpleadoClController(){
        concesionario = new Concesionario();
    }

    public void agregarcliente(String nombre, String cedula, String telefono, String correo, String clave){
        try{
            Cliente cliente = new Cliente(cedula, nombre, telefono, correo, correo, clave);
            concesionario.registrarClientes(cliente);
            System.out.println("Cliente agregado correctamente");
        }
        catch (Excepciones e){
            System.out.println("Error al registrar clt");
        }
    }

    public void agregartransaccion(Vehiculo vehiculo, Cliente cliente, Empleado empleado, TipoTransaccion tipoTransaccion, LocalDate fechaTransaccion){
        try{
            Transaccion transaccion = new Transaccion(vehiculo, cliente, empleado, tipoTransaccion, fechaTransaccion);
            concesionario.registrarTransacciones(transaccion);
            System.out.println("Cliente agregado correctamente");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error al registrar clt");
        }

    }

    public void eliminarCliente(Cliente cliente) {
        if (cliente != null) {
            concesionario.eliminarCliente(cliente);
            System.out.println("cl eliminado");
        } else {
            System.out.println("cl no seleccionado");
        }
    }


    public Empleado buscarEmpleadoPorCedula(String cedula) {
        return concesionario.getEmpleados().stream()
                .filter(empleado -> empleado.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }

    public Cliente buscarCliente(String cedula) throws Excepciones {
        Cliente cliente = clientes.get(cedula);
        if (cliente == null) {
            throw new Excepciones("Cliente no encontrado");
        }
        return cliente;
    }
    
    public Vehiculo buscarVehiculo(String codigo) throws Excepciones {
        Vehiculo vehiculo = vehiculos.get(codigo);
        if (vehiculo == null) {
            throw new Excepciones("Vehiculo no encontrado");
        }
        return vehiculo;
    }
}
