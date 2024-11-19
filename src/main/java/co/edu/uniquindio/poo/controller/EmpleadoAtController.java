package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EstadoRegistro;
import co.edu.uniquindio.poo.model.EstadoVehiculo;
import co.edu.uniquindio.poo.model.Excepciones;
import co.edu.uniquindio.poo.model.TipoTransmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Concesionario;

public class EmpleadoAtController {
    private Empleado empleado; 
    public Empleado getEmpleado() {
        return empleado;
    }

    private Concesionario concesionario; 

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public EmpleadoAtController() {
        this.concesionario = new Concesionario(); 
        
    }
    
    public void onagregarVehiculo(String codigo, String marca, String cambios, String velMaxima, 
                               String modelo, double cilindraje, TipoTransmision tipoTransmision, 
                               EstadoVehiculo estadoVehiculo, EstadoRegistro estadoRegistro) {
    try {
        Vehiculo vehiculo = new Vehiculo(codigo, marca, 0, 0, 0, cilindraje, tipoTransmision, estadoVehiculo, estadoRegistro);
        if (concesionario != null) {
            concesionario.registrarVehiculo(vehiculo);
            System.out.println("Vehículo agregado: " + vehiculo.getCodigo());
            System.out.println("Total vehículos en la empresa: " + concesionario.getVehiculos().size());  
        } else {
            System.out.println("Concesionario o empresa no inicializados.");
        }
    } catch (IllegalArgumentException e) {
        System.out.println("Error al registrar el vehículo: " + e.getMessage());
    }
}
}

