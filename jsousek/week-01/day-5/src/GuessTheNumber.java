import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {
        int storedNr = 8;

        Scanner userInp = new Scanner(System.in);
        int i =userInp.nextInt();

        if (i < storedNr ){
            System.out.println("Your number is smaller.");
        }
        else if (i > storedNr){
            System.out.println("Your number is greater.");
        }
        else if (i == storedNr) {
            System.out.println("Touche");
        }
    }
}
