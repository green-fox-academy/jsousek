import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        int input = myNumber.nextInt();

        if (input%2>0){
            System.out.println("input munber is odd");
        }
        else {
            System.out.println("input number is even");
        }
    }
}
