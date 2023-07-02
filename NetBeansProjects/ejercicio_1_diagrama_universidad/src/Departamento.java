import java.util.List;

public class Departamento {
    private String nombre;
    private String autoridad;
    private String ubicacion;
    private List<Profesor> profesores;

    public Departamento(String nombre, String autoridad, String ubicacion, List<Profesor> profesores) {
        this.nombre = nombre;
        this.autoridad = autoridad;
        this.ubicacion = ubicacion;
        this.profesores = profesores;
    }

    public String gestionarCarreras() {
        return "Gestion de carreras.";
    }

    public String realizarPlanEstudio() {
        return "Realiza el plan de estudio";
    }

    public String contratarProfesor() {
        return "Contratar profesor.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(String autoridad) {
        this.autoridad = autoridad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

}
