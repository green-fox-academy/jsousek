import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        // Draw a green 10x10 square to the canvas' center.
        graphics.drawRect((WIDTH/2)-5,(HEIGHT/2)-5,10, 10);
        graphics.drawRect(0,0,HEIGHT,WIDTH);



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 344;

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
