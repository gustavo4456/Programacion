package com.gustavo.prueba25052023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import universidad.Aula;
import persona.Persona;

/**
 *
 * @author Gustavo
 */
public class Prueba25052023 {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Mostrar lista de personas");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1");
                    System.out.print("Ingrese nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad de la persona: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después del número
                    personas.add(new Persona(nombre, edad));
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2");
                    if (!personas.isEmpty()) {
                        for (Persona persona : personas) {
                            System.out.println("Nombre: " + persona.getNombre());
                            System.out.println("Edad: " + persona.getEdad());
                        }
                    } else {
                        System.out.println("La lista de personas está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Seleccionaste la opción 3");
                    // Agrega aquí la lógica para la opción 3
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

}
