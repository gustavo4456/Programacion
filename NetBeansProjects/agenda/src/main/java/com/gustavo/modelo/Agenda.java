package com.gustavo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {

    private int id;
    private Date fechaHora;
    private Persona anfitrion;
    private Locacion locacion;
    private TipoEvento tipoEvento;
    private List<Persona> invitados;

    public Agenda(int id, Date fechaHora) {
        this.id = id;
        this.fechaHora = fechaHora;
        anfitrion = new Persona();
        locacion = new Locacion();
        tipoEvento = new TipoEvento();
        invitados = new ArrayList<>();
    }

    public int getIdAgenda() {
        return id;
    }

    public void setIdAgenda(int id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Persona getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(Persona anfitrion) {
        this.anfitrion = anfitrion;
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

    public List<Persona> getInvitados() {
        return invitados;
    }

    public void setInvitados(List<Persona> invitados) {
        this.invitados = invitados;
    }

    public int getIdAnfitrion() {
        return anfitrion.getId();
    }

    public void setIdAnfitrion(int id) {
        anfitrion.setId(id);
    }

    public String getApellidoNombre() {
        return anfitrion.getApellidoNombre();
    }

    public void setApellidoNombre(String apellidoNombre) {
        anfitrion.setApellidoNombre(apellidoNombre);
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

    public void setEstadoTipoEvente(boolean estado) {
        tipoEvento.setEstado(estado);
    }

}
