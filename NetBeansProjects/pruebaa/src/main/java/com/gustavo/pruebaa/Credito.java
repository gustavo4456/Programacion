package com.gustavo.pruebaa;

/**
 *
 * @author Gustavo
 */
public class Credito extends Tarjeta {

    private float limiteCredito;

    public Credito(float limiteCredito, int numeroTarjeta, String fechaVencimiento, int numeroSeguridad) {
        super(numeroTarjeta, fechaVencimiento, numeroSeguridad);
        this.limiteCredito = limiteCredito;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public float comprar(float monto, int numPago) {
        System.out.println("Ustede realizo compra de  $" + monto + " y lo hizo en  " + numPago + " pagos.");
        return 0;
    }

}
