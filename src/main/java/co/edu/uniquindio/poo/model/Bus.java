package co.edu.uniquindio.poo.model;

public class Bus extends Vehiculo{
    private int numPasajeros,numPuertas, numBolsasAire, numEjes, numSalidasEmergencias;
    private double capMaletero;
    private boolean ac, camReversa, velCruzero, abs;

    /**Constructor de bus
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param estadoRegistro
     * @param numPasajeros
     * @param numPuertas
     * @param numBolsasAire
     * @param numEjes
     * @param numSalidasEmergencias
     * @param capMaletero
     * @param ac
     * @param camReversa
     * @param velCruzero
     * @param abs
     */
    public Bus(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, EstadoRegistro estadoRegistro, int numPasajeros, int numPuertas,
            int numBolsasAire, int numEjes, int numSalidasEmergencias, double capMaletero, boolean ac,
            boolean camReversa, boolean velCruzero, boolean abs) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo, estadoRegistro);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.numEjes = numEjes;
        this.numSalidasEmergencias = numSalidasEmergencias;
        this.capMaletero = capMaletero;
        this.ac = ac;
        this.camReversa = camReversa;
        this.velCruzero = velCruzero;
        this.abs = abs;
    }

    //Getters y Setters
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

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumSalidasEmergencias() {
        return numSalidasEmergencias;
    }

    public void setNumSalidasEmergencias(int numSalidasEmergencias) {
        this.numSalidasEmergencias = numSalidasEmergencias;
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
    
}