package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Transaccion {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private TipoTransaccion tipoTransaccion;
    private LocalDate fechaTransaccion;

    /**Constructor de transaccion
     * @param vehiculo
     * @param cliente
     * @param empleado
     * @param tipoTransaccion
     * @param fechaTransaccion
     */
    public Transaccion(Vehiculo vehiculo, Cliente cliente, Empleado empleado, TipoTransaccion tipoTransaccion, LocalDate fechaTransaccion) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.tipoTransaccion = tipoTransaccion;
        this.fechaTransaccion = fechaTransaccion;
    }

    //Getters y Setters

    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

}
