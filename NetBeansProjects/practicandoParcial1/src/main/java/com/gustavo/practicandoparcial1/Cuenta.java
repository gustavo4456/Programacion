package com.gustavo.practicandoparcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Cuenta {

    private float saldo;
    private int numeroCuenta;
    private List<Tarjeta> tarjetas;

    public Cuenta(float saldo, int numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        tarjetas = new ArrayList<>();
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public boolean addTarjeta(Tarjeta e) {
        boolean exiteDebito = false;
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta instanceof Debito) {
                exiteDebito = true;
            }
        }

        if (!exiteDebito) {
            tarjetas.add(e);
        } else {
            System.out.println("Su cuenta ya tiene una tarjeta de debito asociada.");
        }

        return exiteDebito;
    }

    public Tarjeta getTarjeta(int index) {
        return tarjetas.get(index);
    }

    public Tarjeta removeTarjeta(int index) {
        return tarjetas.remove(index);
    }

}
