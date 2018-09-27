import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter{
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        //only works through the center of canvas

        int startX=0;
        int startY=0;
        for (int i = 0; i < 200; i+=20) {
            drawLine(startX,startY+i,graphics);
            for (int j = 0; j < 200; j+=20) {
                drawLine(startX+i, startX,graphics);


                }
                
            }
        }







    public static void drawLine (int x, int y, Graphics graphics){
        graphics.drawLine(x,y,200-x,200-y);

    }

    // Don't touch the code below
    static int WIDTH = 200;
    static int HEIGHT = 200;
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
