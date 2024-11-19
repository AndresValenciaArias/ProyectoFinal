package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Administrador extends Persona {
    private LinkedList<Empleado> empleados = new LinkedList<>();


    /**Constructor administrador
     * @param cedula
     * @param nombre
     * @param telefono
     * @param correo
     * @param usuario
     * @param claveAcceso
     */
    public Administrador(String cedula, String nombre, String telefono, String correo, String usuario, String claveAcceso) {
        super(cedula, nombre, telefono, correo, usuario, claveAcceso);
    }

    /**Metodo para registrar empleados
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

    /**Metodo para eliminar empleados
     * @param empleado
     */
    public void eliminarEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }

    /**Metodo para buscar empleados
     * @param cedula
     * @return
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

    /**Metodo para verificar empleados
     * @param cedula
     * @return
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
    
    /**Metodo para actualizar datos empleados
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

    /**Metodo para bloquear empleado
     * @param cedula
     * @throws Excepciones
     */
    public void bloquearEmpleado(String cedula) throws Excepciones{
        Empleado empleado = buscarEmpleado(cedula);   
        if(empleado.getEstado() != EstadoEmpleado.BLOQUEADO){
            empleado.setEstado(EstadoEmpleado.BLOQUEADO);
        }   
    }

    /**Metodo para desbloquear empleado
     * @param cedula
     * @throws Excepciones
     */
    public void desbloquearEmpleado(String cedula) throws Excepciones{
        Empleado empleado = buscarEmpleado(cedula);   
        if(empleado.getEstado() == EstadoEmpleado.BLOQUEADO){
            empleado.setEstado(EstadoEmpleado.ACTIVO);
        }   
    }

    /**Get empleados
     * @return empleados
     */
    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    /**Set empleados
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
