/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.practicando1;

/**
 *
 * @author Gustavo
 */
public class Empleado extends Persona {

    private Integer numeroLegajo;
    private Integer antiguedad;
    private Area areaTrabajo;

    public Area getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(Area areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return areaTrabajo.getNombre();
    }

    public void setNombre(String nombre) {
        areaTrabajo.setNombre(nombre);
    }

    public String getDescripcion() {
        return areaTrabajo.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        areaTrabajo.setDescripcion(descripcion);
    }

}
