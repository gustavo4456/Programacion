package com.gustavo.tp_1_ejercicio_1;

import java.util.ArrayList;

public class Oficina {

    private Integer id;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empleado get(int index) {
        return empleados.get(index);
    }

    public boolean add(Empleado e) {
        return empleados.add(e);
    }

    public Empleado remove(int index) {
        return empleados.remove(index);
    }

}
