public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int c = 0; //placeholder value

        c=a; //temporary = a
        a=b; //swaps tho original
        b=c; //load original value from temp buffer



        System.out.println(a);
        System.out.println(b);
    }
}