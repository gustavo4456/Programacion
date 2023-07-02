public class Jtp extends Profesor {
    public Jtp(String nombre, int edad, int dni, int id, String titulo, String materia, int dedicacion) {
        super(nombre, edad, dni, id, titulo, materia, dedicacion);
        // TODO Auto-generated constructor stub
    }

    public String elaborarTP() {
        return "Elaborar los trabajos practicos.";
    }

    public String corregirTP() {
        return "Corregir los trabajos practicos.";
    }
}
