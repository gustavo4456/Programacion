/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.practincandoooooo;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public class ItemsComrpa {
    private int cantidad;
    private float precio;
    private Disco disco;

    public ItemsComrpa() {
    }

    public ItemsComrpa(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.disco = new Disco();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
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
