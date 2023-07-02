package com.gustavo.tp_1_ejercicio_1;

public class Profesor extends Persona{

    private Integer dedicacion;
    private String materia;

    public void enseñar() {

    }

    public Integer getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(Integer dedicacion) {
        this.dedicacion = dedicacion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
