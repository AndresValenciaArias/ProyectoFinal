package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Excepciones;

public class AdminController {

    private Administrador administrador; 

    public Administrador getAdministrador() {
        return administrador;
    }

    public AdminController() {
        this.administrador = new Administrador(null, null, null, null, null, null); // Asegúrate de inicializarlo
    }


    public void agregarEmpleado(String nombre, String cedula, String telefono, String correo, String clave) {
        try{
            Empleado empleado = new Empleado(cedula, nombre, telefono, correo, correo, clave, null);
            administrador.registrarEmpleados(empleado);
            System.out.println("Empleado agregado correctamente");
        }
        catch (Excepciones e){
            System.out.println("Error al registrar empl");
        }
    }
    

    public void eliminarEmpleado(Empleado empleado) {
        if (empleado != null) {
            administrador.eliminarEmpleado(empleado);
            System.out.println("Empleado eliminado");
        } else {
            System.out.println("Empleado no seleccionado");
        }
    }

    public void buscarEmpleado(String cedula) {
        try {
            Empleado empleado = administrador.buscarEmpleado(cedula);
            if (empleado != null) {
                System.out.println("Empleado encontrado: " + empleado);
            }
        } catch (Excepciones e) {
            e.printStackTrace();
        }
    }

    public void bloquearEmpleado(String cedula) {
        try {
            administrador.bloquearEmpleado(cedula);
            System.out.println("Empleado bloqueado");
        } catch (Excepciones e) {
            e.printStackTrace();
        }
    }

    public void desbloquearEmpleado(String cedula) {
        try {
            administrador.desbloquearEmpleado(cedula);
            System.out.println("Empleado desbloqueado");
        } catch (Excepciones e) {
            e.printStackTrace();
        }
    }


    
}
