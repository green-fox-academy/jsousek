import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i <4 ; i++) {
            randomRect(graphics);

        }


    }
    public static void randomRect (Graphics graphics){
         //for more random rectangles add another random G a B in RGB

        double R = Math.floor(Math.random()*255);
        int RInt = (int) R;
        Color randomColor =new Color(RInt,245,10);
        graphics.setColor(randomColor);

        double XD = Math.floor(Math.random()*WIDTH);
        int X = (int) XD;

        double YD = Math.floor(Math.random()*HEIGHT);
        int Y = (int) YD;

        graphics.drawRect(X,Y,10,15);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
