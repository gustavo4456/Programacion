package com.gustavo.tp_1_ejercicio_3;

public class Copiloto extends Piloto {

    public void apoyarAlPiloto() {
        System.out.println("El copiloto " + getNombre() + " apoya al capitan.");
    }

    public void cominicarseTierra() {
        System.out.println("El copiloto " + getNombre() + " se comunica con tierra.");
    }
}
