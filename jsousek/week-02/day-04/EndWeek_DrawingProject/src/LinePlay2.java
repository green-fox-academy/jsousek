import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.green);
        drawLinesBottomLeft(graphics, 12, 20);
        graphics.setColor(Color.magenta);
        drawLinesUpperRight(graphics, 12, 20);


    }

    public static void drawLinesBottomLeft(Graphics graphics, int nrOfLines, int distanceBetweenLines) {
        int canvasHeight = 286;
        for (int i = 0; i <= nrOfLines; i++) {

            int x1 = 0;
            int y0 = canvasHeight - (nrOfLines * distanceBetweenLines);
            int y1 = y0 + (i * distanceBetweenLines);
            int x2 = distanceBetweenLines * i;
            int y2 = canvasHeight;

            graphics.drawLine(x1, y1, x2, y2);
        }

    }
    public static void drawLinesUpperRight(Graphics graphics, int nrOfLines, int distanceBetweenLines) {
        int canvasWidth = 297;
        for (int i = 0; i <= nrOfLines; i++) {

            int y1 = 0;
            int x0 = canvasWidth - (nrOfLines * distanceBetweenLines);
            int x1 = x0 + (i * distanceBetweenLines);
            int y2 = distanceBetweenLines * i;
            int x2 = canvasWidth;

            graphics.drawLine(x1, y1, x2, y2);
        }

    }

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