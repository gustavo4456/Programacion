package com.gustavo.parcial2;

/**
 *
 * @author Gustavo
 */
public class Cargo {

    private int codigo;
    private String descripcion;

    public Cargo() {
    }

    public Cargo(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
