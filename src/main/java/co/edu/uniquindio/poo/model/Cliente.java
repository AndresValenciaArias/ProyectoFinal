package co.edu.uniquindio.poo.model;

public class Cliente extends Persona{
    private Vehiculo vehiculo;

    /**Constructor de Cliente
     * @param cedula
     * @param nombre
     * @param telefono
     * @param correo
     * @param usuario
     * @param claveAcceso
     */
    public Cliente(String cedula, String nombre, String telefono, String correo, String usuario, String claveAcceso) {
        super(cedula, nombre, telefono, correo, usuario, claveAcceso);
    }

    /**Metodo para asignar vehiculo
     * @param vehiculo
     */
    public void asignarVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    /**Get vehiculo
     * @return vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**Set vehiculo
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Cliente" + super.toString() + "vehiculo =" + vehiculo ;
    }

    

    
}
