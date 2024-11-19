package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Administrador extends Persona {
    private LinkedList<Empleado> empleados = new LinkedList<>();

    /**
     * Metodo constructor de la clase Administrador
     * @param cedula
     * @param nombre
     * @param telefono
     * @param correo
     * @param usuario
     * @param claveAcceso
     */
    public Administrador(String cedula, String nombre, String telefono, String correo, String usuario,
            String claveAcceso) {
        super(cedula, nombre, telefono, correo, usuario, claveAcceso);
    }

    /**
     * Metodo para registrar empleados y mandar una excepcion si ya esta registrado
     * @param empleado
     * @throws Excepciones
     */
    public void registrarEmpleados(Empleado empleado) throws Excepciones{
        if(!verificarEmpleado(empleado.getCedula())){
            empleados.add(empleado);
        } else if(verificarEmpleado(empleado.getCedula())){
            throw new Excepciones("Empleado ya registrado.");
        }
    }

    /**
     * Metodo para eliminar un empleado
     * @param empleado
     */
    public void eliminarEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }

    /**
     * Metodo para buscar un empleado y mandar un excepcion si no es encontrado
     * @param cedula
     * @return Empleado
     * @throws Excepciones
     */
    public Empleado buscarEmpleado(String cedula) throws Excepciones{
        for (Empleado empleado : empleados){
            if(empleado.getCedula().equals(cedula)){
                return empleado;
            }
        }
        throw new Excepciones("Empleado no encontrado.");
    }

    /**
     * Metodo para verificar la existencia de un empelado
     * @param cedula
     * @return centinela
     */
    public boolean verificarEmpleado(String cedula){
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if(empleado.getCedula().equals(cedula)){
                centinela = true;
            }
        }
        return centinela;
    }
    
    /**
     * Metodo para actualizar los datos de un empleado
     * @param cedula
     * @param telefono
     * @param correo
     * @param clave
     * @throws Excepciones
     */
    public void actualizarDatosEmpleado(String cedula, String telefono, String correo, String clave) throws Excepciones{
        Empleado empleado = buscarEmpleado(cedula);
        empleado.setTelefono(telefono);
        empleado.setCorreo(correo);
        empleado.setClaveAcceso(clave);
    }

    /**
     * Metodo para bloquear un empleado
     * @param cedula
     * @throws Excepciones
     */
    public void bloquearEmpleado(String cedula) throws Excepciones{
        Empleado empleado = buscarEmpleado(cedula);   
        if(empleado.getEstado() != EstadoEmpleado.BLOQUEADO){
            empleado.setEstado(EstadoEmpleado.BLOQUEADO);
        }   
    }

    /**
     * Metodo para desbloquear a un empleado
     * @param cedula
     * @throws Excepciones
     */
    public void desbloquearEmpleado(String cedula) throws Excepciones{
        Empleado empleado = buscarEmpleado(cedula);   
        if(empleado.getEstado() == EstadoEmpleado.BLOQUEADO){
            empleado.setEstado(EstadoEmpleado.ACTIVO);
        }   
    }

    /**
     * Metodo para obtener la lista de empleados
     * @return empleados
     */
    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Metodo para cambiar los valores de la lista de empleados
     * @param empleados
     */
    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Administrador"+ super.toString()+"[empleados=" + empleados + "]";
    }

    
}
