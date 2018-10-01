import java.util.ArrayList;
import java.util.Scanner;

public class Seconds {

    static Scanner scanToList = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Double> exampleList = new ArrayList<Double>();

        System.out.println("How long should be your list?");

        int listLenght = scanToList.nextInt();

        System.out.println("Please give me numbers and I print you every second one");

        for (int i = 0; i <5 ; i++) {

            exampleList.add(scanToList.nextDouble());
        }

    }
    public static void everySecond (ArrayList exampleList){

    }
}


// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result