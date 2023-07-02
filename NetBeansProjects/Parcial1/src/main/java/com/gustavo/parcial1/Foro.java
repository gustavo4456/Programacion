package com.gustavo.parcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Foro {

    private String titulo;
    private String descripcion;
    private String fechaCreacion;
    private int cantidadComentarios;
    private List<Post> posts;

    public Foro() {
    }

    public Foro(String titulo, String descripcion, String fechaCreacion, int cantidadComentarios) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.cantidadComentarios = cantidadComentarios;
        this.posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCantidadComentarios() {
        return cantidadComentarios;
    }

    public void setCantidadComentarios(int cantidadComentarios) {
        this.cantidadComentarios = cantidadComentarios;
    }

    //DELEGATES
    public boolean addPost(Post e) {
        return posts.add(e);
    }

    public Post getPost(int index) {
        return posts.get(index);
    }

    public Post removePost(int index) {
        return posts.remove(index);
    }

}
