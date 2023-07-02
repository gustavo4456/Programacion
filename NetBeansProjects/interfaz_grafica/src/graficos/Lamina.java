package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Lamina extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.blue);
        g.setFont(new Font("Ubuntu", Font.BOLD, 25));
        g.drawString("Estamos aprendiendo swing", 100, 100);

        g.drawRect(25, 25, 50, 100);
        g.drawLine(0, 0, 65, 45);

        // Con graphics2d
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 150, 200, 150);
        g2.fill(rectangulo);
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setColor(Color.black);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 150, 300, 250));

        double centroenX = rectangulo.getCenterX();
        double centroenY = rectangulo.getCenterY();

        double radio = 150;

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroenX, centroenY, centroenX + radio, centroenY + radio);
        g2.setColor(Color.green);
        // g2.fill(circulo);
        g2.draw(circulo);
    }
}
