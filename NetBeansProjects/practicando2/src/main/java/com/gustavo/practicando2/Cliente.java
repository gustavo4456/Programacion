package com.gustavo.practicando2;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements ICompra {

    private Integer numeroCliente;
    private List<Cuenta> cuentas;
    private List<Tarjeta> tarjetas;
    private Seguro seguro;

    public Cliente(Integer numeroCliente, String nombre, String apellido, Integer documento) {
        super(nombre, apellido, documento);
        this.numeroCliente = numeroCliente;
        cuentas = new ArrayList<>();
        tarjetas = new ArrayList<>();
        seguro = new Seguro();
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return seguro.getNombre();
    }

    public void setNombreSeguro(String nombre) {
        seguro.setNombre(nombre);
    }

    public String getTipoSeguro() {
        return seguro.getTipo();
    }

    public void setTipoSeguro(String tipo) {
        seguro.setTipo(tipo);
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

    public boolean addTarjeta(Tarjeta e) {
        return tarjetas.add(e);
    }

    public Tarjeta getTarjeta(int index) {
        return tarjetas.get(index);
    }

    public Tarjeta removeTarjeta(int index) {
        return tarjetas.remove(index);
    }

    @Override
    public void compra(Cuenta cuenta, Tarjeta tarjeta) {
        System.out.println("-------------------COMPRA-----------------------");
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("APELLIDO: " + getApellido());
        System.out.println("DOCUMENTO: " + getDocumento());
        System.out.println("NUMERO DE CLIENTE: " + getNumeroCliente());
        System.out.println("TIPO DE CUENTA: " + cuenta.getTipo());
        System.out.println("SALDO: " + cuenta.getSaldo());
        System.out.println("TIPO DE TARJETA: " + tarjeta.getTipo());
        System.out.println("SALDO DE COMPRA: " + tarjeta.getSaldoCompra());
    }

}
