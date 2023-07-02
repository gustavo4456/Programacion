package com.gustavo.controlador;

import java.sql.*;

public class Conexion {

    private Connection conexionDB = null;

    public Conexion() {

    }

    public Connection getConexion() {
        try {
            conexionDB = DriverManager.getConnection("jdbc:postgresql://localhost:5432/agenda_db", "postgres", "admin");

        } catch (Exception e) {
            System.out.println("NO SE CONECTA");
            e.printStackTrace();
        }
        
        return conexionDB;
    }
}
