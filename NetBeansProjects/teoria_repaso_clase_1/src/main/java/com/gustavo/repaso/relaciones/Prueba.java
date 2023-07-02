/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.repaso.relaciones;

/**
 *
 * @author gustavo
 */
public class Prueba {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("fasd", "Gustavo", "Silva");
        Vehiculo auto = new Vehiculo("RSA424", "FORD", "FIESTA", "gris", 24000, true);
        
        VehiculoAlquilado autoAlquilado = new VehiculoAlquilado(cliente1, auto, 20, 2, 2023, 10);
        
        System.out.println("EL AUTO ALQUILADO ES: " + autoAlquilado.toString());
    }
}
