import java.util.ArrayList;

public class Carrier {
    int initialAmmo;
    ArrayList<Fighter> fightersOfCarrier;


    public Carrier (int initialHP, int initialAmmo){
        this.initialAmmo = initialAmmo;
        this.fightersOfCarrier = new ArrayList<>();

    }

    public void addFighter(Fighter someF){
        fightersOfCarrier.add(someF);
    }

    public void fillFighters (){
        for (Fighter f : fightersOfCarrier) {
            f.refill(initialAmmo);
            initialAmmo = initialAmmo - f.refill(initialAmmo);

        }
    }
}
