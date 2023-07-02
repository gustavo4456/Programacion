package com.gustavo.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class prueba {

    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/agenda_db", "postgres", "admin");

            Statement miStatement = miConexion.createStatement();

            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM persona");

            while (miResultset.next()) {
                System.out.println("Nombre y apellido: " + miResultset.getString("apellidoNombre"));
                System.out.println("");

            }
        } catch (Exception e) {
            System.out.println("NO SE CONECTA");
            e.printStackTrace();
        }
    }

}
