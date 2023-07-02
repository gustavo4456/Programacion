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
public class Disco {
    private String interprete;
    private String tiulo;
    private String portada;
    private Productora productora;
    private Categoria categoria;
    private List<Tag> tags;

    public Disco() {
    }

    
    
    public Disco(String interprete, String tiulo, String portada) {
        this.interprete = interprete;
        this.tiulo = tiulo;
        this.portada = portada;
        this.productora = new Productora();
        this.categoria = new Categoria();
        this.tags = new ArrayList<>();
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getTiulo() {
        return tiulo;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public boolean addTag(Tag e) {
        return tags.add(e);
    }

    public Tag getTag(int index) {
        return tags.get(index);
    }

    public Tag removeTag(int index) {
        return tags.remove(index);
    }

    public int getIdCategoria() {
        return categoria.getId();
    }

    public void setIdCategoria(int id) {
        categoria.setId(id);
    }

    public String getNombreCategoria() {
        return categoria.getNombre();
    }

    public void setNombreCategoria(String nombre) {
        categoria.setNombre(nombre);
    }

    public String getDescripcionCategoria() {
        return categoria.getDescripcion();
    }

    public void setDescripcionCategoria(String descripcion) {
        categoria.setDescripcion(descripcion);
    }

    public String getNombreProductora() {
        return productora.getNombre();
    }

    public void setNombreProductora(String nombre) {
        productora.setNombre(nombre);
    }

    public String getDireccionProductora() {
        return productora.getDireccion();
    }

    public void setDireccionProductora(String direccion) {
        productora.setDireccion(direccion);
    }

    public int getTelefonoProductora() {
        return productora.getTelefono();
    }

    public void setTelefonoProductora(int telefono) {
        productora.setTelefono(telefono);
    }
    
    
    
}
