package com.gustavo.practicoparaparcial1;

import java.util.ArrayList;

public class Server extends Equipo implements ConexionServe{

    public Server(int placaRed, String marcaEquipo) {
        super(placaRed, marcaEquipo);
    }

    @Override
    public boolean conexion(ArrayList<Dispositivo> dispositivos) {
        System.out.println("Conexion exitosa");
        return true;
    }

    @Override
    public boolean conexion(Pc pc) {
        System.out.println("Conexion exitosa");
        return true;
    }
   

}
