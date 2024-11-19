package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestEmpleado {
    
    /**
     * Metodo para testear registroVehiculos
     * @throws Excepciones
     */
    @Test
    public void testRegistroVehiculos() throws Excepciones {
        Concesionario concesionario = new Concesionario();
        Empleado empleado = new Empleado("001", "Juan", "3214672", "juan@example.com", "juanUser", "pass123", EstadoEmpleado.ACTIVO);
        Vehiculo vehiculo = new Camioneta("123", "Toyota", 6 , 150, 2024, 1234.42, TipoTransmision.MANUAL,EstadoVehiculo.NUEVO, 5 , 4, 1, 120,true,true, true, true, true, true, true );

        empleado.registroVehiculos(concesionario, vehiculo);
 
        assertTrue(concesionario.getVehiculos().contains(vehiculo), "El vehículo debería estar registrado en el concesionario.");
    }

    /**
     * Metodo para testear registrarTransacciones
     */
    @Test
    public void testRegistrarTransacciones() {
        Empleado empleado = new Empleado("003", "Luis", "76384283", "luis@example.com", "luisUser", "pass321", EstadoEmpleado.ACTIVO);
        Vehiculo vehiculo = new Camioneta("123", "Toyota", 6 , 150, 2024, 1234.42, TipoTransmision.MANUAL,EstadoVehiculo.NUEVO, 5 , 4, 1, 120,true,true, true, true, true, true, true );
        Cliente cliente = new Cliente("123", "Carlos", "321748345", "carlos@example.com", "carlosUser", "pass789");
        LocalDate fecha = LocalDate.of(2024, 06, 14);
        Transaccion transaccion = new Transaccion(vehiculo, cliente, empleado, TipoTransaccion.VENTA, fecha);
        empleado.registrarTransacciones(transaccion);

        assertTrue(empleado.getTransacciones().contains(transaccion), "La transacción debería estar en la lista del empleado.");
    }

    /**
     * Metodo para testear estadoEmpleado
     */
    @Test
    void testEstadoEmpleado() {
    Empleado empleado = new Empleado("004", "María", "2164714114", "maria@example.com", "mariaUser", "pass654", EstadoEmpleado.BLOQUEADO);

    assertEquals(EstadoEmpleado.BLOQUEADO, empleado.getEstado(), "El estado inicial debería ser BLOQUEADO.");

    empleado.setEstado(EstadoEmpleado.ACTIVO);

    assertEquals(EstadoEmpleado.ACTIVO, empleado.getEstado(), "El estado debería cambiar a ACTIVO.");
    }

    
}
