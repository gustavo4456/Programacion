package com.gustavo.practicandoparcial1;

/**
 *
 * @author Gustavo
 */
public class CajaAhorro extends Cuenta {

    private int limiteTransacciones;
    private float tasaInteres;

    public CajaAhorro(float saldo, int numeroCuenta) {
        super(saldo, numeroCuenta);
    }

    public CajaAhorro(int limiteTransacciones, float tasaInteres, float saldo, int numeroCuenta) {
        super(saldo, numeroCuenta);
        this.limiteTransacciones = limiteTransacciones;
        this.tasaInteres = tasaInteres;
    }

    public int getLimiteTransacciones() {
        return limiteTransacciones;
    }

    public void setLimiteTransacciones(int limiteTransacciones) {
        this.limiteTransacciones = limiteTransacciones;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

}
