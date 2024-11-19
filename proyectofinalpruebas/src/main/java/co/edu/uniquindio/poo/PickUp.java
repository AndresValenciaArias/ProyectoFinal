package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo{
    private int numPasajeros,numPuertas, numBolsasAire;
    private double capMaletero, capacidad;
    private boolean ac, camReversa, velCruzero, abs, s4x4;

    /**
     * Metodo constructor de la clase PickUp
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
     * @param capMaletero
     * @param capacidad
     * @param ac
     * @param camReversa
     * @param velCruzero
     * @param abs
     * @param s4x4
     */
    public PickUp(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, int numPasajeros, int numPuertas,
            int numBolsasAire, double capMaletero, double capacidad, boolean ac, boolean camReversa, boolean velCruzero,
            boolean abs, boolean s4x4) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capMaletero = capMaletero;
        this.capacidad = capacidad;
        this.ac = ac;
        this.camReversa = camReversa;
        this.velCruzero = velCruzero;
        this.abs = abs;
        this.s4x4 = s4x4;
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
    public double getCapMaletero() {
        return capMaletero;
    }
    public void setCapMaletero(double capMaletero) {
        this.capMaletero = capMaletero;
    }
    public boolean isAc() {
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public boolean isCamReversa() {
        return camReversa;
    }
    public void setCamReversa(boolean camReversa) {
        this.camReversa = camReversa;
    }
    public boolean isVelCruzero() {
        return velCruzero;
    }
    public void setVelCruzero(boolean velCruzero) {
        this.velCruzero = velCruzero;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public boolean isS4x4() {
        return s4x4;
    }
    public void setS4x4(boolean s4x4) {
        this.s4x4 = s4x4;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
}
