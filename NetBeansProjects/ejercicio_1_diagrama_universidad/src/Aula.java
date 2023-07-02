import java.util.List;

public class Aula {
    private int id;
    private int capacidad;
    private List<Silla> sillas;

    public Aula(int id, int capacidad, List<Silla> sillas) {
        this.id = id;
        this.capacidad = capacidad;
        this.sillas = sillas;
    }

    public String alojarAlumnos() {
        return "Las aulas alojan alumnos";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }

}
