package com.gustavo.practicoparaparcial1;

public class Notebook extends Equipo implements ConexionNote {

    public Notebook(int placaRed, String marcaEquipo) {
        super(placaRed, marcaEquipo);
    }

    @Override
    public boolean conexion(Switch switchh, Hub hub, Wifi wifi) {
        System.out.println("Conexion exitosa.");
        return true;
    }

}
