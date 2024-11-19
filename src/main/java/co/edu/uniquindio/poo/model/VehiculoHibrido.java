package co.edu.uniquindio.poo.model;

public class VehiculoHibrido extends Vehiculo {
    private boolean esEnchufable;
    private boolean esHibridoLIgero;
    
    /**Constructor de hibrido
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param estadoRegistro
     * @param esEnchufable
     * @param esHibridoLIgero
     */
    public VehiculoHibrido(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, EstadoRegistro estadoRegistro, boolean esEnchufable,
            boolean esHibridoLIgero) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo, estadoRegistro);
        this.esEnchufable = esEnchufable;
        this.esHibridoLIgero = esHibridoLIgero;
    }

    //Getters y Setters
    public boolean isEsEnchufable() {
        return esEnchufable;
    }
    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }
    public boolean isEsHibridoLIgero() {
        return esHibridoLIgero;
    }
    public void setEsHibridoLIgero(boolean esHibridoLIgero) {
        this.esHibridoLIgero = esHibridoLIgero;
    }

    
}
