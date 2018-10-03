public class Animals {
    int hunger;
    int thirst;

    public Animals (){
        hunger = 50;
        thirst = 50;
    }

    public int eating () {
        hunger--;
        return hunger;
    }

    public int drinking (){
        thirst--;
        return thirst;
    }

    public int addHunger (){
        hunger++;

        return hunger;
    }
    public int playing (){
        addHunger();
        thirst++;
        return thirst;
    }

    public static void main(String[] args) {
        Animals zebra = new Animals();
        zebra.eating();
        zebra.drinking();
        zebra.playing();

        System.out.println(zebra.hunger);
        System.out.println(zebra.thirst);
    }
}

   /* Create an Animal class
Every animal has a hunger value, which is a whole number
                Every animal has a thirst value, which is a whole number
                when creating a new animal object these values are created with the default 50 value
        Every animal can eat() which decreases their hunger by one
        Every animal can drink() which decreases their thirst by one
        Every animal can play() which increases both by one*/
