// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
    public static void main(String[] args) {

        try {
            System.out.println(earsCount(6));
        } catch (StackOverflowError e) {
            e.printStackTrace();
            System.out.println("Bunniecalipse!!!");
        }

    }
    public static int earsCount (int nrOfBunnies){
        if ( nrOfBunnies == 0) {
            return nrOfBunnies;
        }
        else {return 2 + earsCount(nrOfBunnies-1) ;

        }
    }
}
