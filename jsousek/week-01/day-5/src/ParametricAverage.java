import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] userInput = new int[5];
        int sum = 0;

        System.out.println("enter five numbers");

        for (int i= 0;i<5;i++){
            userInput[i] = scan.nextInt();
            sum = sum+userInput[i];
        }
        System.out.println("total is: "+ sum);
        System.out.println("average is: "+ sum/5);

    }



}

