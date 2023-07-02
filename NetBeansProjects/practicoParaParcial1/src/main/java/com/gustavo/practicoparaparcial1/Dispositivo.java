package com.gustavo.practicoparaparcial1;

public class Dispositivo {

    private enum estado {
        ACTIVO,
        PASIVO
    }
    private String nombre;
    private int cantidadBocas;
    private int bocasDisponibles;

    public boolean esActivo() {

        return true;
    }

    public Dispositivo(int cantidadBocas, int bocasDisponibles, String nombre) {
        this.cantidadBocas = cantidadBocas;
        this.bocasDisponibles = bocasDisponibles;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadBocas() {
        return cantidadBocas;
    }

    public void setCantidadBocas(int cantidadBocas) {
        this.cantidadBocas = cantidadBocas;
    }

    public int getBocasDisponibles() {
        return bocasDisponibles;
    }

    public void setBocasDisponibles(int bocasDisponibles) {
        this.bocasDisponibles = bocasDisponibles;
    }

}
