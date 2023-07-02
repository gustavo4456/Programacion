package com.gustavo.tp_1_ejercicio_3;

import java.util.ArrayList;

public class Aeropuerto {

    private Integer id;
    private String nombre;
    private String ubicacion;
    private ArrayList<Vuelo> vuelos = new ArrayList<>();

    public void mantenimientoPistas() {

    }

    public void control() {

    }

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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public Vuelo get(int index) {
        return vuelos.get(index);
    }

    public boolean add(Vuelo e) {
        return vuelos.add(e);
    }

    public Vuelo remove(int index) {
        return vuelos.remove(index);
    }

}
