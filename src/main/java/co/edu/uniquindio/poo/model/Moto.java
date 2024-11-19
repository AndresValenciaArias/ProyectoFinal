package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    /**Constructor de moto
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
    public Moto(String codigo, String marca,int cambios, int velMaxima, int modelo, double cilindraje, TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, EstadoRegistro estadoRegistro){
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje,tipoTransmision, estadoVehiculo, estadoRegistro);
    }

}
