package com.gustavo.tp_1_ejercicio_3;

import java.util.ArrayList;

public class Avion {

    private String tipo;
    private String estado;
    private ArrayList<Piloto> pilotos = new ArrayList<>();

    public void estaEnTierraAire() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public Piloto getPiloto(int index) {
        return pilotos.get(index);
    }

    public boolean addPiloto(Piloto e) {
        return pilotos.add(e);
    }

    public Piloto removePiloto(int index) {
        return pilotos.remove(index);
    }

}
