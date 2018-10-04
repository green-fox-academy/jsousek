// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class NPower {
    public static void main(String[] args) {

        System.out.println(powerOf(2,3));

    }
    public static int powerOf (int base, int powerOf) {
        if (powerOf == 0){
            return 1;      //since a^0 is always 1
        }
        else {
            return base*powerOf(base, powerOf-1); }

    }
}
