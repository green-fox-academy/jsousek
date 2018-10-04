// Given a non-negative int n, return the sum of its digits recursively (no loops) :,(
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

import java.util.Scanner;

public class SumDigit {
    static Scanner staticInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("give me a positive number and I give you its digits sum, using fancy recursion count");
        int userInput =staticInt.nextInt();

        try {
            System.out.println(digitSum(userInput));
        } catch (StackOverflowError e) {
            e.printStackTrace();
        }

        if (digitSum(userInput) <= 0){
            System.out.println("No workie workie, insert positive number");
            System.out.println(digitSum(staticInt.nextInt()));
        }
    }

    public static int digitSum (int a){
        if (a <= 0){
            return a;
        }
        else {
            return (a%10)+digitSum(a/10);
        }
    }
}
