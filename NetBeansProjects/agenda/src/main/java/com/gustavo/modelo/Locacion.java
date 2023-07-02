package com.gustavo.modelo;

public class Locacion {

    private int id;
    private String nombre;
    private String domicilio;
    private boolean estado;

    public Locacion() {
    }

    public Locacion(int id, String nombre, String domicilio, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
