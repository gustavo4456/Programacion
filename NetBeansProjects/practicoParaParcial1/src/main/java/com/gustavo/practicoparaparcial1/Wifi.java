package com.gustavo.practicoparaparcial1;

public class Wifi extends Dispositivo implements ConexionDis {

    private String Ssid;
    private int Wlankeys;

    public Wifi(int cantidadBocas, int bocasDisponibles, String nombre) {
        super(cantidadBocas, bocasDisponibles, nombre);
    }

    public String getSsid() {
        return Ssid;
    }

    public void setSsid(String Ssid) {
        this.Ssid = Ssid;
    }

    public int getWlankeys() {
        return Wlankeys;
    }

    public void setWlankeys(int Wlankeys) {
        this.Wlankeys = Wlankeys;
    }

    @Override
    public boolean conexion(Dispositivo dispositivo) {
        System.out.println("Se conecto a " + dispositivo.getNombre());
        return true;
    }

}
