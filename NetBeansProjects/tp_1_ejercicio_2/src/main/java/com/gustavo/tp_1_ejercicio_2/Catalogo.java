package com.gustavo.tp_1_ejercicio_2;

import java.util.ArrayList;

public class Catalogo {

    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public ArrayList<Pelicula> peliculasDisponibles() {
        ArrayList<Pelicula> peliculasDisponibles = new ArrayList<>();

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getEstado().equals("Disponible")) {
                peliculasDisponibles.add(pelicula);
            }

        }

        return peliculasDisponibles;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Pelicula get(int index) {
        return peliculas.get(index);
    }

    public boolean add(Pelicula e) {
        return peliculas.add(e);
    }

    public Pelicula remove(int index) {
        return peliculas.remove(index);
    }

}
