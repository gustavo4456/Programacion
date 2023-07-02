package com.gustavo.tp_1_ejercicio_2;

import java.util.ArrayList;

public class Pedido {

    private String fecha;
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public float precioTotal() {
        float precio = 0;
        for (Pelicula pelicula : peliculas) {
            precio += pelicula.getPrecio();
        }
        return precio;
    }

    public void ticket() {
        System.out.println("------------- TICKET -------------");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Nombre: " + pelicula.getNombre());
            System.out.println("Tipo: " + pelicula.getTipo());
            System.out.println("Precio: $" + pelicula.getPrecio());
            //System.out.println("Cantidad de copias: " + pelicula.getCantidad());
            System.out.println("----------------------------------");
        }
        System.out.println("Total: $" + precioTotal());
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Pelicula getPelicula(int index) {
        return peliculas.get(index);
    }

    public boolean addPelicula(Pelicula e) {
        return peliculas.add(e);
    }

    public Pelicula removePelicula(int index) {
        return peliculas.remove(index);
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
