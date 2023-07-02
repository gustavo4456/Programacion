/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavo.practicando1;

/**
 *
 * @author Gustavo
 */
public abstract class Persona {
    private Domicilio domicilio;

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getCalle() {
        return domicilio.getCalle();
    }

    public void setCalle(String calle) {
        domicilio.setCalle(calle);
    }

    public Integer getNumero() {
        return domicilio.getNumero();
    }

    public void setNumero(Integer numero) {
        domicilio.setNumero(numero);
    }

    public String getDepartamento() {
        return domicilio.getDepartamento();
    }

    public void setDepartamento(String departamento) {
        domicilio.setDepartamento(departamento);
    }

    public String getLocalidad() {
        return domicilio.getLocalidad();
    }

    public void setLocalidad(String localidad) {
        domicilio.setLocalidad(localidad);
    }
    
    
}
