import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner fScanner = new Scanner(System.in);
        double firstNr = fScanner.nextDouble();

        Scanner sScanner = new Scanner(System.in);
        double secondNr = sScanner.nextDouble();

        if (firstNr>secondNr){
            System.out.println(firstNr);
        }
        else
            System.out.println(secondNr);
    }
}
