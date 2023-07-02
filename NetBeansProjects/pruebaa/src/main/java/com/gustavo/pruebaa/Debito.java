package com.gustavo.pruebaa;

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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public float comprar(float monto, int numPago) {
        System.out.println("Ustede realizo compra de  $" + monto + " en un pago.");
        return 0;
    }

}
