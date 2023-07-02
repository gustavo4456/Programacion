package com.gustavo.practicandoparcial1;

/**
 *
 * @author Gustavo
 */
public class Credito extends Tarjeta {

    private float limiteCredito;

    public Credito(int numeroTarjeta, String fechaVencimiento, int numeroSeguridad) {
        super(numeroTarjeta, fechaVencimiento, numeroSeguridad);
    }

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
    public float comprar(float monto, int numPagos) {
        if (monto <= limiteCredito && (numPagos == 1 || numPagos == 3)) {
            if (numPagos == 1) {
                limiteCredito -= monto;
                System.out.println("Compra realizada en un pago correctamente. $" + monto);
            } else {
                float pago = (monto / 3);
                limiteCredito -= pago;
                System.out.println("Compra realizada en 3 pagos correctamente. Pago: $" + pago);
            }

        } else {
            System.out.println("Supero el limite de su tarjeta de credito ($" + this.limiteCredito + ") o "
                    + "ingreso una cantiadad de pagos incorrecta, solo puede comprar en uno o dos pagos");
        }

        return limiteCredito;
    }

}
