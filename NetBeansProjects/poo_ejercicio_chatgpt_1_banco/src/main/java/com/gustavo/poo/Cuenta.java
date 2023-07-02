package com.gustavo.poo;

class Cuenta {

    private float saldo;

    public void depositar(float deposito) {
        saldo += deposito;
    }

    public void retirar(float retiro) {
        if (retiro <= saldo) {
            saldo -= retiro;
            System.out.println("Retiro exitoso, saldo restante: " + saldo);
        }else{
            System.out.println("El retiro ingresado supera el saldo disponible. saldo: " + saldo);
        }

    }
}
