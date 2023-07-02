package com.gustavo.practicandoparcial1;

/**
 *
 * @author Gustavo
 */
public abstract class Tarjeta {

    private int numeroTarjeta;
    private String fechaVencimiento;
    private int numeroSeguridad;

    public Tarjeta(int numeroTarjeta, String fechaVencimiento, int numeroSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.numeroSeguridad = numeroSeguridad;
    }

    public abstract float comprar(float monto, int numPagos);

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumeroSeguridad() {
        return numeroSeguridad;
    }

    public void setNumeroSeguridad(int numeroSeguridad) {
        this.numeroSeguridad = numeroSeguridad;
    }

}
