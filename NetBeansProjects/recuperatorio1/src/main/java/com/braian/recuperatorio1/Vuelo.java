package com.braian.recuperatorio1;

public class Vuelo {

    private int numVuelo;
    private String fechaHora;
    private String origen;
    private String destino;
    private int plazasTotales;
    private int plazasTuristas;

    public Vuelo() {
    }

    public Vuelo(int numVuelo, String fechaHora, String origen, String destino, int plazasTotales, int plazasTuristas) {
        this.numVuelo = numVuelo;
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
        this.plazasTuristas = plazasTuristas;
    }

    public String getHoraSalida(int numVuelo) {
        return "hora: ...";
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public int getPlazasTuristas() {
        return plazasTuristas;
    }

    public void setPlazasTuristas(int plazasTuristas) {
        this.plazasTuristas = plazasTuristas;
    }

}
