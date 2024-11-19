package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EstadoEmpleado;

import java.util.ArrayList;
import java.util.List;

public class LoginController {

    private Administrador administrador;
    private List<Empleado> empleados;
    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    public LoginController() {
        empleados = new ArrayList<>();
        empleados.add(new Empleado("234", "Javi", "234", "234", "empleado", "234", EstadoEmpleado.ACTIVO));
    }

    public boolean validarAdministrador(String nombreUsuario, String claveAcceso) {
        System.out.println("Validando administrador: " + nombreUsuario);
        return "Jose".equalsIgnoreCase(nombreUsuario) && "123".equals(claveAcceso);
    }

    public boolean validarEmpleado(String nombre, String contrasena) {
        System.out.println("Validando empleado: " + nombre + ", " + contrasena);
        for (Empleado empleado : empleados) {
            System.out.println("Empleado en la lista: " + empleado.getNombre() + ", " + empleado.getClaveAcceso());
            if (empleado.getNombre().equals(nombre) && empleado.getClaveAcceso().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }
    

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}

