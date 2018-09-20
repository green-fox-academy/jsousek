import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("Write the number of chickens");

        Scanner chickenLegs = new Scanner(System.in);
        int chicken = chickenLegs.nextInt();

        System.out.println("Write the number of pigs");

        Scanner pigLegs = new Scanner(System.in);
        int pigs = pigLegs.nextInt();

        System.out.println("Number of legs is: " + (pigs*4 + chicken*2));
    }
}