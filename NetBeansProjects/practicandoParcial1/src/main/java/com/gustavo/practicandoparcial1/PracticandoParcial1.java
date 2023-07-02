package com.gustavo.practicandoparcial1;

/**
 *
 * @author Gustavo
 */
public class PracticandoParcial1 {

    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Argentina", "La Rioja", "La Rioja", "Calle san juan", 24112);
        CajaAhorro cajaAhorro = new CajaAhorro(20, 87, 250000, 8888282);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(42000, 9999882);
        Cliente cliente1 = new Cliente("Gustavo", 35151222, "Masculino");

        Credito tarjetaCredito1 = new Credito(111111, 2121423, "12/26", 235);
        Credito tarjetaCredito2 = new Credito(50000, 522224, "12/28", 231);
        Credito tarjetaCredito3 = new Credito(25000, 333444, "12/26", 451);
        Credito tarjetaCredito4 = new Credito(12000, 444445, "12/24", 541);

        Debito tarjetaDebito1 = new Debito(cajaAhorro.getSaldo(), 6669988, "4/24", 111);
        Debito tarjetaDebito2 = new Debito(cuentaCorriente.getSaldo(), 441247, "5/28", 197);

        cajaAhorro.addTarjeta(tarjetaCredito1);
        cajaAhorro.addTarjeta(tarjetaCredito2);
        cajaAhorro.addTarjeta(tarjetaDebito1);

        cuentaCorriente.addTarjeta(tarjetaCredito3);
        cuentaCorriente.addTarjeta(tarjetaCredito4);
        cuentaCorriente.addTarjeta(tarjetaDebito2);

        cliente1.setDireccion(direccion1);
        cliente1.addCuenta(cuentaCorriente);
        cliente1.addCuenta(cajaAhorro);

        System.out.println("Antes de la extraccion cuenta cajaAhorro: " + cajaAhorro.getSaldo());
        cliente1.extraerDinero(8000000, 8888282);
        System.out.println("Despues de la extraccion cuenta cajaAhorro " + cajaAhorro.getSaldo());
        System.out.println("\n");

        System.out.println("Antes de la extraccion cuenta cuentaCorriente: " + cuentaCorriente.getSaldo());
        cliente1.extraerDinero(5000, 9999882);
        System.out.println("Despues de la extraccion cuenta cuentaCorriente " + cuentaCorriente.getSaldo());

    }

}
