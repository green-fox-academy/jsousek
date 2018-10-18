public class Main {
    public static void main(String[] args) {
        Fighter someFighter = new F16();


        Carrier lexington = new Carrier(5000, 1000);
        lexington.addFighter(new F16());
        lexington.addFighter(new F35());
        lexington.fillFighters();
        System.out.println(lexington.fightersOfCarrier.get(0).getStatus());

        StringBuffer allStatus = new StringBuffer();
        for (Fighter f : lexington.fightersOfCarrier) {
            System.out.println(f.getStatus());

        }


    }
}
