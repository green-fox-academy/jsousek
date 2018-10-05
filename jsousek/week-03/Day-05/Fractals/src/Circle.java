import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {

    public static int randomColor(){
        int r =(int)(Math.random()*255);
        return r;
    }

    public static void drawCircle(int x, int y,  int size, Graphics graphics){
        int radF = size/3;
        int cX = x - (radF/2);
        int cY = y - (radF/2);
        graphics.drawOval(cX, cY, size, size);
        drawCircle();
        drawCircle();
        drawCircle();

    }



    public static void mainDraw(Graphics graphics) {

        drawCircle(300,300, 600, graphics);

        }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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

