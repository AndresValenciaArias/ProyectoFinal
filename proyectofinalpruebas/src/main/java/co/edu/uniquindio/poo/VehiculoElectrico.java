package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo{
    private double autonomia;
    private double horasDeCarga;
    
    /**
     * Metodo constructor de la clase VehiculoElectrico
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param autonomia
     * @param horasDeCarga
     */
    public VehiculoElectrico(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, double autonomia, double horasDeCarga) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo);
        this.autonomia = autonomia;
        this.horasDeCarga = horasDeCarga;
    }

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
