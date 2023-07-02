/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.tp_1_ejercicio_4;

/**
 *
 * @author Gustavo
 */
public class Cuenta {

    private Float saldo;
    private Integer cbu;
    private String alias;

    public void pausarCuenta() {
        System.out.println("Cuenta pausada.");
    }

    public void resumen() {
        System.out.println("Saldo: " + saldo + " CBU: " + cbu + " ALIAS: " + alias);
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
