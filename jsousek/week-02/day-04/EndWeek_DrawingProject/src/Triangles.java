import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i <=440 ; i+=20) {


           // DrawHorizontalLine(220-i/Math.cbrt(3), i, 220+i ,i,graphics);

        }
        for (int i = 0; i <=440 ; i+=20) {


           // DrawToTopRight(i,i,WIDTH, graphics);

            //DrawDownToToTopRight( , ,,);
        }



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
    static int WIDTH = 440;
    static int HEIGHT = 440;

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


// create a 300x300 canvas.