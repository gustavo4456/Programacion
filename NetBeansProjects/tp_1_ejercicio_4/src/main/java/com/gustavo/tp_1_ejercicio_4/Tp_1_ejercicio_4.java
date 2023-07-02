package com.gustavo.tp_1_ejercicio_4;

/*  Paradigmas de programacion III 
    Practico 1, ejercicio 4
    Nombre: Silva Artaza Gustavo Francisco
    Matricula: ELSI440
 */
public class Tp_1_ejercicio_4 {

    public static void main(String[] args) {
        int contador = 0;
        Cliente cliente = new Cliente();
        Direccion direccion = new Direccion();
        Cuenta cuenta = new Cuenta();

        cuenta.setSaldo(8485.45f);
        cuenta.setCbu(989894212);
        cuenta.setAlias("PERRO.GATO.PAJARO");

        direccion.setCalle("Calle 1");
        direccion.setNumeroCasa(45455);
        direccion.setReferencia("Porton negro");

        cliente.setNombre("Gustavo");

        cliente.addCuenta(cuenta);
        cliente.addDireccion(direccion);
        cliente.addDireccion(direccion);

        System.out.println("DATOS DEL CLIENTE");
        System.out.println("NOMBRE: " + cliente.getNombre());

        System.out.println();

        for (Cuenta cuentaArray : cliente.getCuenta()) {
            contador++;
            System.out.println("SALDO " + cuentaArray.getSaldo());
            System.out.println("CBU: " + cuentaArray.getCbu());
            System.out.println("ALIAS: " + cuentaArray.getAlias());
            System.out.println();
        }

        for (Direccion direccionArray : cliente.getDirecciones()) {
            contador++;
            System.out.println("DIRECCION NRO " + contador);
            System.out.println("CALLE: " + direccionArray.getCalle());
            System.out.println("NUMERO DE LA CASA: " + direccionArray.getNumeroCasa());
            System.out.println("REFERENCIA: " + direccion.getReferencia());
            System.out.println();
        }
    }
}
