import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner firsNr = new Scanner(System.in);
        int nrA = firsNr.nextInt();

        Scanner secNr = new Scanner(System.in);
        int nrB = secNr.nextInt();

        if (nrB<nrA) {
            System.out.println("first number must be lower then second one");
        }
        else while (nrA<nrB){
            System.out.println(nrA);
            nrA++;

        }

    }
}
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5