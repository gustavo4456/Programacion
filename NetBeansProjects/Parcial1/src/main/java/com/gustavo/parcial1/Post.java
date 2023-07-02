package com.gustavo.parcial1;

/**
 *
 * @author Gustavo
 */
public class Post {

    private int id;
    private String fecha;
    private String titulo;
    private String contenido;
    private Usuario usuario;

    public Post(int id, String fecha, String titulo, String contenido) {
        this.id = id;
        this.fecha = fecha;
        this.titulo = titulo;
        this.contenido = contenido;
        this.usuario = new Usuario();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
