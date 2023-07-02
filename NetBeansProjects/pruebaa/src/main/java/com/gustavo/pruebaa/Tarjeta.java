package com.gustavo.pruebaa;

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
    
//    Metodo abstracto
    public abstract float comprar(float monto, int numPago);

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
