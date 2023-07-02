
package com.gustavo.poo;

class Cliente {
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    
    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;       
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public Cuenta getCuenta(){
        return this.cuenta;
    }
    
    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
}
