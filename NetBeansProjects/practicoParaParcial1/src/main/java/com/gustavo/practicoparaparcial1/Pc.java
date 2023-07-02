package com.gustavo.practicoparaparcial1;

public class Pc extends Equipo implements ConexionPc{

    public Pc(int placaRed, String marcaEquipo) {
        super(placaRed, marcaEquipo);
    }

    @Override
    public boolean conexion(Switch swt, Hub hub, Wifi wifi) {
        System.out.println("Conexion exitosa");
        return true;
    }

}
