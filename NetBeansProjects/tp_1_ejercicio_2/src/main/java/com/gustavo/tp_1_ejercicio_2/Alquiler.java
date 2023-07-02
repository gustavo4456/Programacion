package com.gustavo.tp_1_ejercicio_2;

import java.util.ArrayList;

public class Alquiler {

    private String fechaAlquiler;
    private String fechaDevolucion;
    private float recargo = 0;
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
            System.out.println("Precio: $" + pelicula.getPrecio() / 2);
            //System.out.println("Cantidad copias: " + pelicula.getCantidad());
            System.out.println("Recargo: " + recargo);
            System.out.println("----------------------------------");
        }
        System.out.println("Total: $" + ((precioTotal() / 2) + recargo));
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public float getRecargo() {
        return recargo;
    }

    public void setRecargo(float recargo) {
        this.recargo = recargo;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
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

}
