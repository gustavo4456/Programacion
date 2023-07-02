public class Silla {
    private int numeroRegistro;
    private String tipo;

    public Silla(int numeroRegistro, String tipo) {
        this.numeroRegistro = numeroRegistro;
        this.tipo = tipo;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
