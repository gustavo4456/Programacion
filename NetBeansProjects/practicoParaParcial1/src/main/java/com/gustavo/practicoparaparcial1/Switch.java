package com.gustavo.practicoparaparcial1;

public class Switch extends Dispositivo implements ConexionDis {

    public Switch(int cantidadBocas, int bocasDisponibles, String nombre) {
        super(cantidadBocas, bocasDisponibles, nombre);
    }

    @Override
    public boolean conexion(Dispositivo dispositivo) {
        System.out.println("Se conecto a " + dispositivo.getNombre());
        return true;
    }

}
