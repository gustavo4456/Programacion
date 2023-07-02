package com.braian.recuperatorio1;

public class Hotel {
    private int codigoHotel;
    private String nombrel;
    private String direccion;
    private String ciudad;
    private int telefono;
    private int numPlazas;

    public Hotel() {
    }

    public Hotel(int codigoHotel, String nombrel, String direccion, String ciudad, int telefono, int numPlazas) {
        this.codigoHotel = codigoHotel;
        this.nombrel = nombrel;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.numPlazas = numPlazas;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getNombrel() {
        return nombrel;
    }

    public void setNombrel(String nombrel) {
        this.nombrel = nombrel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

}
