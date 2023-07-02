package com.gustavo.conectaDB;

import java.sql.*;

public class ModificaBBDD {

    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");

            Statement miStatement = miConexion.createStatement();
//insertar
//            String instruccionSql = "INSERT INTO personas (nombre, edad) VALUES ('Mario', 28)";

//modificar
//            String instruccionSql = "UPDATE personas SET edad=54 WHERE nombre='Mario'";

//eliminar
            String instruccionSql = "DELETE FROM personas WHERE nombre='Mario'";

            miStatement.executeUpdate(instruccionSql);

            System.out.println("Datos insertados correctamente");

        } catch (Exception e) {
            System.out.println("NO SE CONECTA");
            e.printStackTrace();
        }
    }
}
