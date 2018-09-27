import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        for (int i = 0; i < 10; i++) {
            Color myColor = new Color(RGB(), RGB(), RGB());
            graphics.setColor(myColor);
            BoxPrinter(myColor, 10 * i, graphics);
        }


    }

    public static void BoxPrinter(Color myColor, int size, Graphics graphics) {
        graphics.setColor(myColor);
        graphics.drawRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);

    }
    public static int RGB (){
        return (int) Math.floor(Math.random()*255);
    }
    // Don't touch the code below
    static int WIDTH = 321;
    static int HEIGHT = 321;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}