package com.gustavo.tp_1_ejercicio_3;

import java.util.ArrayList;

public class Aerolinea {

    private Integer id;
    private String nombre;
    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    private ArrayList<Piloto> pilotos = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public Vuelo getVuelo(int index) {
        return vuelos.get(index);
    }

    public boolean addVuelo(Vuelo e) {
        return vuelos.add(e);
    }

    public Vuelo removeVuelo(int index) {
        return vuelos.remove(index);
    }

    public Piloto getPiloto(int index) {
        return pilotos.get(index);
    }

    public boolean addPiloto(Piloto e) {
        return pilotos.add(e);
    }

    public Piloto removePilotos(int index) {
        return pilotos.remove(index);
    }

}
