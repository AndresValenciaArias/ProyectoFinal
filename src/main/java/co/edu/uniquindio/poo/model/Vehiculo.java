package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private String codigo;
    private String marca;
    private int cambios;
    private int velMaxima;
    private int modelo;
    private double cilindraje;
    private EstadoRegistro estadoRegistro;
    private EstadoVehiculo estadoVehiculo;
    private TipoTransmision tipoTransmision;

    /**Constructor de Vehiculo
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param estadoRegistro
     */
    public Vehiculo(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, EstadoRegistro estadoRegistro) {
        this.codigo = codigo;
        this.marca = marca;
        this.cambios = cambios;
        this.velMaxima = velMaxima;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.estadoRegistro = EstadoRegistro.DISPONIBLE;
        this.estadoVehiculo = estadoVehiculo;
        this.tipoTransmision= tipoTransmision;
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getCambios() {
        return cambios;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public EstadoRegistro getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(EstadoRegistro estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    @Override
    public String toString() {
        return "Vehiculo [codigo=" + codigo + ", marca=" + marca + ", cambios=" + cambios + ", velMaxima=" + velMaxima
                + ", modelo=" + modelo + ", cilindraje=" + cilindraje + ", estadoRegistro=" + estadoRegistro
                + ", estadoVehiculo=" + estadoVehiculo + "]";
    }
}
