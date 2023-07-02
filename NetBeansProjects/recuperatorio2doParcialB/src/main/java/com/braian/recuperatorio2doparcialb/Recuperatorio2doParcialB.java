package com.braian.recuperatorio2doparcialb;

import java.util.ArrayList;
import java.util.List;

public class Recuperatorio2doParcialB {

    public static void main(String[] args) {
        //1) Crear una instancia de Locacion con sus respectivos datos
        Locacion locacion1 = new Locacion(1, "loc22", "Avenidad siempre viva 742", true);

        //2) Crear 5 instancias de Personas con sus respectivos datos
        Persona persona1 = new Persona(1, "Juan Martinez");
        Persona persona2 = new Persona(2, "Ramon Valdez");
        Persona persona3 = new Persona(3, "Martin Juarez");
        Persona persona4 = new Persona(4, "Joaquín Guzmán Loera");
        Persona persona5 = new Persona(5, "Pablo Escobar");

        //3) Crear 2 instancias de eventos con sus respectivos datos
        TipoEvento evento1 = new TipoEvento(1, "Reunion", true);
        TipoEvento evento2 = new TipoEvento(1, "Consulta", true);

        //4) Generar una entrada de agenda con 1 anfitrion y 2 invitados, para 
        //   un evento determinado, en una locacion especifica, declarando su feha
        List<Persona> invitados = new ArrayList<>();

        Agenda agenda1 = new Agenda(1, "2/06/2023 18:40", persona5, locacion1, evento2);
        agenda1.addPersona(persona1);
        agenda1.addPersona(persona2);
        
        
        //Mostrando datos toString
        
        System.out.println(agenda1);
    }
}
