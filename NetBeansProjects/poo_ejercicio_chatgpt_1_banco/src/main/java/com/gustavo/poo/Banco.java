package com.gustavo.poo;

import java.util.ArrayList;

public class Banco {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private int numClientes;

    public Banco(String nombre) {
        clientes = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarCliente(String nombre, String apellido) {
        Cliente clienteNuevo = new Cliente(nombre, apellido);
        clientes.add(clienteNuevo);
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public int getNumeroClientes() {
        return clientes.size();
    }

    public void imprimirClientes() {
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println("---------CLIENTE----------");
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellido: " + cliente.getApellido());
                System.out.println();
                System.out.println();

            }
        }

    }
}
