import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Profesor> profesores = new ArrayList<>();

        Titular profesorTitular = new Titular("Juan", 65, 22008665, 12, "ing. en sistemas", "Programacion", 5);
        Ayudante profesoresAyudante = new Ayudante("Marcos", 45, 22432552, 2, "Estudiante avazando sistemas",
                "ing. de software", 1);

        profesores.add(profesoresAyudante);
        profesores.add(profesorTitular);

        List<Persona> personas = new ArrayList<>();

        Persona personaAlumno = new Persona("Gustavo", 25, 39887207);
        Empleado empleado1 = new Empleado("Marton", 45, 24555666);
        Asociado asociado1 = new Asociado("Camila", 18, 34005664, 55, "LIC. sistemas", "algebra", 16);

        personas.add(asociado1);
        personas.add(empleado1);
        personas.add(personaAlumno);

        Oficina oficina = new Oficina(66, 100);

        List<Aula> aulas = new ArrayList<>();
        List<Silla> sillas = new ArrayList<>();
        Silla silla1 = new Silla(6, "Madera");
        Silla silla2 = new Silla(8, "Oficina");
        sillas.add(silla1);
        sillas.add(silla2);
        Aula aula1 = new Aula(78, 55, sillas);
        Aula aula2 = new Aula(79, 100, sillas);

        aulas.add(aula1);
        aulas.add(aula2);

        List<Departamento> departamentos = new ArrayList<>();
        Departamento departamentoExactas = new Departamento("Exactas", "Decano", "La Rioja", profesores);
        Departamento departamentoHumanas = new Departamento("Humanas", "Decano", "La Rioja", profesores);
        departamentos.add(departamentoHumanas);
        departamentos.add(departamentoExactas);

        Universidad universidad = new Universidad("Universidad Nacional de La Rioja", "La Rioja",
                "Educacion Universitaria", departamentos, personas, oficina, aulas);

        System.out.println("INFO UNIVERSIDAD:");
        System.out.println(universidad.getNombre());
        System.out.println(universidad.getTipo());
        System.out.println(universidad.getUbicacion() + "\n");

        System.out.println("INFO OFICINA:");
        System.out.println("id: " + universidad.getOficina().getId());
        System.out.println("Cantidad de empleados: " + universidad.getOficina().getCantidadEmpleados() + " \n");

        System.out.println("AULAS: ");
        for (Aula aula : universidad.getAulas()) {
            System.out.println("ID: " + aula.getId());
            System.out.println("Capacidad aula: " + aula.getCapacidad() + "\n");
        }

        System.out.println("DEPARTAMENTOS DE LA UNIVERSIDAD:");

        for (Departamento departamento : universidad.getDepartamentos()) {
            System.out.println("Nombre del departamento:");
            System.out.println(departamento.getNombre());
            System.out.println("Ubicacion de la universidad:");
            System.out.println(departamento.getUbicacion());
            System.out.println("Autoridad:");
            System.out.println(departamento.getAutoridad());
            System.out.println("Profesores:");
            for (Profesor profesor : departamento.getProfesores()) {
                System.out.println("El profesor " + profesor.getNombre() + " de " + profesor.getEdad() + " años de dni "
                        + profesor.getDni() + ",  su id es " + profesor.getId() + ", de titulo " + profesor.getTitulo()
                        + " que da la materia de " + profesor.getMateria() + " con una dedicacion de "
                        + profesor.getDedicacion() + " horas. \n");
            }

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
