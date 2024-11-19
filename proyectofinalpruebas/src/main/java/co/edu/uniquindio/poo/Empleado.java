package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empleado extends Persona {
    private LinkedList<Transaccion> transacciones = new LinkedList<>();
    private EstadoEmpleado estado;

    /**
     * Metodo constructor de la clase empleado
     * @param cedula
     * @param nombre
     * @param telefono
     * @param correo
     * @param usuario
     * @param claveAcceso
     * @param estado
     */
    public Empleado(String cedula, String nombre, String telefono, String correo, String usuario, String claveAcceso,EstadoEmpleado estado) {
        super(cedula, nombre, telefono, correo, usuario, claveAcceso);
        this.estado = estado;
    }

    /**
     * Metodo para registrar un vehiculo
     * @param consecionario
     * @param vehiculo
     * @throws Excepciones
     */
    public void registroVehiculos(Concesionario consecionario, Vehiculo vehiculo) throws Excepciones {
       consecionario.registrarVehiculos(vehiculo);
    }

    /**
     * Metodo para registrar a un cliente
     * @param concesionario
     * @param cliente
     * @throws Excepciones
     */
    public void registroClientes(Concesionario concesionario, Cliente cliente) throws Excepciones {
        concesionario.registrarClientes(cliente);
    }

    /**
     * Metodo para registra las ventas
     * @param concesionario
     * @param transaccion
     */
    public void registroVentas(Concesionario concesionario, Transaccion transaccion){
        concesionario.registrarTransacciones(transaccion);
    }

    /**
     * Metodo para registrar los alquileres
     * @param concesionario
     * @param transaccion
     */
    public void registroAlquiler(Concesionario concesionario, Transaccion transaccion){
        concesionario.registrarTransacciones(transaccion);
    }

    /**
     * Metodo para registrar las compras
     * @param concesionario
     * @param transaccion
     */
    public void registroCompras(Concesionario concesionario, Transaccion transaccion){
        concesionario.registrarTransacciones(transaccion);
    }

    /**
     * Metodo para registrar laas transacciones realizadas por un empleado
     * @param transaccion
     */
    public void registrarTransacciones(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    /**
     * Metodo para obtener la lista de transacciones de un empleado
     * @return lista de transacciones
     */
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Metodo para cambiar la lista de transacciones de un empleado
     * @param transacciones
     */
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empleado" + super.toString() + "[transacciones=" + transacciones + "]";
    }

    /**
     * Metodo para obtener el estado de un empleado
     * @return estado del empleado
     */
    public EstadoEmpleado getEstado() {
        return estado;
    }

    /**
     * Metodo para cambiar el estado de un empleado
     * @param estado
     */
    public void setEstado(EstadoEmpleado estado) {
        this.estado = estado;
    }
}
