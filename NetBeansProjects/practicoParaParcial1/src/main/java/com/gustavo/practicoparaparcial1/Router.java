package com.gustavo.practicoparaparcial1;

import java.util.ArrayList;

public class Router extends Dispositivo {

    private ArrayList<Internet> internes;

    public Router(int cantidadBocas, int bocasDisponibles, String nombre) {
        super(cantidadBocas, bocasDisponibles, nombre);
        this.internes = new ArrayList<>();
    }

    public ArrayList<Internet> getInternes() {
        return internes;
    }

    public void setInternes(ArrayList<Internet> internes) {
        this.internes = internes;
    }

    public Internet getInternet(int index) {
        return internes.get(index);
    }

    public boolean addInternet(Internet e) {
        return internes.add(e);
    }

    public Internet removeInternet(int index) {
        return internes.remove(index);
    }

}
