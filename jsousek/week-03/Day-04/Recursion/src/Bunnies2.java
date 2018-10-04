// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunnies2 {
    public static void main(String[] args) {

        System.out.println(earsInLine(3));

    }
    public static int earsInLine (int nrOfBunnies){
        if (nrOfBunnies == 0){
            return nrOfBunnies;
        }
        else if (nrOfBunnies%2 != 0) {
            return 2 + earsInLine(nrOfBunnies - 1);

        }
        else   {
            return 3 + earsInLine(nrOfBunnies - 1);
        }

    }
}
