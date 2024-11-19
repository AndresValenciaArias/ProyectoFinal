package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numPasajeros,numPuertas, numBolsasAire;
    private double cabFuerza, t0_100;

    /**
     * Metodo constructor de la clase Deportivo
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param numPasajeros
     * @param numPuertas
     * @param numBolsasAire
     * @param cabFuerza
     * @param t0_100
     */
    public Deportivo(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, int numPasajeros, int numPuertas,
            int numBolsasAire, double cabFuerza, double t0_100) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.cabFuerza = cabFuerza;
        this.t0_100 = t0_100;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    public double getCabFuerza() {
        return cabFuerza;
    }
    public void setCabFuerza(double cabFuerza) {
        this.cabFuerza = cabFuerza;
    }
    public double getT0_100() {
        return t0_100;
    }
    public void setT0_100(double t0_100) {
        this.t0_100 = t0_100;
    }
    
}
