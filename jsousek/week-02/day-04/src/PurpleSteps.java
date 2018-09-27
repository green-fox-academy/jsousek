import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics) {
        int step = 10;
        for (int i = 0; i <200 ; i+=12) {
            graphics.setColor(Color.magenta);
            graphics.fillRect(i,i,12,12);
            graphics.setColor(Color.BLUE);
            graphics.drawRect(i,i, 12,12);

        }


    }
    /*public static void oneBox (int step, Graphics graphics){
        graphics.setColor(Color.magenta);
        step = 10;
        graphics.fillRect(step, step,10,10);*/


    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
