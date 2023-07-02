package com.gustavo.pruebaa;

/**
 *
 * @author Gustavo
 */
public class Direccion {

    private String pais;
    private String provincia;
    private String ciudad;
    private String calle;
    private int numeroCasa;

    public Direccion() {
    }

    public Direccion(String pais, String provincia, String ciudad, String calle, int numeroCasa) {
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

}
