package com.gustavo.practicando2;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private Integer documento;
    private List<Direccion> direcciones;

    public Persona(String nombre, String apellido, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        direcciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public boolean addDireccion(Direccion e) {
        return direcciones.add(e);
    }

    public Direccion getDireccion(int index) {
        return direcciones.get(index);
    }

    public Direccion removeDireccion(int index) {
        return direcciones.remove(index);
    }

}
