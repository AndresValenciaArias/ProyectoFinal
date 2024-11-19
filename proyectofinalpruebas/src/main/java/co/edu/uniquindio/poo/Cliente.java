package co.edu.uniquindio.poo;

public class Cliente extends Persona{
    private Vehiculo vehiculo;

    /**
     * Metodo constructor de la clase Cliente
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

    /**
     * Metodo para asignar un vehiculo a un cliente
     * @param vehiculo
     */
    public void asignarVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo para obtener el vehiculo de un cliente
     * @return vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo para cambiar el vehiculo de un cliente
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
