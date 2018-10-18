import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {



        Carrier lexington = new Carrier(5000, 13);
        lexington.addFighter(new F16());
        lexington.addFighter(new F35());
        lexington.fillFighters();

        lexington.carrierStatus();

        lexington.fight();


    }
}
