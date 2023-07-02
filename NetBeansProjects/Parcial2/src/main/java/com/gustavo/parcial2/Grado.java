package com.gustavo.parcial2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Grado {

    private int numero;
    private String seccion;
    private Turno turno;
    List<Docente> docentes = new ArrayList<>();
    List<Alumno> alumnos = new ArrayList<>();

    public Grado(int numero, String seccion) {
        this.numero = numero;
        this.seccion = seccion;
        this.turno = new Turno();
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    //DELEGATES
    public boolean addAlumno(Alumno e) {
        return alumnos.add(e);
    }

    public Alumno getAlumno(int index) {
        return alumnos.get(index);
    }

    public Alumno removeAlumno(int index) {
        return alumnos.remove(index);
    }

    public boolean addDocente(Docente e) {
        return docentes.add(e);
    }

    public Docente getDocente(int index) {
        return docentes.get(index);
    }

    public Docente removeDocente(int index) {
        return docentes.remove(index);
    }

    public String getCodigoTurno() {
        return turno.getCodigo();
    }

    public void setCodigoTurno(String codigo) {
        turno.setCodigo(codigo);
    }

    public String getDescripcionTurno() {
        return turno.getDescripcion();
    }

    public void setDescripcionTurno(String descripcion) {
        turno.setDescripcion(descripcion);
    }

}
