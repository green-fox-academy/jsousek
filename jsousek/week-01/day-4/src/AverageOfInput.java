import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner firstInt = new Scanner(System.in);
        int nr1 = firstInt.nextInt();

        Scanner secondInt = new Scanner(System.in);
        int nr2 = secondInt.nextInt();

        Scanner thirdInt = new Scanner(System.in);
        int nr3 = thirdInt.nextInt();

        Scanner fourthInt = new Scanner(System.in);
        int nr4 = fourthInt.nextInt();

        Scanner fifthInt = new Scanner(System.in);
        int nr5 = fifthInt.nextInt();

        double subTotal = nr1+nr2+nr3+nr4+nr5;

        double product = subTotal/5;

        System.out.println(product);




    }
}
