package com.gustavo.pruebaenum;

public class Cuenta {

    enum Estado {
        ACTIVO,
        INACTIVO,
        PAUSADA
    }

    private Estado estado;

    public Cuenta(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
