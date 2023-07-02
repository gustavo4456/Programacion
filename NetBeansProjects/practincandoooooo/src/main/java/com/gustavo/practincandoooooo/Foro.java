/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.practincandoooooo;

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
    private Disco disco;
    private List<Post> posts;

    public Foro(String titulo, String descripcion, String fechaCreacion, int cantidadComentarios) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.cantidadComentarios = cantidadComentarios;
        this.disco = new Disco();
        this.posts = new ArrayList<>();
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

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public boolean addPost(Post e) {
        return posts.add(e);
    }

    public Post getPost(int index) {
        return posts.get(index);
    }

    public Post removePost(int index) {
        return posts.remove(index);
    }

    public String getInterprete() {
        return disco.getInterprete();
    }

    public void setInterprete(String interprete) {
        disco.setInterprete(interprete);
    }

    public String getTiulo() {
        return disco.getTiulo();
    }

    public void setTiulo(String tiulo) {
        disco.setTiulo(tiulo);
    }

    public String getPortada() {
        return disco.getPortada();
    }

    public void setPortada(String portada) {
        disco.setPortada(portada);
    }

    public Productora getProductora() {
        return disco.getProductora();
    }

    public void setProductora(Productora productora) {
        disco.setProductora(productora);
    }

    public Categoria getCategoria() {
        return disco.getCategoria();
    }

    public void setCategoria(Categoria categoria) {
        disco.setCategoria(categoria);
    }

    public List<Tag> getTags() {
        return disco.getTags();
    }

    public void setTags(List<Tag> tags) {
        disco.setTags(tags);
    }

    public boolean addTag(Tag e) {
        return disco.addTag(e);
    }

    public Tag getTag(int index) {
        return disco.getTag(index);
    }

    public Tag removeTag(int index) {
        return disco.removeTag(index);
    }

    public int getIdCategoria() {
        return disco.getIdCategoria();
    }

    public void setIdCategoria(int id) {
        disco.setIdCategoria(id);
    }

    public String getNombreCategoria() {
        return disco.getNombreCategoria();
    }

    public void setNombreCategoria(String nombre) {
        disco.setNombreCategoria(nombre);
    }

    public String getDescripcionCategoria() {
        return disco.getDescripcionCategoria();
    }

    public void setDescripcionCategoria(String descripcion) {
        disco.setDescripcionCategoria(descripcion);
    }

    public String getNombreProductora() {
        return disco.getNombreProductora();
    }

    public void setNombreProductora(String nombre) {
        disco.setNombreProductora(nombre);
    }

    public String getDireccionProductora() {
        return disco.getDireccionProductora();
    }

    public void setDireccionProductora(String direccion) {
        disco.setDireccionProductora(direccion);
    }

    public int getTelefonoProductora() {
        return disco.getTelefonoProductora();
    }

    public void setTelefonoProductora(int telefono) {
        disco.setTelefonoProductora(telefono);
    }
    
    
    
    
    
}
