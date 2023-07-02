package com.gustavo.conectaDB;

import java.sql.*;

public class ConsultaPreparada {

    public static void main(String[] args) {

        try {
            //1_ Crear la conexion
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");

            //2_ Preparar consulta
            PreparedStatement miSentencia = miConexion.prepareStatement("SELECT nombre, edad FROM personas WHERE edad=?");

            //3_ Establecer parametros de consulta
            miSentencia.setInt(1, 24);

            //4_ Ejecutar y recorrer consulta
            ResultSet rs = miSentencia.executeQuery();

            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Edad: " + rs.getInt("edad"));
                System.out.println("");

            }

        } catch (Exception e) {
            System.out.println("NO SE CONECTA");
            e.printStackTrace();
        }

    }
}
