package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Concesionario {
    private final String nombre = "Tu carro UQ";
    private Administrador administrador;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Transaccion> transacciones = new ArrayList<>();


    /**Constructor Concesionario
     * 
     */
    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    /**Metodo para registrar vehiculos
     * @param vehiculo
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo.getCodigo());
    }
    

    /**Get vehiculos
     * @return vehiculos
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**Metodo para buscar vehiculos
     * @param codigo
     * @return vehiculo
     * @throws Excepciones
     */
    public Vehiculo buscarVehiculo(String codigo) throws Excepciones{
        for (Vehiculo vehiculo : vehiculos){
            if(vehiculo.getCodigo().equals(codigo)){
                return vehiculo;
            }
        }
        throw new Excepciones("Vehiculo no encontrado");
    }

    /**Metodo para verificar vehiculo
     * @param codigo
     * @return centinela
     */
    public boolean verificarVehiculo(String codigo){
        boolean centinela = false;
        for (Vehiculo vehiculo: vehiculos) {
            System.out.println("Verificando vehículo: " + vehiculo.getCodigo());
            if(vehiculo.getCodigo().equals(codigo)){
                centinela = true;
            }
        }
        return centinela;
    }

    /**Metodo para registrar clientes
     * @param cliente
     * @throws Excepciones
     */
    public void registrarClientes(Cliente cliente) throws Excepciones{
        if(!verificarCliente(cliente.getCedula())){
            clientes.add(cliente);
        }else if(verificarCliente(cliente.getCedula())){
            throw new Excepciones("Cliente ya registrado.");
        }
    }

    /**Metodo para eliminar clientes
     * @param cliente
     */
    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    /**Metodo para buscar clientes
     * @param cedula
     * @return cliente
     * @throws Excepciones
     */
    public Cliente buscarCliente(String cedula) throws Excepciones{
        for (Cliente cliente : clientes){
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        throw new Excepciones("Cliente no encontrado");
    }

    /**Metodo para verificar clientes
     * @param cedula
     * @return centinela
     */
    public boolean verificarCliente(String cedula){
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if(cliente.getCedula().equals(cedula)){
                centinela = true;
            }
        }
        return centinela;
    }

    /**Metodo para registrar empleados
     * @param empleado
     */
    public void registrarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }

    /**Metodo para registrar transcciones
     * @param transaccion
     */
    public void registrarTransacciones(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    //Gets y Sets

    public String getNombre() {
        return nombre;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    
}
