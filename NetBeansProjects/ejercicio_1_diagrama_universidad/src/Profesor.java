public class Profesor extends Persona {
    private int id;
    private String titulo;
    private String materia;
    private int dedicacion;

    public Profesor(String nombre, int edad, int dni, int id, String titulo, String materia, int dedicacion) {
        super(nombre,edad, dni);
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.dedicacion = dedicacion;
    }

    public String enseniar() {
        return "El profesor ensenia " + this.materia;
    }

    public String compartirRecursos() {
        return "El profesor comparte recursos";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(int dedicacion) {
        this.dedicacion = dedicacion;
    }

}
