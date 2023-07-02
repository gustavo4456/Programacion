package com.gustavo.practicoparaparcial1;

import java.util.ArrayList;

public interface ConexionServe {
    public abstract boolean conexion(ArrayList<Dispositivo> dispositivos);
    public abstract boolean conexion(Pc pc);
}
