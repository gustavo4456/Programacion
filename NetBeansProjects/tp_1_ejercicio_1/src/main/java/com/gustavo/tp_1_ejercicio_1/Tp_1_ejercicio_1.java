package com.gustavo.tp_1_ejercicio_1;

/*  Paradigmas de programacion III 
    Practico 1, ejercicio 1
    Nombre: Silva Artaza Gustavo Francisco
    Matricula: ELSI440
*/

public class Tp_1_ejercicio_1 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Pedro");
        persona1.setFechaNacimiento("12/6/1975");
        persona1.setId(5);
        persona1.setDni(20222555);

        Persona persona2 = new Persona();
        persona2.setNombre("Maria");
        persona2.setFechaNacimiento("12/6/1993");
        persona2.setId(10);
        persona2.setDni(34122525);

        //Las aulas tienen sillas
        Silla silla = new Silla();
        silla.setNumeroRegistro(4582);

        Silla silla2 = new Silla();
        silla2.setNumeroRegistro(4111);

        Aula aula1 = new Aula();
        aula1.setId(1);
        aula1.setCapacidadSillas(50);
        aula1.setTieneProyector(false);
        aula1.add(silla);

        Aula aula2 = new Aula();
        aula2.setId(1);
        aula2.setCapacidadSillas(25);
        aula2.setTieneProyector(true);
        aula2.add(silla2);

        //Los departamentos tienen oficinas y la oficinas empleados
        Empleado empleado1 = new Empleado();
        empleado1.setId(1);
        empleado1.setNombre("Juan");
        empleado1.setFechaNacimiento("15/8/1990");
        empleado1.setDni(35123535);

        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Martin");
        empleado2.setFechaNacimiento("15/8/1955");
        empleado2.setDni(28045425);

        Oficina oficina = new Oficina();
        oficina.setId(51);
        oficina.add(empleado1);

        Oficina oficina2 = new Oficina();
        oficina2.setId(24);
        oficina2.add(empleado2);

        Departamento departamento1 = new Departamento();
        departamento1.setNombre("Exactas");
        departamento1.add(oficina);

        Departamento departamento2 = new Departamento();
        departamento2.setNombre("Aplicadas");
        departamento2.add(oficina2);
        departamento2.add(oficina2);
        departamento2.add(oficina2);
        departamento2.add(oficina2);
        departamento2.add(oficina2);

        //La universidad tiene personas, aulas, departamentos
        Universidad universidad = new Universidad();

        universidad.setNombre("Universidad Nacional de La Rioja");
        universidad.setTipo("Publica");
        universidad.addAula(aula1);
        universidad.addAula(aula2);
        universidad.addDepartamento(departamento1);
        universidad.addDepartamento(departamento2);
        universidad.addPersona(persona1);
        universidad.addPersona(persona2);

        //Mostrando datos
        System.out.println("Datos de la universidad");
        System.out.println("Nombre: " + universidad.getNombre());
        System.out.println("Tipo: " + universidad.getTipo());
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Personas que trabajan en la " + universidad.getNombre() + ": ");
        for (Persona persona : universidad.getPersonas()) {
            System.out.println("Id: " + persona.getId());
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
            System.out.println("Dni: " + persona.getDni());
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Aulas: ");
        for (Aula aula : universidad.getAulas()) {
            System.out.println("Id: " + aula.getId());
            System.out.println("Capacidad de sillas: " + aula.getCapacidadSillas());
            System.out.println("Tiene proyector: " + aula.isTieneProyector());
            for (Silla sillaArray : aula.getSillas()) {
                System.out.println("Numeros de registro de las sillas: " + sillaArray.getNumeroRegistro());
            }
            System.out.println("");
        }

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Departamentos: ");
        for (Departamento dep : universidad.getDepartamentos()) {
            System.out.println("Nombre: " + dep.getNombre());
            for (Oficina ofic : dep.getOficinas()) {
                System.out.println("ID Oficina: " + ofic.getId());
                System.out.println("Empleados Oficina: ");
                for (Empleado empleado : ofic.getEmpleados()) {
                    System.out.println("Id: " + empleado.getId());
                    System.out.println("Nombre: " + empleado.getNombre());
                    System.out.println("Fecha de nacimiento: " + empleado.getFechaNacimiento());
                    System.out.println("Dni: " + empleado.getDni());
                    System.out.println("");
                }
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }

    }
}
