import java.sql.SQLOutput;
import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        double nrInput = myNumber.nextDouble();

        if (nrInput < 1) {
            System.out.println("not enough");
        }
        else if (nrInput == 1) {
            System.out.println("its one");
        }
          else if (nrInput == 2) {
                System.out.println("its two");

               } else if (nrInput > 2) {
                System.out.println("its a lot");
            }
        }
    }

