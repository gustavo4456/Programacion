package com.gustavo.practicando2;


/**
 * Silva Artaza Gustavo Francisco
 * Riveros Fabricio
 * Troncozo Braian
 */

public class Practicando2 {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta("Ahorros en pesos", 50000);
        Tarjeta tarjeta1 = new Tarjeta("Debito", 50000);
        
        Cliente cliente1 = new Cliente(7541864, "Gustavo", "Silva Artaza", 345482);
        cliente1.setNombreSeguro("Plus");
        cliente1.setTipoSeguro("De vida");
        cliente1.addCuenta(cuenta1);
        cliente1.addTarjeta(tarjeta1);
        
        System.out.println("----------------Cliente---------------");
        cliente1.compra(cuenta1, tarjeta1);
        
        
    }
}
