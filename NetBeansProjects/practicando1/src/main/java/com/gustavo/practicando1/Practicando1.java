/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.gustavo.practicando1;

/**
 *
 * @author Gustavo
 */
public class Practicando1 {

    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Calle 124");
        domicilio.setDepartamento("La Rioja");
        domicilio.setLocalidad("La Rioja");
        domicilio.setNumero(124124);

        Empleado empleado = new Empleado();

        empleado.setNumeroLegajo(4214);
        empleado.setAntiguedad(10);
        empleado.setDomicilio(domicilio);

        System.out.println("DATOS EMPLEADO");
        System.out.println("Numero de legajo: " + empleado.getNumeroLegajo());
        System.out.println("Antiguedad: " + empleado.getAntiguedad());
        System.out.println("DATOS DEL DOMICILIO DEL EMPLEADO");
        System.out.println("Calle: " + empleado.getCalle());
        System.out.println("Numero de casa: " + empleado.getNumero());
        System.out.println("Departamento: " + empleado.getDepartamento());
        System.out.println("Localidad: " + empleado.getLocalidad());

    }
}
