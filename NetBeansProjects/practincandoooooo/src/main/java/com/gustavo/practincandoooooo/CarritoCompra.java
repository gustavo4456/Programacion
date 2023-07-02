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
public class CarritoCompra {
    private int id;
    private float total;
    private List<ItemsComrpa> items;

    public CarritoCompra() {
    }

    public CarritoCompra(int id, float total) {
        this.id = id;
        this.total = total;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<ItemsComrpa> getItems() {
        return items;
    }

    public void setItems(List<ItemsComrpa> items) {
        this.items = items;
    }

    public boolean addItem(ItemsComrpa e) {
        return items.add(e);
    }

    public ItemsComrpa getItem(int index) {
        return items.get(index);
    }

    public ItemsComrpa removeItem(int index) {
        return items.remove(index);
    }
    
    
    
    
    
    
}
