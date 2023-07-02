package com.gustavo.tp_1_ejercicio_1;

import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private ArrayList<Oficina> oficinas = new ArrayList<>();

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public void crearPlanEstudio() {

    }

    public void bridarInformacion() {

    }

    public void gestionRecursosHumanos() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Oficina get(int index) {
        return oficinas.get(index);
    }

    public boolean add(Oficina e) {
        return oficinas.add(e);
    }

    public Oficina remove(int index) {
        return oficinas.remove(index);
    }

}
