package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Concesionario {
    private final String nombre = "Tu carro UQ";
    private Administrador administrador;
    private LinkedList<Persona> usuarios = new LinkedList<>();
    private LinkedList<Vehiculo> vehiculos = new LinkedList<>();
    private LinkedList<Cliente> clientes = new LinkedList<>();
    private LinkedList<Empleado> empleados = new LinkedList<>();
    private LinkedList<Transaccion> transacciones = new LinkedList<>();

    /**
     * Metodo constructor de la clase Concesionario
     */
    public Concesionario(){
        
    }

    /**
     * Metodo para registrar un Vehiculo y mandar una excepcion si ya esta registrado
     * @param vehiculo
     * @throws Excepciones
     */
    public void registrarVehiculos(Vehiculo vehiculo) throws Excepciones{
        if(!verificarCliente(vehiculo.getCodigo())){
            vehiculos.add(vehiculo);
        }else if(verificarCliente(vehiculo.getCodigo())){
            throw new Excepciones("Vehiculo ya registrado.");
        }
    }

    /**
     * Metodo para buscar un vehiculo y mandadr una excepcion si no lo encuentra
     * @param codigo
     * @return Vehiculo
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

    /**
     * Metodo para verificar la existencia de un vehiculo
     * @param codigo
     * @return centinela
     */
    public boolean verificarVehiculo(String codigo){
        boolean centinela = false;
        for (Vehiculo vehiculo: vehiculos) {
            if(vehiculo.getCodigo().equals(codigo)){
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para registrar un cliente y mandar un excepcion si ya esta registrado
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

    /**
     * Metodo para eliminar un cliente
     * @param cliente
     */
    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    /**
     * Metodo para buscar un cliente y mandar una excepcion si no lo encuentra
     * @param cedula
     * @return Cliente
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

    /**
     * Metodo para verificar la existencia de un cliente
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

    /**
     * Metodo para registrar una transaccion
     * @param transaccion
     */
    public void registrarTransacciones(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    /**
     * Metodo para autenticar un usuario
     * @param username
     * @param claveAcceso
     * @return un objeto de tipo persona
     * @throws Excepciones
     */
    public Persona autenticarUsuario(String username, String claveAcceso) throws Excepciones {
        for (Persona usuario : usuarios) {
            if (usuario.verificarCredenciales(username, claveAcceso)) {
                if (usuario instanceof Empleado) {
                    return (Empleado) usuario;
                } else if (usuario instanceof Administrador) {
                    return (Administrador) usuario;
                } else if (usuario instanceof Cliente) {
                    return (Cliente) usuario;
                }
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public LinkedList<Persona> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Persona> usuarios) {
        this.usuarios = usuarios;
    }
    
}
