import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineQuarters {
    public static void mainDraw(Graphics graphics) {

        /*Scanner newScan = new Scanner(System.in);
        System.out.println("Insert number of Quarters(4, 16 or 64)");
        int generalQuarters = newScan.nextInt();

        while (generalQuarters != 4 && generalQuarters != 16 && generalQuarters != 64) {
            System.out.println("number must be 4, 16 or 64");
            newScan.nextInt();
        }*/
        int generalQuarters = 4;
        bottomLeft(generalQuarters, lineCount,lineSpace,graphics);
    }

    public static void bottomLeft(int generalQuarters, int lineCount, int lineSpace, Graphics graphics) {

        int quarterSize = WIDTH / generalQuarters;
        graphics.setColor(Color.GREEN);

        for (int i = 0; i < lineCount; i++) {

            int x1 = 0;
            int y0 = (int) (WIDTH - (lineCount * lineSpace / generalQuarters));
            int y1 = (int) (y0 + (i * lineSpace / generalQuarters));
            int x2 = (int) (lineSpace / generalQuarters * i);
            int y2 = WIDTH;

            graphics.drawLine(x1, y1, x2, y2);

        }
    }


    public static void topRight(int generalQuarters, int lineCount, int lineSpace, Graphics graphics) {
        int quarterSize = HEIGHT / generalQuarters;
        graphics.setColor(Color.BLUE);

        for (int i = 0; i < lineCount; i++) {

        }
    }


    // Don't touch the code below
    static int WIDTH = 501;
    static int HEIGHT = 501;

    static int lineCount = 20;
    static int lineSpace = 20;

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
