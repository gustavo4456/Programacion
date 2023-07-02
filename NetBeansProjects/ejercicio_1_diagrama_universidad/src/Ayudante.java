public class Ayudante extends Profesor {
    public Ayudante(String nombre, int edad, int dni, int id, String titulo, String materia, int dedicacion) {
        super(nombre, edad, dni, id, titulo, materia, dedicacion);
        // TODO Auto-generated constructor stub
    }

    public String acompaniarDocente() {
        return "Acompania al docente";
    }

    public String apoyarAlumno() {
        return "Apoyar al alumno";
    }
}
