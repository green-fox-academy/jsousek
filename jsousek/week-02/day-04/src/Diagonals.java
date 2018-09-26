import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {

        int x1 = 0;
        int y1 = WIDTH;
        int x2 =0;
        int y2 = HEIGHT;
        int TICK = 10;
        //heightside

        for (int i = 0; i <y2/TICK ; i++) {
            graphics.drawLine(x1,y1-(i*TICK),x2+(i*TICK),y2);


        }
        graphics.setColor(Color.RED);
        graphics.drawLine(0,0,WIDTH,HEIGHT);
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 340;

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