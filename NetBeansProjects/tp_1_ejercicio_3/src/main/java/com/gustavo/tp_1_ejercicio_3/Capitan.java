package com.gustavo.tp_1_ejercicio_3;

public class Capitan extends Piloto {

    public void supervisarAvion() {
        System.out.println("El capitan " + getNombre() + " supervisa el avion.");
    }

    public void planificarVuelo() {
        System.out.println("El capitan " + getNombre() + " planifica vuelo.");
    }
}
