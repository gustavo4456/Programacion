package com.gustavo.practicando2;

public class Empleado extends Persona {

    private Integer numeroLegajo;
    private Integer aniosAntiguedad;
    private Area area;

    public Empleado(Integer numeroLegajo, Integer aniosAntiguedad, String nombre, String apellido, Integer documento) {
        super(nombre, apellido, documento);
        this.numeroLegajo = numeroLegajo;
        this.aniosAntiguedad = aniosAntiguedad;
        area = new Area();
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Integer getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(Integer aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNombreArea() {
        return area.getNombre();
    }

    public void setNombreArea(String nombre) {
        area.setNombre(nombre);
    }

}
