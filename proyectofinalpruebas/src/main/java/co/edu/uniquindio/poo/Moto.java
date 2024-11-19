package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    /**
     * Metodo constructor de la clase Moto
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     */
    public Moto(String codigo, String marca,int cambios, int velMaxima, int modelo, double cilindraje, TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo){
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje,tipoTransmision, estadoVehiculo);
    }

}
