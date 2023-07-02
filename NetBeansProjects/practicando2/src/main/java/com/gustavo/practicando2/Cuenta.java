package com.gustavo.practicando2;

public class Cuenta {

    private String tipo;
    private float saldo;

    public Cuenta(String tipo, float saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
