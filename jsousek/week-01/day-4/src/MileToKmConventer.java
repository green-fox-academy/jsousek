import java.util.Scanner;

public class MileToKmConventer {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Write distance in miles");

        Scanner mileInput = new Scanner(System.in);
        int userInput = mileInput.nextInt();
        double convRate = 1.609344;

        System.out.println( userInput * convRate +" km");
    }
}