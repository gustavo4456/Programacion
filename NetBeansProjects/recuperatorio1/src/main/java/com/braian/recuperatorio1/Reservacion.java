package com.braian.recuperatorio1;

import java.util.ArrayList;
import java.util.List;

public class Reservacion {

    private String fechaInicio;
    private String fechaFin;
    private List<Turista> turistas;

    public Reservacion(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.turistas = new ArrayList<>();
    }

    public Sucursal sucursalSeleccionada(int cod) {
        return new Sucursal();
    }

    public Hotel elegirHotel(int cod) {
        return new Hotel();
    }

    public void elegirRegimenHispedaje() {
        
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Turista> getTuristas() {
        return turistas;
    }

    public void setTuristas(List<Turista> turistas) {
        this.turistas = turistas;
    }

    public boolean addTurista(Turista e) {
        return turistas.add(e);
    }

    public Turista getTurista(int index) {
        return turistas.get(index);
    }

    public Turista removeTurista(int index) {
        return turistas.remove(index);
    }

}
