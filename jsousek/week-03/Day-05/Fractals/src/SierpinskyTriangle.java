
import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class SierpinskyTriangle {
    static int SIZE = 600;
    public static void drawPolygon(Graphics graphics){


    }

    public static void mainDraw(Graphics graphics) {
        int triaHeight = (int)Math.round(SIZE*Math.sqrt(3)/2);
        Point p1 = new Point(0, triaHeight);
        Point p2 = new Point(SIZE/2, 0);
        Point p3 = new Point(SIZE, triaHeight);
        Polygon p = new Polygon();
        p.addPoint(p1.x, p1.y);
        p.addPoint(p2.x, p2.y);
        p.addPoint(p3.x, p3.y);
        graphics.drawPolygon(p);



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
