package com.gustavo.recuperatorio2doparcial;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private int id;
    private String fechaHora;
    private Persona anfitrion;
    private List<Persona> invitados = new ArrayList<>();
    private Locacion locacion;
    private TipoEvento tipoEvento;

    public Agenda(int id, String fechaHora, Persona anfitrion, Locacion locacion, TipoEvento tipoEvento) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.anfitrion = anfitrion;
        this.locacion = locacion;
        this.tipoEvento = tipoEvento;
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Persona getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(Persona anfitrion) {
        this.anfitrion = anfitrion;
    }

    public List<Persona> getInvitados() {
        return invitados;
    }

    public void setInvitados(List<Persona> invitados) {
        this.invitados = invitados;
    }

    public Locacion getLocacion() {
        return locacion;
    }

    public void setLocacion(Locacion locacion) {
        this.locacion = locacion;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    //DELEGATES
    public int getIdAnfitrion() {
        return anfitrion.getId();
    }

    public void setIdAnfitrion(int id) {
        anfitrion.setId(id);
    }

    public String getNombreApellidoAnfitrion() {
        return anfitrion.getNombreApellido();
    }

    public void setNombreApellidoAnfitrion(String nombreApellido) {
        anfitrion.setNombreApellido(nombreApellido);
    }

    public int getIdLocacion() {
        return locacion.getId();
    }

    public void setIdLocacion(int id) {
        locacion.setId(id);
    }

    public String getNombreLocacion() {
        return locacion.getNombre();
    }

    public void setNombreLocacion(String nombre) {
        locacion.setNombre(nombre);
    }

    public String getDomicilioLocacion() {
        return locacion.getDomicilio();
    }

    public void setDomicilioLocacion(String domicilio) {
        locacion.setDomicilio(domicilio);
    }

    public boolean isEstadoLocacion() {
        return locacion.isEstado();
    }

    public void setEstadoLocacion(boolean estado) {
        locacion.setEstado(estado);
    }

    public int getIdTipoEvento() {
        return tipoEvento.getId();
    }

    public void setIdTipoEvento(int id) {
        tipoEvento.setId(id);
    }

    public String getNombreTipoEvento() {
        return tipoEvento.getNombre();
    }

    public void setNombreTipoEvento(String nombre) {
        tipoEvento.setNombre(nombre);
    }

    public boolean isEstadoTipoEvento() {
        return tipoEvento.isEstado();
    }

    public void setEstadoTipoEvento(boolean estado) {
        tipoEvento.setEstado(estado);
    }

    public boolean addPersona(Persona e) {
        return invitados.add(e);
    }

    public Persona getPersona(int index) {
        return invitados.get(index);
    }

    public Persona removePersona(int index) {
        return invitados.remove(index);
    }

}
