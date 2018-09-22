import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int inputNumber = number.nextInt();

       // int multiplicator = 1;

        for (int a =0 ;a<11; a++ ) {
            System.out.println(a+" * "+inputNumber+" = "+inputNumber*a);
        }




    }
}
