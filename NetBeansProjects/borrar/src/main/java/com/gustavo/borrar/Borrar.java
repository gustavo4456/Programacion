/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.gustavo.borrar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Borrar {

    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();
        List<String> materiasCalificadas = new ArrayList<>();
        List<String> materiasResultados = new ArrayList<>();

//        ordenada: seria BUSCARMATERIA
        materias.add("Matematica");
        materias.add("Lengua");
        materias.add("Geografia");
        materias.add("Biologia");

//        materias desordenadas
        materiasCalificadas.add("Biologia");
        materiasCalificadas.add("Lengua");
        materiasCalificadas.add("Matematica");
        materiasCalificadas.add("Geografia");
        
//        caso en que se agrega una materia que no exite en el listado de materias(ordenadas)
// NO SE GUARDARIA EN LA LISTA RESULATDO QUE ES YA LA ORDENADA
        materiasCalificadas.add("fisica");


        for (String materia : materias) {
            for (String materiasCalificada : materiasCalificadas) {
                if (materiasCalificada.equals(materia)) {
                    materiasResultados.add(materia);
                }
            }
        }

        
//        mostrar resultado
        for (String materiasResultado : materiasResultados) {
            System.out.println(materiasResultado);
        }

    }
}
