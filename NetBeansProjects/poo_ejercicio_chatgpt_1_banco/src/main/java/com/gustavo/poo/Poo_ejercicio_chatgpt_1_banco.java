
package com.gustavo.poo;

public class Poo_ejercicio_chatgpt_1_banco {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nacion");
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(1000);
        cuenta.retirar(500);
        
        banco.agregarCliente("Gustavo", "Silva");
        banco.agregarCliente("Maria", "Martinez");
        
        System.out.println("Cantidad de clientes del banco: " + banco.getNumeroClientes());
        
        banco.imprimirClientes();
    }
}
