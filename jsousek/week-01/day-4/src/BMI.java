import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Your mass in kg");

        Scanner mass = new Scanner(System.in) ;
        double massInKg = mass.nextDouble();

        System.out.println("Your height in m");

        Scanner height = new Scanner(System.in);
        double heightInM = height.nextDouble();

        double tempV = massInKg/heightInM;

        System.out.println("Your BMI: "+ tempV/heightInM);


        // Print the Body mass index (BMI) based on these values
    }
}