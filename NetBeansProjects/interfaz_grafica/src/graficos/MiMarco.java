package graficos;

import java.awt.Frame;

import javax.swing.*;
import java.awt.*;


public class MiMarco extends JFrame {
    public MiMarco(int anchoMarco, int altoMarco, int operacionAlCerrarVentana) {

        Lamina lamina = new Lamina();
        Toolkit t = Toolkit.getDefaultToolkit();

        // ANCHO Y ALTO DE LA PANTALLA DEL DISPOSITIVO
        int anchoPantalla = (int) t.getScreenSize().getWidth();
        int altoPantalla = (int) t.getScreenSize().getHeight();

        setSize(anchoMarco, altoMarco);
        // CENTRANDO VENTANA
        setLocation((anchoPantalla / 2) - (anchoMarco / 2), (altoPantalla / 2) - (altoMarco / 2));
        
        setDefaultCloseOperation(operacionAlCerrarVentana);
        setResizable(false);
        // setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
        setVisible(true);
        add(lamina);
        lamina.setBackground(SystemColor.window);

    }
}
