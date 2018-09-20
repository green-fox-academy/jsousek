import java.sql.SQLOutput;

public class Cuboid {
    public static void main(String[] args) {
        //cuboid sides
        double aWidth = 10;
        double bDepth = 12;
        double cHeight = 15;

        //cuboid calculations
        //surface
        System.out.println("Surface: "+2*(aWidth*bDepth+bDepth*cHeight+aWidth*cHeight));

        //space
        System.out.println("Space: "+aWidth*bDepth*cHeight);

    }

}



