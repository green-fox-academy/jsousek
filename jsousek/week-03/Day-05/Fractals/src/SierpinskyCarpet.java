import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void drawBox(Graphics graphics){
        drawElement(0,0,600, graphics);

    }
    public static int randomColor(){
        int r =(int)(Math.random()*255);
        return r;

    }

    public static void drawElement (int topLx, int topLy,  int size, Graphics graphics){
        int div = size/3;
        graphics.setColor(new Color(randomColor(),randomColor(),randomColor()));
        graphics.fillRect(topLx+div, topLy+div, div, div);

        if (div > 4){
            drawElement(topLx, topLy, div, graphics);
            drawElement(topLx, topLy+div, div, graphics);
            drawElement(topLx + div, topLy, div, graphics);
            drawElement(topLx + 2*div, topLy, div, graphics);
            drawElement(topLx, topLy +2*div, div, graphics);
            drawElement(topLx+div, topLy +2*div, div, graphics);
            drawElement(topLx +2*div, topLy +div, div, graphics);
            drawElement(topLx + 2*div, topLy +2*div, div, graphics);
        }
    }

    public static void mainDraw(Graphics graphics) {
        drawBox(graphics);

    }

    public static void DrawHorizontalLine (int x1, int y1, int x2, int y2 ,Graphics graphics){
        graphics.drawLine(x1, (int)y1, (int)x2, y2);
    }
    public static void DrawToTopRight( double b1, double a2, double b2 ,Graphics graphics){

        b1 *= Math.cbrt(b1);

        graphics.drawLine((int)b1/2, (int)b1,  (int)a2, (int)b2);
    }
    public static void DrawDownToT (double c1, double d1, int c2, int d2 ,Graphics graphics){

    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        ImagePanel panel = new ImagePanel();//n
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));//n
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        while (true) {
            panel.repaint();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


// create a 300x300 canvas.
