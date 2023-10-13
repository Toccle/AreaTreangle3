package pack.areatreangle;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        class DrawATriangle extends JPanel {
            public void paintComponent(Graphics g) {
                int[] xPoints = {50, 100, 0};
                int[] yPoints = {0, 100, 100};
                g.drawPolygon(xPoints, yPoints, 3);
            }
        }

        DrawATriangle drawATriangle = new DrawATriangle();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(300, 200);
        frame.add(drawATriangle);
        frame.setVisible(true);
    }
}