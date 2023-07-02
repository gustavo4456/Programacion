package com.gustavo.modelo;

import com.gustavo.controlador.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class PersonaBBDD {

    private Conexion conexion;
    private ResultSet rs;

    public PersonaBBDD() {
        conexion = new Conexion();
    }

    public void guardarPersona(String apellidoNombre) {
        Persona persona = null;
        Connection accesoBBDD = conexion.getConexion();

        try {

            String instruccionSql = "INSERT INTO public.persona(\"apellidoNombre\") VALUES (?)";
            PreparedStatement stmt = accesoBBDD.prepareStatement(instruccionSql);

            persona = new Persona();
            persona.setApellidoNombre(apellidoNombre);

            stmt.setString(1, persona.getApellidoNombre());
            stmt.executeUpdate();
            System.out.println("PERSONA GUARDADA CORRECTAMENTE");

            accesoBBDD.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println("ERROR AL GUARDAR PERSONA.");
            e.printStackTrace();
        }
    }

    public DefaultTableModel llenarTablaPersonas() {
        DefaultTableModel modeloTabla = null;
        try {
            // Paso 2: Conectar con la base de datos
            Connection accesoBBDD = conexion.getConexion();

            // Paso 3: Crear una sentencia SQL
            String sql = "SELECT id, \"apellidoNombre\"\n FROM public.persona";
            Statement sentencia = accesoBBDD.createStatement();

            // Paso 4: Ejecutar la sentencia SQL
            ResultSet resultado = sentencia.executeQuery(sql);

            // Paso 5: Recuperar los datos de la consulta
            // Paso 5: Recuperar los datos de la consulta y almacenarlos en una tabla
            modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre y apellido");

            while (resultado.next()) {
                Object[] fila = new Object[2];
                fila[0] = resultado.getInt("id");
                fila[1] = resultado.getString("apellidoNombre");

                modeloTabla.addRow(fila);
            }

            // Paso 6: Cerrar la conexión con la base de datos
            resultado.close();
            sentencia.close();
            accesoBBDD.close();
        } catch (Exception e) {
            System.out.println("ERROR AL RECUPERAR DATOS DE LA PERSONA");
            e.printStackTrace();
        }
        return modeloTabla;
    }
    
    public void eliminarPersona(int id) {
        Persona persona = null;
        Connection accesoBBDD = conexion.getConexion();

        try {

            String instruccionSql = "DELETE FROM public.persona WHERE id = ?";
            PreparedStatement stmt = accesoBBDD.prepareStatement(instruccionSql);

            persona = new Persona();
            persona.setId(id);

            stmt.setInt(1, persona.getId());
            stmt.executeUpdate();
            System.out.println("PERSONA BORRAR CORRECTAMENTE");

            accesoBBDD.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println("ERROR AL BORRAR PERSONA.");
            e.printStackTrace();
        }
    }

}
