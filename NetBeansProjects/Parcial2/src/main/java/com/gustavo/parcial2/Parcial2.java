package com.gustavo.parcial2;

/**
 * EXAMEN PARCIAL 2, 23/05/2023
 *
 * ESTUDIANTE: SILVA ARTAZA GUSTAVO FRANCISCO MATRICULA: ELSI440
 *
 */
public class Parcial2 {

    public static void main(String[] args) {
        //1) Crear una instacia de docentes con sus respectivos datos
        Docente docente = new Docente(321312, "Juan", "Perez", "22132444", "14/04/1965", "Masculino");
        docente.setCodigoCargo(4216666);
        docente.setDescripcionCargo("Profesor titular");

        //2) Crear 5 instancias de alumnos con sus respectivos datos
        Alumno alumno1 = new Alumno(232111, "Gustavo", "Silva", "39882999", "13/01/1991", "Masculino");
        Alumno alumno2 = new Alumno(232222, "Jose", "Artaza", "39882222", "13/01/1992", "Masculino");
        Alumno alumno3 = new Alumno(232333, "Pedro", "Gomez", "39882332", "13/01/1994", "Masculino");
        Alumno alumno4 = new Alumno(232444, "Ramiro", "Mercado", "39882334", "13/01/1995", "Masculino");
        Alumno alumno5 = new Alumno(232555, "Mario", "Ruiz", "39882551", "13/01/1997", "Masculino");

        //3)Crear una intacia de grado con sus respectivos datos
        Grado grado = new Grado(52, "B");
        grado.setCodigoTurno("tarde14");
        grado.setDescripcionTurno("Este grado corresponde al turno tarde");

        //4)Asignarle el grado al profesor creado y los alumnos correspondientes
        grado.addAlumno(alumno1);
        grado.addAlumno(alumno2);
        grado.addAlumno(alumno3);
        grado.addAlumno(alumno4);
        grado.addAlumno(alumno5);

        grado.addDocente(docente);

        //Mostrando datos
        System.out.println("PROFESOR ");
        for (Docente docente1 : grado.getDocentes()) {

            System.out.println("Nombre: " + docente1.getNombre());
            System.out.println("Apellido: " + docente1.getApellido());
            System.out.println("Documento: " + docente1.getDocumento());
            System.out.println("FechaNacimiento: " + docente1.getFechaNacimiento());
            System.out.println("Sexo: " + docente1.getSexo());
        }

        System.out.println("");
        System.out.println("ALUMNOS DEL GRADO " + grado.getNumero() + " DE LA SECCION " + grado.getSeccion() + ": ");
        for (Alumno alumno : grado.getAlumnos()) {
            System.out.println("Matricula: " + alumno.getMatricula());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Documento: " + alumno.getDocumento());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNacimiento());
            System.out.println("Sexo: " + alumno.getSexo());
            System.out.println("");
        }

    }
}
