package com.gustavo.tp_1_ejercicio_2;

/*  Paradigmas de programacion III 
    Practico 1, ejercicio 2
    Nombre: Silva Artaza Gustavo Francisco
    Matricula: ELSI440
 */

public class Tp_1_ejercicio_2 {

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Harry Potter");
        pelicula1.setTipo("Fantasia");
        pelicula1.setPrecio(1500);
        pelicula1.setEstado("Disponible");
        pelicula1.setCantidad(15);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Narnia 5");
        pelicula2.setTipo("Fantasia");
        pelicula2.setPrecio(1800);
        pelicula2.setEstado("Disponible");
        pelicula2.setCantidad(5);

        //Para comprar peliculas
        Pedido pedido1 = new Pedido();
        pedido1.setFecha("6/4/2023");
        pedido1.addPelicula(pelicula1);
        pedido1.addPelicula(pelicula2);

        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Gustavo");
        usuario1.setNumeroCelular(6452158);

        usuario1.setCodigoTarjeta(452158);
        usuario1.setSaldoTarjeta(15000);

        usuario1.addPedido(pedido1);

        for (Pedido pedido : usuario1.getPedidos()) {
            pedido.ticket();
        }

        //Socio pude alquilar y comprar peliculas
        Alquiler alquiler1 = new Alquiler();
        alquiler1.setFechaAlquiler("6/4/2023");
        alquiler1.setFechaDevolucion("13/4/2023");
        alquiler1.addPelicula(pelicula1);
        alquiler1.addPelicula(pelicula1);
        alquiler1.addPelicula(pelicula1);

        Pedido pedido2 = new Pedido();
        pedido2.setFecha("5/4/2023");
        pedido2.addPelicula(pelicula2);
        pedido2.addPelicula(pelicula2);

        Socio socio1 = new Socio();
        socio1.setNombre("Maria");
        socio1.setNumeroCelular(2848561);
        socio1.setNumeroSocio(1234);
        socio1.addAlquiler(alquiler1);
        socio1.addPedido(pedido2);
        System.out.println("-------------------Peliculas alquiladas por un socio----------------");
        for (Alquiler alquiler : socio1.getAlquiler()) {
            alquiler.ticket();
        }
        System.out.println("-------------------Peliculas compradas por un socio----------------");
        for (Pedido pedido : socio1.getPedidos()) {
            pedido.ticket();
        }
    }
}
