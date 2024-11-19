package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConcesionario {
    private Concesionario concesionario;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private Transaccion transaccion;

    @BeforeEach
    public void setUp() {
        concesionario = new Concesionario();
        vehiculo = new Camioneta("123", "Toyota", 6 , 150, 2024, 1234.42, TipoTransmision.MANUAL,EstadoVehiculo.NUEVO, 5 , 4, 1, 120,true,true, true, true, true, true, true );
        cliente = new Cliente("123", "Carlos", "321748345", "carlos@example.com", "carlosUser", "pass789");
        empleado = new Empleado("001", "Juan", "3214672", "juan@example.com", "juanUser", "pass123", EstadoEmpleado.ACTIVO);
        LocalDate fecha = LocalDate.of(2024, 06, 14);
        transaccion = new Transaccion(vehiculo, cliente, empleado, TipoTransaccion.VENTA, fecha);
    }

    /**
     * Metodo para testear registrar vehiculos
     * @throws Excepciones
     */
    @Test
    public void testRegistrarVehiculos() throws Excepciones {
        concesionario.registrarVehiculos(vehiculo);
        assertTrue(concesionario.verificarVehiculo("123"));
    }

    /** 
     * Metodo para testear buscarVehiculos
     * @throws Excepciones
     */
    @Test
    public void testBuscarVehiculo() throws Excepciones {
        concesionario.registrarVehiculos(vehiculo);
        Vehiculo encontrado = concesionario.buscarVehiculo("123");
        assertEquals("Toyota", encontrado.getMarca());

        Exception exception = assertThrows(Excepciones.class, () -> {
            concesionario.buscarVehiculo("789");
        });
        assertEquals("Vehiculo no encontrado", exception.getMessage());
    }

    /**
     * Metodo para testear registrarClientes
     * @throws Excepciones
     */
    @Test
    public void testRegistrarClientes() throws Excepciones {
        concesionario.registrarClientes(cliente);
        assertTrue(concesionario.verificarCliente("123"));

        Exception exception = assertThrows(Exception.class, () -> {
            concesionario.registrarClientes(cliente);
        });
        assertEquals("Cliente ya registrado.", exception.getMessage());
    }

    /**
     * Metodo para testear eliminarCliente
     * @throws Excepciones
     */
    @Test
    public void testEliminarCliente() throws Excepciones {
        concesionario.registrarClientes(cliente);
        concesionario.eliminarCliente(cliente);
        assertFalse(concesionario.verificarCliente("123"));
    }

    /**
     * Metodo para testear buscarCliente
     * @throws Excepciones
     */
    @Test
    public void testBuscarCliente() throws Excepciones {
        concesionario.registrarClientes(cliente);
        Cliente encontrado = concesionario.buscarCliente("123");
        assertEquals("Carlos", encontrado.getNombre());

        Exception exception = assertThrows(Excepciones.class, () -> {
            concesionario.buscarCliente("987654321");
        });
        assertEquals("Cliente no encontrado", exception.getMessage());
    }

    /**
     * Metodo para testear registrarTransacciones
     */
    @Test
    public void testRegistrarTransacciones() {
        concesionario.registrarTransacciones(transaccion);
        assertEquals(1, concesionario.getTransacciones().size());
    }

    /**
     * Metodo para testear autenticarUsuario
     * @throws Excepciones
     */
    @Test
    public void testAutenticarUsuario() throws Excepciones {
        concesionario.getUsuarios().add(cliente);
        concesionario.getUsuarios().add(empleado);

        Persona autenticado = concesionario.autenticarUsuario("carlosUser", "pass789");
        assertTrue(autenticado instanceof Cliente);

    }
}
