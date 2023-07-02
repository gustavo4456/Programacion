package com.gustavo.practicoparaparcial1;

public class Impresora extends Equipo implements ConexionImpre{

    private Red red;

    public Impresora(int placaRed, String marcaEquipo) {
        super(placaRed, marcaEquipo);
        red = new Red();
    }

    public Red getRed() {
        return red;
    }

    public void setRed(Red red) {
        this.red = red;
    }

    public String getNombreRed() {
        return red.getNombreRed();
    }

    public void setNombreRed(String nombreRed) {
        red.setNombreRed(nombreRed);
    }

    @Override
    public boolean conexion(Pc pc) {
        System.out.println("Se conecto a la pc " + pc.getMarcaEquipo());
        return true;
    }

}
