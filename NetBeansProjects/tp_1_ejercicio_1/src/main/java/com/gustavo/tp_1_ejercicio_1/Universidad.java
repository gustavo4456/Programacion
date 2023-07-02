package com.gustavo.tp_1_ejercicio_1;

import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private String tipo;
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<Aula> aulas = new ArrayList<>();

    public void formarPersonas() {

    }

    public void investigar() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public Departamento getDepartamento(int index) {
        return departamentos.get(index);
    }

    public boolean addDepartamento(Departamento e) {
        return departamentos.add(e);
    }

    public Departamento removeDepartamento(int index) {
        return departamentos.remove(index);
    }

    public Aula getAula(int index) {
        return aulas.get(index);
    }

    public boolean addAula(Aula e) {
        return aulas.add(e);
    }

    public Aula removeAula(int index) {
        return aulas.remove(index);
    }

    public Persona getPersona(int index) {
        return personas.get(index);
    }

    public boolean addPersona(Persona e) {
        return personas.add(e);
    }

    public Persona removePersona(int index) {
        return personas.remove(index);
    }

}
