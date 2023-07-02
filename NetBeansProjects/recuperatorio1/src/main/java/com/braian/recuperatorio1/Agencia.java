package com.braian.recuperatorio1;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private String nombre;
    private List<Hotel> hoteles;
    private List<Vuelo> vuelos;
    private List<Sucursal> sucursales;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.hoteles = new ArrayList<>();
        this.vuelos = new ArrayList<>();
        this.sucursales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public boolean addHotel(Hotel e) {
        return hoteles.add(e);
    }

    public Hotel getHotel(int index) {
        return hoteles.get(index);
    }

    public Hotel removeHotel(int index) {
        return hoteles.remove(index);
    }

    public Sucursal getSucursal(int index) {
        return sucursales.get(index);
    }

    public void addSucursal(int index, Sucursal element) {
        sucursales.add(index, element);
    }

    public Sucursal removeSucursal(int index) {
        return sucursales.remove(index);
    }

    public Vuelo getVuelo(int index) {
        return vuelos.get(index);
    }

    public void addVuelo(int index, Vuelo element) {
        vuelos.add(index, element);
    }

    public Vuelo removeVuelo(int index) {
        return vuelos.remove(index);
    }

}
