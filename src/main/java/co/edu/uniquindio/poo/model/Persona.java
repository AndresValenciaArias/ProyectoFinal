package co.edu.uniquindio.poo.model;

public class Persona {
    private String cedula, nombre, telefono, correo, usuario, claveAcceso;

    /**Constructor de persona
     * @param cedula
     * @param nombre
     * @param telefono
     * @param correo
     * @param usuario
     * @param claveAcceso
     */
    public Persona(String cedula, String nombre, String telefono, String correo, String usuario, String claveAcceso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.claveAcceso = claveAcceso;
    }

    /** verificar credenciales
     * @param usuario
     * @param claveAcceso
     * @return
     * @throws Excepciones
     */
    public boolean verificarCredenciales(String usuario, String claveAcceso) throws Excepciones {
        boolean centinela = false; 
        if(this.usuario.equals(usuario) && this.claveAcceso.equals(claveAcceso)){
            centinela = true;
         } else{
            throw new Excepciones("Usuario y contraseña incorrecta.");
         }
         return centinela;
    }

    //Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo
                + "]";
    }
}
