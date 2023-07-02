import java.util.List;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private String tipo;
    private List<Departamento> departamentos;
    private List<Persona> personas;
    private Oficina oficina;
    private List<Aula> aulas;

    public Universidad(String nombre, String ubicacion, String tipo, List<Departamento> departamentos,
            List<Persona> personas, Oficina oficina, List<Aula> aulas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.departamentos = departamentos;
        this.personas = personas;
        this.oficina = oficina;
        this.aulas = aulas;
    }

    public String administrar() {
        return "La universidad administra";
    }

    public String educar() {
        return "La universidad educa";
    }

    public String investigar() {
        return "La universidad investiga";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

}
