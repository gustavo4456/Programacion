public class Empleado extends Persona {
    private int id;

    public Empleado(String nombre, int edad, int dni) {
        super(nombre, edad, dni);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
