import java.util.Arrays;

import java.util.Arrays;

public class Domino implements Comparable<Domino> {
    private final int[] values;



    Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    private int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }
   /*@Override
    public int compareTo (Domino a){
        return Integer.compare(getValues()[0], a.getValues()[0]);
    }*/

    @Override
    public int compareTo(Domino o) {
        if (getValues()[0] == o.getValues()[0]) {
            return  0;
        }
        else if (getValues()[0] <o.getValues()[0]){
            return  -1;
        }
        else return 1;
    }
}