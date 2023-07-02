package com.gustavo.tp_1_ejercicio_3;

public class Navegante extends Piloto{
    
    public void planificarVuelo() {
        System.out.println("El Navegante " + getNombre() + " planifica vuelo");
    }
    
    public void monitorearSistemasNavegacion() {
        System.out.println("El Navegante " + getNombre() + " monitorear sistemas de navegacion.");
    }
}
