import java.util.Scanner;

public class TryCatchTest {

    public static void main(String[] args) {

        Scanner intScan = new Scanner(System.in);

        try {
            int base = intScan.nextInt();
            int divisor = intScan.nextInt();
            int product = base/divisor;

            System.out.println(product);

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Cant divide with 0!!");
        }
    }


}