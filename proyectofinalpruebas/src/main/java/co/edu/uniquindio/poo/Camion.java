package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capCarga;
    private int numEjes; 
    private boolean ac, frenAire, abs;
    private String tipoCamion;

    /**
     * Metodo constructor de la clase Camion
     * @param codigo
     * @param marca
     * @param cambios
     * @param velMaxima
     * @param modelo
     * @param cilindraje
     * @param tipoTransmision
     * @param estadoVehiculo
     * @param capCarga
     * @param numEjes
     * @param ac
     * @param frenAire
     * @param abs
     * @param tipoCamion
     */
    public Camion(String codigo, String marca, int cambios, int velMaxima, int modelo, double cilindraje,
            TipoTransmision tipoTransmision, EstadoVehiculo estadoVehiculo, double capCarga, int numEjes, boolean ac,
            boolean frenAire, boolean abs, String tipoCamion) {
        super(codigo, marca, cambios, velMaxima, modelo, cilindraje, tipoTransmision, estadoVehiculo);
        this.capCarga = capCarga;
        this.numEjes = numEjes;
        this.ac = ac;
        this.frenAire = frenAire;
        this.abs = abs;
        this.tipoCamion = tipoCamion;
    }
    public double getCapCarga() {
        return capCarga;
    }
    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }
    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    public boolean isAc() {
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public boolean isFrenAire() {
        return frenAire;
    }
    public void setFrenAire(boolean frenAire) {
        this.frenAire = frenAire;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public String getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
}
