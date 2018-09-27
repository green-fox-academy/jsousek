import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SandBox {
    public static void mainDraw(Graphics graphics) {
        //for (int i = 0; i <=440 ; i+=20) {
        int i =20;


            DrawHorizontalLine(220-i/2, i, 220+i/2, i,graphics);

        //}



    }

    public static void DrawHorizontalLine (int x1, int y1, int x2, int y2 ,Graphics graphics){
        graphics.drawLine(x1,x2, y1,y2);
    }
    public static void DrawTopToDownRight (int a1, int b1, int a2, int b2 ,Graphics graphics){
        graphics.drawLine(a1,a2,b1,b2);
    }
    public static void DrawDownToToTopRight (int c1, int d1, int c2, int d2 ,Graphics graphics){
        graphics.drawLine(c1,c2,d1,d2);
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
