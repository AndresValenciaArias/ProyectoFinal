package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Empleado extends Persona {
    private LinkedList<Transaccion> transacciones = new LinkedList<>();
    private EstadoEmpleado estado;

    /**Constructor de empleado
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

    /**Metodo para registrar empleado
     * @param consecionario
     * @param vehiculo
     * @throws Excepciones
     */
    public void registroVehiculos(Concesionario consecionario, Vehiculo vehiculo) throws Excepciones {
       consecionario.registrarVehiculo(vehiculo);
    }

    /**Metodo para registrar cliente
     * @param concesionario
     * @param cliente
     * @throws Excepciones
     */
    public void registroClientes(Concesionario concesionario, Cliente cliente) throws Excepciones {
        concesionario.registrarClientes(cliente);
    }

    /**Metodo para registrar ventas
     * @param concesionario
     * @param transaccion
     */
    public void registroVentas(Concesionario concesionario, Transaccion transaccion){
        concesionario.registrarTransacciones(transaccion);
    }

    /**Metodo para registrar alquiler
     * @param concesionario
     * @param transaccion
     */
    public void registroAlquiler(Concesionario concesionario, Transaccion transaccion){
        concesionario.registrarTransacciones(transaccion);
    }

    /**Metodo para registrar compras
     * @param concesionario
     * @param transaccion
     */
    public void registroCompras(Concesionario concesionario, Transaccion transaccion){
        concesionario.registrarTransacciones(transaccion);
    }

    /**Metodo para registrar transacciones
     * @param transaccion
     */
    public void registrarTransacciones(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    /**Get transacciones
     * @return transacciones
     */
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**Set transacciones
     * @param transacciones
     */
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empleado" + super.toString() + "[transacciones=" + transacciones + "]";
    }

    /**Get estado
     * @return estado
     */
    public EstadoEmpleado getEstado() {
        return estado;
    }

    /**Set estado
     * @param estado
     */
    public void setEstado(EstadoEmpleado estado) {
        this.estado = estado;
    }
}
