package com.gustavo.pruebaa;

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
        this.tarjetas = new ArrayList<>();
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
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

    public boolean addTarjeta(Tarjeta e) {
        return tarjetas.add(e);
    }

    public Tarjeta getTarjeta(int index) {
        return tarjetas.get(index);
    }

    public Tarjeta removeTarjeta(int index) {
        return tarjetas.remove(index);
    }

}
