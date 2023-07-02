package com.gustavo.tp_1_ejercicio_3;

import java.util.ArrayList;

public class Vuelo {

    private Integer id;
    private String salidaAeropuerto;
    private String llegadaAeropuerto;
    private Avion avion = new Avion();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalidaAeropuerto() {
        return salidaAeropuerto;
    }

    public void setSalidaAeropuerto(String salidaAeropuerto) {
        this.salidaAeropuerto = salidaAeropuerto;
    }

    public String getLlegadaAeropuerto() {
        return llegadaAeropuerto;
    }

    public void setLlegadaAeropuerto(String llegadaAeropuerto) {
        this.llegadaAeropuerto = llegadaAeropuerto;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void estaEnTierraAire() {
        avion.estaEnTierraAire();
    }

    public String getTipo() {
        return avion.getTipo();
    }

    public void setTipo(String tipo) {
        avion.setTipo(tipo);
    }

    public String getEstado() {
        return avion.getEstado();
    }

    public void setEstado(String estado) {
        avion.setEstado(estado);
    }

    public ArrayList<Piloto> getPilotos() {
        return avion.getPilotos();
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        avion.setPilotos(pilotos);
    }

    public Piloto getPiloto(int index) {
        return avion.getPiloto(index);
    }

    public boolean addPiloto(Piloto e) {
        return avion.addPiloto(e);
    }

    public Piloto removePiloto(int index) {
        return avion.removePiloto(index);
    }

}
