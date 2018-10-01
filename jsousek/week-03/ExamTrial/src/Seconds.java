import java.util.ArrayList;
import java.util.Scanner;

public class Seconds {

    static Scanner scanToList = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Double> exampleList = new ArrayList<Double>();

        System.out.println("How long should be your list?");

        int listLength = scanToList.nextInt();

        System.out.println("Please give me numbers and I print you every second one");

        for (int i = 0; i <listLength ; i++) {

            exampleList.add(scanToList.nextDouble());

        }//end of fori

        everySecond(exampleList);

    }

    public static void everySecond (ArrayList exampleList){

        for (int i = 1; i <exampleList.size() ; i+=2) {// i musts start with 1 to print every second

            System.out.println(exampleList.get(i));

        }//end of fori in fnc


    }//end of fnc
}


// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result