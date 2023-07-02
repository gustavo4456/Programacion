package com.gustavo.parcial2;

/**
 *
 * @author Gustavo
 */
public class Docente extends Persona {

    private int numeroLegajo;
    private Cargo tipoCargo;

    public Docente(int numeroLegajo, String nombre, String apellido, String documento, String fechaNacimiento, String sexo) {
        super(nombre, apellido, documento, fechaNacimiento, sexo);
        this.numeroLegajo = numeroLegajo;
        this.tipoCargo = new Cargo();
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Cargo getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(Cargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public int getCodigoCargo() {
        return tipoCargo.getCodigo();
    }

    public void setCodigoCargo(int codigo) {
        tipoCargo.setCodigo(codigo);
    }

    public String getDescripcionCargo() {
        return tipoCargo.getDescripcion();
    }

    public void setDescripcionCargo(String descripcion) {
        tipoCargo.setDescripcion(descripcion);
    }

}
