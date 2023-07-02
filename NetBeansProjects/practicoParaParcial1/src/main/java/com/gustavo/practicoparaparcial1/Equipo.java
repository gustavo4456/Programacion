package com.gustavo.practicoparaparcial1;

public class Equipo {

    private int placaRed;
    private String marcaEquipo;

    public Equipo(int placaRed, String marcaEquipo) {
        this.placaRed = placaRed;
        this.marcaEquipo = marcaEquipo;
    }

    public int getPlacaRed() {
        return placaRed;
    }

    public void setPlacaRed(int placaRed) {
        this.placaRed = placaRed;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public void setMarcaEquipo(String marcaEquipo) {
        this.marcaEquipo = marcaEquipo;
    }

}
