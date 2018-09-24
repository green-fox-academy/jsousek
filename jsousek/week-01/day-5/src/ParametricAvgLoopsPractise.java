import java.util.Scanner;

public class ParametricAvgLoopsPractise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int zero = 0;

        System.out.println("Enter five numbers");

        for (int i=0;i<5;i++){
            int userInput =input.nextInt();
            zero = userInput+zero;

        }
         System.out.println(zero);
        System.out.println((zero/5);
    }
}
