package com.gustavo.modelo;

public class Persona {

    private int id;
    private String apellidoNombre;

    public Persona() {
    }

    public Persona(int id, String apellidoNombre) {
        this.id = id;
        this.apellidoNombre = apellidoNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

}
