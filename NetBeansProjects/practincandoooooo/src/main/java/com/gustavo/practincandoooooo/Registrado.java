/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.practincandoooooo;

/**
 *
 * @author Gustavo
 */
public class Registrado extends Usuario {

    private String correo;
    private int clave;

    public Registrado(String correo, int clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public Registrado(String correo, int clave, String ip, String navegador) {
        super(ip, navegador);
        this.correo = correo;
        this.clave = clave;
    }

    public boolean inicarSesion() {
        return true;
    }
}
