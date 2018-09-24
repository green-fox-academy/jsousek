import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner userNumber =new Scanner(System.in);

        System.out.println("Please, give me the positive number");

        int number = userNumber.nextInt();

        System.out.println("Total sum of all numbers before the number you added is "+sum(number));


    }
    public static int sum(int num){

        int sum =0;

        for (int i = 0; i <= num; i++) {

            sum = i+sum;
        }
        return sum;
    }


}
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer