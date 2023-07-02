package com.gustavo.parcial2;

/**
 *
 * @author Gustavo
 */
public class Alumno extends Persona {

    private int matricula;

    public Alumno(int matricula, String nombre, String apellido, String documento, String fechaNacimiento, String sexo) {
        super(nombre, apellido, documento, fechaNacimiento, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
