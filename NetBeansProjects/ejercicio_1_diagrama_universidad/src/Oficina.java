public class Oficina {
    private int id;
    private int cantidadEmpleados;

    public Oficina(int id, int cantidadEmpleados) {
        this.id = id;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String atenderPublico() {
        return "Oficina atiende al publico.";
    }

    public String gestionarTramite() {
        return "Gestionar tramite";
    }

    public String manejarRecursos() {
        return "Manejo de recursos";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

}
