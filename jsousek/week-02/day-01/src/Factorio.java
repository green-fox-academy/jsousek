import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {

        Scanner userScan = new Scanner(System.in);

        System.out.println("Give me the positive number and I give you the factorial of the number");

        int userInput =userScan.nextInt();

        while (userInput<=0){

            System.out.println("number has to be positive");

            userInput = userScan.nextInt();
        }

        System.out.println("Factorial of Your number is: "+factorial(userInput));

    }

    public static int factorial (int F){

        int factorial = 1;

        for (int i = 1; i <= F ; i++) {

            factorial =factorial*i;

        }
        return factorial;
    }
}
