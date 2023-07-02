package com.gustavo.pruebaa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Cliente {

    private String nombre;
    private int documento;
    private String sexo;
//    Relacion de asociacion
    private Direccion direccion;
//    Relacion de composicion
    private List<Cuenta> cuentas;

    public Cliente(String nombre, int documento, String sexo) {
        this.nombre = nombre;
        this.documento = documento;
        this.sexo = sexo;
        this.direccion = new Direccion();
        this.cuentas = new ArrayList<>();
    }

    public void pagarImpuesto(float monto, String nombreImpuesto) {
        System.out.println("Realizo el pago de  $" + monto + " del impuesto " + nombreImpuesto);

    }

    public void extraerDinero(float monto) {
        System.out.println("Extrajo $" + monto);
    }

    public void transferencias(float monto, int cbuDestino, int numeroTarjetaOrigen) {
        System.out.println("Realizo una transferencia de " + monto + " al cbu " + cbuDestino);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public boolean addCuenta(Cuenta e) {
        return cuentas.add(e);
    }

    public Cuenta getCuenta(int index) {
        return cuentas.get(index);
    }

    public Cuenta removeCuenta(int index) {
        return cuentas.remove(index);
    }

    public String getPais() {
        return direccion.getPais();
    }

    public void setPais(String pais) {
        direccion.setPais(pais);
    }

    public String getProvincia() {
        return direccion.getProvincia();
    }

    public void setProvincia(String provincia) {
        direccion.setProvincia(provincia);
    }

    public String getCiudad() {
        return direccion.getCiudad();
    }

    public void setCiudad(String ciudad) {
        direccion.setCiudad(ciudad);
    }

    public String getCalle() {
        return direccion.getCalle();
    }

    public void setCalle(String calle) {
        direccion.setCalle(calle);
    }

    public int getNumeroCasa() {
        return direccion.getNumeroCasa();
    }

    public void setNumeroCasa(int numeroCasa) {
        direccion.setNumeroCasa(numeroCasa);
    }

}
