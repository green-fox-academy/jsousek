import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.lang.Math;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int cx = WIDTH/2;
        int cy =HEIGHT/2;
        int nrOfLines =3;

        for (int i = 0; i < nrOfLines ; i++) {
            graphics.drawLine(X_Raw(0),Y_Draw(0), cx, cy);

        }




    }
    public static int X_Raw (int qx){
        double randomX = Math.floor(Math.random()*WIDTH);
        int randomIntX = (int ) randomX;
        return randomIntX;

    }

    public static int Y_Draw (int qy){
        double randomY = Math.floor(Math.random()*HEIGHT);
        int randomIntY = (int) randomY;
        return randomIntY;

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 342;

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