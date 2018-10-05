
import javax.swing.*;
import java.awt.*;
import java.util.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class SierpinskyTriangle {
    static int SIZE = 600;
    static int triaHeight = (int)Math.round(SIZE*Math.sqrt(3)/2);



    public static void mainDraw(Graphics graphics) {

        Point p1 = new Point(0, triaHeight);
        Point p2 = new Point(SIZE, triaHeight);
        Point p3 = new Point(SIZE/2 , 0);

        drawSierp(p1, p2, p3, 8, graphics);






    }
    public static void drawSierp (Point p1, Point p2, Point p3, int recuLvl, Graphics graphics){
        if (recuLvl == 1) {
            Polygon p = new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            graphics.drawPolygon(p);
        }
        else {
            Point p4 = new Point(p3.x /2,p1.y /2 );
            Point p5 = new Point (((p2.x/2)+(p2.x /4)), p2.y/2);
            Point p6 = new Point (p2.x/2, p);

           /* Point p4 = midpoint(p1, p3);
            Point p5 = midpoint(p3, p2);
            Point p6 = midpoint(p1, p2);*/



            drawSierp( p1, p6, p4, recuLvl -1 , graphics);
            drawSierp( p6, p2, p5, recuLvl -1, graphics);
            drawSierp( p4, p5, p3, recuLvl -1, graphics);

        }


    }
    public static Point midpoint(Point p1, Point p2) {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
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



