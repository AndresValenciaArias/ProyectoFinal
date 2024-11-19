package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAdministrador {
    private Administrador admin;

    @BeforeEach
    public void setUp() {
        admin = new Administrador("123", "Admin", "321561234", "admin@example.com", "adminUser", "adminPass");
    }

    /**
     * Metodo para testear registrarEmpleado
     * @throws Excepciones
     */
    @Test
    public void testRegistrarEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("001", "Juan", "314267545", "juan@example.com", "juanUser", "pass123", EstadoEmpleado.ACTIVO);
        admin.registrarEmpleados(empleado);
        assertTrue(admin.getEmpleados().contains(empleado));

        Exception exception = assertThrows(Excepciones.class, () -> admin.registrarEmpleados(empleado));
        assertEquals("Empleado ya registrado.", exception.getMessage());
    }

    /**
     * Metodo para testear eliminarEmpleado
     * @throws Excepciones
     */
    @Test
    public void testEliminarEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("002", "Ana", "31765796", "ana@example.com", "anaUser", "pass456", EstadoEmpleado.ACTIVO);
        admin.registrarEmpleados(empleado);
        admin.eliminarEmpleado(empleado);
        assertFalse(admin.getEmpleados().contains(empleado));
    }

    /**
     * Metodo para testear buscarEmpleado
     * @throws Excepciones
     */
    @Test
    public void testBuscarEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("003", "Luis", "312745796", "luis@example.com", "luisUser", "pass789", EstadoEmpleado.ACTIVO);
        admin.registrarEmpleados(empleado);

        Empleado encontrado = admin.buscarEmpleado("003");
        assertEquals(empleado, encontrado);

        // Intentar buscar un empleado inexistente
        Exception exception = assertThrows(Excepciones.class, () -> admin.buscarEmpleado("999"));
        assertEquals("Empleado no encontrado.", exception.getMessage());
    }

    /**
     * Metodo para testear actualizarDatosEmpleados
     * @throws Excepciones
     */
    @Test
    public void testActualizarDatosEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("004", "Maria", "3241657698", "maria@example.com", "mariaUser", "pass000", EstadoEmpleado.ACTIVO);
        admin.registrarEmpleados(empleado);

        admin.actualizarDatosEmpleado("004", "3265187945", "maria.new@example.com", "newPass");
        assertEquals("555-3333", empleado.getTelefono());
        assertEquals("maria.new@example.com", empleado.getCorreo());
        assertEquals("newPass", empleado.getClaveAcceso());
    }

    /**
     * Metodo para testear bloquearEmpleado
     * @throws Excepciones
     */
    @Test
    public void testBloquearEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("005", "Pedro", "3241567", "pedro@example.com", "pedroUser", "pass111", EstadoEmpleado.ACTIVO);
        admin.registrarEmpleados(empleado);

        admin.bloquearEmpleado("005");
        assertEquals(EstadoEmpleado.BLOQUEADO, empleado.getEstado());
    }

    /**
     * Metodo para testear desbloquearEmpleado
     * @throws Excepciones
     */
    @Test
    public void testDesbloquearEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("006", "Carlos", "3452535", "carlos@example.com", "carlosUser", "pass222", EstadoEmpleado.BLOQUEADO);
        admin.registrarEmpleados(empleado);

        admin.desbloquearEmpleado("006");
        assertEquals(EstadoEmpleado.ACTIVO, empleado.getEstado());
    }

    /**
     * Metodo para testear verificarEmpleado
     * @throws Excepciones
     */
    @Test
    public void testVerificarEmpleado() throws Excepciones {
        Empleado empleado = new Empleado("007", "Lucia", "3254765", "lucia@example.com", "luciaUser", "pass333", EstadoEmpleado.ACTIVO);
        admin.registrarEmpleados(empleado);

        assertTrue(admin.verificarEmpleado("007"));

        assertFalse(admin.verificarEmpleado("999"));
    }
}
    

