package com.gustavo.pruebaenum;

public class PruebaEnum {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(Cuenta.Estado.PAUSADA);
        
        System.out.println("La cuenta esta: " + cuenta.getEstado());
    }
}
