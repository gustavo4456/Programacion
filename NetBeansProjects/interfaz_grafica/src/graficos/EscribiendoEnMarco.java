package graficos;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.GraphicsEnvironment;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        String nombreDeFuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        boolean estalafuente = false;
        String fuente = JOptionPane.showInputDialog("Introduce fuente");

        for (String nombreDeLaFuente : nombreDeFuentes) {
            System.out.println(nombreDeLaFuente);

            if (nombreDeLaFuente.equals(fuente)) {
                estalafuente = true;
            }
        }

        if (estalafuente) {
            JOptionPane.showMessageDialog(null, "Fuente instalada");
            System.out.println("Fuente instalada");
        }else {
            JOptionPane.showMessageDialog(null, "No esta intalada la fuente");
            System.out.println("No esta instalada la fuente");
        }

        MiMarco marco = new MiMarco(600, 450, JFrame.EXIT_ON_CLOSE);

    }
}
