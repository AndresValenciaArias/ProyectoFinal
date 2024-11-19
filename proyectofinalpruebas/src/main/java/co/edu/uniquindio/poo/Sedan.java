package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int numPasajeros,numPuertas, numBolsasAire;
    private double capMaletero;
    private boolean ac, camReversa, velCruzero, abs, senColision, senTrafiCruzado, asisPermanenciaCarril;

    /**
     * Metodo constructor de la clase Sedan
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
     * @param ac
     * @param camReversa
     * @param velCruzero
     * @param abs
     * @param senColision
     * @param senTrafiCruzado
     * @param asisPermanenciaCarril
     */
    public Sedan(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, int numPasajeros, int numPuertas,
            int numBolsasAire, double capMaletero, boolean ac, boolean camReversa, boolean velCruzero, boolean abs,
            boolean senColision, boolean senTrafiCruzado, boolean asisPermanenciaCarril) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capMaletero = capMaletero;
        this.ac = ac;
        this.camReversa = camReversa;
        this.velCruzero = velCruzero;
        this.abs = abs;
        this.senColision = senColision;
        this.senTrafiCruzado = senTrafiCruzado;
        this.asisPermanenciaCarril = asisPermanenciaCarril;
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

    public boolean isSenColision() {
        return senColision;
    }

    public void setSenColision(boolean senColision) {
        this.senColision = senColision;
    }

    public boolean isSenTrafiCruzado() {
        return senTrafiCruzado;
    }

    public void setSenTrafiCruzado(boolean senTrafiCruzado) {
        this.senTrafiCruzado = senTrafiCruzado;
    }

    public boolean isAsisPermanenciaCarril() {
        return asisPermanenciaCarril;
    }

    public void setAsisPermanenciaCarril(boolean asisPermanenciaCarril) {
        this.asisPermanenciaCarril = asisPermanenciaCarril;
    }

}