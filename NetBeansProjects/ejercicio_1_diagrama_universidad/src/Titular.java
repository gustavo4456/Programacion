public class Titular extends Profesor {

    public Titular(String nombre, int edad, int dni, int id, String titulo, String materia, int dedicacion) {
        super(nombre, edad, dni, id, titulo, materia, dedicacion);
        // TODO Auto-generated constructor stub
    }

    public String ElegirContenidos() {
        return "Elegir contenido";
    }

    public String tomarEvaluacion() {
        return "Tomar evaluacion";
    }
}
