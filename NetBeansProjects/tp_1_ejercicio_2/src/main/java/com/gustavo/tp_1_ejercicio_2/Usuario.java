package com.gustavo.tp_1_ejercicio_2;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private Integer numeroCelular;
    private Tarjeta tarjeta = new Tarjeta();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void soliciarSocio() {

    }

    public void comprarPelicula() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void actualizarCreditoTarjeta() {
        tarjeta.actualizarCredito();
    }

    public Integer getCodigoTarjeta() {
        return tarjeta.getCodigo();
    }

    public void setCodigoTarjeta(Integer codigo) {
        tarjeta.setCodigo(codigo);
    }

    public float getSaldoTarjeta() {
        return tarjeta.getSaldo();
    }

    public void setSaldoTarjeta(float saldo) {
        tarjeta.setSaldo(saldo);
    }

    public Pedido getPedido(int index) {
        return pedidos.get(index);
    }

    public boolean addPedido(Pedido e) {
        return pedidos.add(e);
    }

    public Pedido removePedido(int index) {
        return pedidos.remove(index);
    }

}
