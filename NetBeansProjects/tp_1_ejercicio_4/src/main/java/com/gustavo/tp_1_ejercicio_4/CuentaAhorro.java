/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.tp_1_ejercicio_4;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class CuentaAhorro extends Cuenta {

    private TipoPlan tipoPlan;
    private ArrayList<Acciones> acciones = new ArrayList<>();

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

    public ArrayList<Acciones> getAcciones() {
        return acciones;
    }

    public void setAcciones(ArrayList<Acciones> acciones) {
        this.acciones = acciones;
    }

    public Acciones getAccion(int index) {
        return acciones.get(index);
    }

    public boolean addAccion(Acciones e) {
        return acciones.add(e);
    }

    public Acciones removeAccion(int index) {
        return acciones.remove(index);
    }

}
