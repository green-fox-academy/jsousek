import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.abs;

public class Carrier {
    int initialAmmo;
    int initialHP;
    ArrayList<Fighter> fightersOfCarrier;


    public Carrier (int initialHP, int initialAmmo){
        this.initialHP = initialHP;
        this.initialAmmo = abs(initialAmmo);
        this.fightersOfCarrier = new ArrayList<>();

    }

    public void addFighter(Fighter someF){
        fightersOfCarrier.add(someF);
    }

    public void fillFighters() {
        int ammoNeeded = 0;
        for (int i = 0; i < fightersOfCarrier.size(); i++) {
            ammoNeeded += fightersOfCarrier.get(i).mAXAmmo;
        }
        /*for (Fighter f :fightersOfCarrier  ) {
            if (f.isPriority && initialAmmo < 0){
                f.refill(initialAmmo);
                initialAmmo -= f.refill(initialAmmo);
            }
        }
        for (Fighter f : fightersOfCarrier){
            if (!f.isPriority && initialAmmo < 0){
                f.refill(initialAmmo);
                initialAmmo -= f.refill(initialAmmo);
            }
        }*/

        if (initialAmmo - ammoNeeded <= 0) {
            System.out.println("no Ammo");
        }
        else if (ammoNeeded > initialAmmo) {
            for (int i = 0; i < fightersOfCarrier.size(); i++) {
               if (fightersOfCarrier.get(i).isPriority == true && initialAmmo > 0) {
                    fightersOfCarrier.get(i).refill(initialAmmo);
                }
            }
        }
       // else for (Fighter f : fightersOfCarrier) {
            //f.refill(ammoNeeded);
      //  }
        for (int i = 0; i < fightersOfCarrier.size(); i++) {
            initialAmmo -= fightersOfCarrier.get(i).mAXAmmo;
        }
    }

    public void carrierStatus (){
        System.out.println("Our ammo status is: "+initialAmmo);
        System.out.println("Our health is "+initialHP);
        for (Fighter f : fightersOfCarrier) {
            System.out.println(f.getStatus());

        }
    }
    public void fight (){
        Carrier enemy =new Carrier(20, 2000);

        System.out.println("General quarters!");
        int ourDamage = 0;
        for (Fighter f : fightersOfCarrier) {
            ourDamage += f.dmg * f.fighterAmmo;
            }
        System.out.println("We struck enemy for: "+ourDamage);
        enemy.initialHP -= ourDamage;
        if (enemy.initialHP <= 0) {
            System.out.println("Enemy carrier sunk !");
        }
        System.out.println( "Enemy health is: " + enemy.initialHP);


    }


}
