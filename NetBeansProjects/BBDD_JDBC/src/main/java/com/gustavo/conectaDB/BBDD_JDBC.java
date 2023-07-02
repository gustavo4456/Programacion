package com.gustavo.conectaDB;

import java.sql.*;

public class BBDD_JDBC {

    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");

            Statement miStatement = miConexion.createStatement();

            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM personas");

            while (miResultset.next()) {
                System.out.println("Nombre: " + miResultset.getString("nombre"));
                System.out.println("Edad: " + miResultset.getString("edad"));
                System.out.println("");

            }
        } catch (Exception e) {
            System.out.println("NO SE CONECTA");
            e.printStackTrace();
        }
    }
}
