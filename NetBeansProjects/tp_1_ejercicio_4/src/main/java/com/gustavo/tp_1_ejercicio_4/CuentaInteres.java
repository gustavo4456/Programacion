/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.tp_1_ejercicio_4;

/**
 *
 * @author Gustavo
 */
public class CuentaInteres extends Cuenta {

    private TipoPlan tipoPlan;

    public void acumularTasaInteres() {
        System.out.println("Dinero acumulado con tasa de interes.");
    }

    public TipoPlan getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(TipoPlan tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getNombrePlan() {
        return tipoPlan.getNombre();
    }

    public void setNombrePlan(String nombre) {
        tipoPlan.setNombre(nombre);
    }

    public Float getTasaInteresPlan() {
        return tipoPlan.getTasaInteres();
    }

    public void setTasaInteresPlan(Float tasaInteres) {
        tipoPlan.setTasaInteres(tasaInteres);
    }
    
    
}
