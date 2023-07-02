package com.gustavo.practicando2;

public class Tarjeta {

    private String tipo;
    private float saldoCompra;

    public Tarjeta(String tipo, float saldoCompra) {
        this.tipo = tipo;
        this.saldoCompra = saldoCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldoCompra() {
        return saldoCompra;
    }

    public void setSaldoCompra(float saldoCompra) {
        this.saldoCompra = saldoCompra;
    }

}
