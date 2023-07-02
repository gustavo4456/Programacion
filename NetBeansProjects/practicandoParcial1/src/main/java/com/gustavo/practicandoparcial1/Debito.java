package com.gustavo.practicandoparcial1;

/**
 *
 * @author Gustavo
 */
public class Debito extends Tarjeta {

    private float saldo;

    public Debito(float saldo, int numeroTarjeta, String fechaVencimiento, int numeroSeguridad) {
        super(numeroTarjeta, fechaVencimiento, numeroSeguridad);
        this.saldo = saldo;
    }

    public float extraerDinero(float monto) {
        if (monto <= saldo && monto > 0) {
            saldo -= monto;
            System.out.println("Extraccion exitosa. - $" + monto + ". Saldo disponible: $" + saldo);
        } else {
            System.out.println("El monto de extraccion supera su saldo disponible. ($" + saldo + ").");
        }
        return saldo;
    }

    public void depositarDinero(float monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso, saldo disponible: " + saldo);
        } else {
            System.out.println("Ingrese monto positivo.");
        }
    }

    @Override
    public float comprar(float monto, int numPagos) {
        if (numPagos == 1 && monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Compra realizada correctamente..");
        } else {
            System.out.println("Con tarjeta de debito solo puede comprar en un pago, o supero su compra supera el saldo disponible (" + this.saldo + ").");
        }

        return saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
