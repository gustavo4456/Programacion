/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.tp_1_ejercicio_4;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Cliente {

    private String nombre;
    private ArrayList<Direccion> direcciones = new ArrayList<>();
    private ArrayList<Cuenta> cuenta = new ArrayList<>();

    public void darBaja() {
        System.out.println("El usuario fue dado de baja.");
    }

    public void extraerDinero() {
        System.out.println("Extrajo dinero");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta getCuentaIndex(int index) {
        return cuenta.get(index);
    }

    public boolean addCuenta(Cuenta e) {
        return cuenta.add(e);
    }

    public Cuenta removeCuenta(int index) {
        return cuenta.remove(index);
    }

    public Direccion get(int index) {
        return direcciones.get(index);
    }

    public boolean addDireccion(Direccion e) {
        return direcciones.add(e);
    }

    public Direccion removeDireccionIndex(int index) {
        return direcciones.remove(index);
    }
    
    

    
}
