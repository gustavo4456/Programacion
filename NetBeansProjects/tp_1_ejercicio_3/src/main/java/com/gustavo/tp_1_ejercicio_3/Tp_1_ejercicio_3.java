package com.gustavo.tp_1_ejercicio_3;

/*  Paradigmas de programacion III 
    Practico 1, ejercicio 3
    Nombre: Silva Artaza Gustavo Francisco
    Matricula: ELSI440
 */

public class Tp_1_ejercicio_3 {

    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        piloto1.setNombre("Mario");
        piloto1.setEdad(65);
        piloto1.setHorasVuelo(30000);
        piloto1.setNivelExperiencia(3);

        Piloto piloto2 = new Piloto();
        piloto2.setNombre("Juan");
        piloto2.setEdad(35);
        piloto2.setHorasVuelo(15000);
        piloto2.setNivelExperiencia(2);

        Piloto piloto3 = new Piloto();
        piloto3.setNombre("Antonio");
        piloto3.setEdad(27);
        piloto3.setHorasVuelo(8000);
        piloto3.setNivelExperiencia(1);

        //Atributos del vuelo y el avion
        Vuelo vuelo1 = new Vuelo();
        vuelo1.setId(5584);
        vuelo1.setSalidaAeropuerto("6/4/2023 21:13:55");
        vuelo1.setLlegadaAeropuerto("7/4/2023 22:12:55");

        vuelo1.setTipo("Pasajeros");
        vuelo1.setEstado("En el aire");

        vuelo1.addPiloto(piloto1);
        vuelo1.addPiloto(piloto2);

        Aeropuerto aeropuerto1 = new Aeropuerto();
        aeropuerto1.setId(85);
        aeropuerto1.setNombre("Aeropuerto de Cordoba");
        aeropuerto1.setUbicacion("Argentina, Cordoba");
        aeropuerto1.add(vuelo1);
        aeropuerto1.add(vuelo1);

        //Aerolinea
        Aerolinea aerolinea1 = new Aerolinea();
        aerolinea1.setId(4552);
        aerolinea1.setNombre("Aerolinea 1245");

        aerolinea1.addPiloto(piloto1);
        aerolinea1.addPiloto(piloto2);
        aerolinea1.addPiloto(piloto3);
        aerolinea1.addPiloto(piloto3);
        aerolinea1.addPiloto(piloto3);

        aerolinea1.addVuelo(vuelo1);
        aerolinea1.addVuelo(vuelo1);

        //Mostrando datos
        System.out.println("---------------AEROLINEA DATOS--------------- ");
        System.out.println("Id: " + aerolinea1.getId());
        System.out.println("Nombre: " + aerolinea1.getNombre());

        System.out.println("");
        System.out.println("TODOS LOS PILOTOS DE LA AEROLINEA");
        for (Piloto piloto : aerolinea1.getPilotos()) {
            System.out.println("Nombre del piloto: " + piloto.getNombre());
            System.out.println("Edad del piloto: " + piloto.getEdad());
            System.out.println("Horas de vuelo del piloto: " + piloto.getHorasVuelo());
            System.out.println("Nivel de experiencia del piloto: " + piloto.getNivelExperiencia());
            System.out.println("");
        }
        System.out.println("----------------------------------");
        System.out.println("VUELOS Y SUS PILOTOS");
        for (Vuelo vuelo : aerolinea1.getVuelos()) {
            System.out.println("Id vuelo: " + vuelo.getId());
            System.out.println("Salida del aeropuerto: " + vuelo.getSalidaAeropuerto());
            System.out.println("Legada al aeropuerto: " + vuelo.getLlegadaAeropuerto());
            System.out.println("Tipo de avion: " + vuelo.getTipo());
            System.out.println("Estado del avion: " + vuelo.getEstado());
            System.out.println("");
            for (Piloto piloto : vuelo.getPilotos()) {
                System.out.println("Nombre del piloto: " + piloto.getNombre());
                System.out.println("Edad del piloto: " + piloto.getEdad());
                System.out.println("Horas de vuelo del piloto: " + piloto.getHorasVuelo());
                System.out.println("Nivel de experiencia del piloto: " + piloto.getNivelExperiencia());
                System.out.println("");
            }
            System.out.println("----------------------------------------------------");
            System.out.println("");
        }

        System.out.println("AEROPUERTOS Y VUELOS");
        System.out.println("Id: " + aeropuerto1.getId());
        System.out.println("Nombre del aeropuerto: " + aeropuerto1.getNombre());
        System.out.println("Ubicacion del aeropuerto: " + aeropuerto1.getUbicacion());
        System.out.println("");
        for (Vuelo vuelo : aeropuerto1.getVuelos()) {
            System.out.println("Id vuelo: " + vuelo.getId());
            System.out.println("Salida del aeropuerto: " + vuelo.getSalidaAeropuerto());
            System.out.println("Legada al aeropuerto: " + vuelo.getLlegadaAeropuerto());
            System.out.println("Tipo de avion: " + vuelo.getTipo());
            System.out.println("Estado del avion: " + vuelo.getEstado());
            System.out.println("");
            for (Piloto piloto : vuelo.getPilotos()) {
                System.out.println("Nombre del piloto: " + piloto.getNombre());
                System.out.println("Edad del piloto: " + piloto.getEdad());
                System.out.println("Horas de vuelo del piloto: " + piloto.getHorasVuelo());
                System.out.println("Nivel de experiencia del piloto: " + piloto.getNivelExperiencia());
                System.out.println("");
            }
            System.out.println("-----------------------------------");
            System.out.println("");
        }

    }
}
