package com.gustavo.recuperatorio2doparcial;


public class Persona {

    private int id;
    private String nombreApellido;

    public Persona(int id, String nombreApellido) {
        this.id = id;
        this.nombreApellido = nombreApellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

}
