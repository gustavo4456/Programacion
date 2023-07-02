package com.gustavo.tp_1_ejercicio_1;

import java.util.ArrayList;

public class Aula {

    private Integer id;
    private Integer capacidadSillas;
    private boolean tieneProyector;
    private ArrayList<Silla> sillas = new ArrayList<>();

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidadSillas() {
        return capacidadSillas;
    }

    public void setCapacidadSillas(Integer capacidadSillas) {
        this.capacidadSillas = capacidadSillas;
    }

    public boolean isTieneProyector() {
        return tieneProyector;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }

    public Silla get(int index) {
        return sillas.get(index);
    }

    public boolean add(Silla e) {
        return sillas.add(e);
    }

    public Silla remove(int index) {
        return sillas.remove(index);
    }

}
