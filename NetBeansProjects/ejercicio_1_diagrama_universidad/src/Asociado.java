public class Asociado extends Profesor {
    public Asociado(String nombre, int edad, int dni, int id, String titulo, String materia, int dedicacion) {
        super(nombre, edad, dni, id, titulo, materia, dedicacion);
        // TODO Auto-generated constructor stub
    }

    public String CompartirExperiencia() {
        return "Comparte experiencia";
    }
}
