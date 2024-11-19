package co.edu.uniquindio.poo.model;

public class VehiculoElectrico extends Vehiculo{
    private double autonomia;
    private double horasDeCarga;
    
    /**Constructor de electrico
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param estadoRegistro
     * @param autonomia
     * @param horasDeCarga
     */
    public VehiculoElectrico(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, EstadoRegistro estadoRegistro, double autonomia, double horasDeCarga) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo, estadoRegistro );
        this.autonomia = autonomia;
        this.horasDeCarga = horasDeCarga;
    }

    //Getters y Setters

    public double getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    public double getHorasDeCarga() {
        return horasDeCarga;
    }
    public void setHorasDeCarga(double horasDeCarga) {
        this.horasDeCarga = horasDeCarga;
    }
    
}
