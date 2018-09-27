import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        //Bottom Left Corner
        for (int i = WIDTH/14; i <WIDTH ; i+=WIDTH/14) {
            graphics.drawLine(0, i,i,WIDTH );

        }




        //Top Right corner
        for (int i = WIDTH/14; i < WIDTH ; i+=WIDTH/14) {
            graphics.drawLine(i, 0,WIDTH,i);

        }




    }

    public static void DrawHorizontalLine (int x1, int y1, int x2, int y2 ,Graphics graphics){
        graphics.drawLine(x1,y2, x2,y2);
    }
    public static void DrawTopToDownRight (int a1, int b1, int a2, int b2 ,Graphics graphics){
        graphics.drawLine(a1,a2,b1,b2);
    }
    public static void DrawDownToToTopRight (int c1, int d1, int c2, int d2 ,Graphics graphics){
        graphics.drawLine(c1,c2,d1,d2);
    }

    // Don't touch the code below
    static int WIDTH = 560;
    static int HEIGHT = 560;

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

