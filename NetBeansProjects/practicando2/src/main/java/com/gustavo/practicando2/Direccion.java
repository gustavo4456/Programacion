package com.gustavo.practicando2;

public class Direccion {

    private String nombreCalle;
    private Integer numero;
    private String ciudad;

    public Direccion(String nombreCalle, Integer numero, String ciudad) {
        this.nombreCalle = nombreCalle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
