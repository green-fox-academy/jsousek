// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        adderF(5);
        System.out.println(adderF(3));

    }

    public static int adderF (int a) {

        if (a == 0) {
            return a;
        } else {
            return adderF(a - 1) + a;
        }
    }
}
