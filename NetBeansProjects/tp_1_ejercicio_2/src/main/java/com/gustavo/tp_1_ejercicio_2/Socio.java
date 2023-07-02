package com.gustavo.tp_1_ejercicio_2;

import java.util.ArrayList;

public class Socio extends Usuario {

    private Integer numeroSocio;
    private ArrayList<Alquiler> alquiler = new ArrayList<>();

    public void alquilarPelicula() {

    }

    public ArrayList<Alquiler> getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(ArrayList<Alquiler> alquiler) {
        this.alquiler = alquiler;
    }

    public Integer getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(Integer numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public Alquiler getAlquiler(int index) {
        return alquiler.get(index);
    }

    public boolean addAlquiler(Alquiler e) {
        return alquiler.add(e);
    }

    public Alquiler removeAlquiler(int index) {
        return alquiler.remove(index);
    }

}
