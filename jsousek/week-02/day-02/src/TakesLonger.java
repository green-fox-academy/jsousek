import java.util.ArrayList;
import java.util.Arrays;

public class TakesLonger {

    public static void main(String... args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String addedPart = " " + "always takes longer than";

        ArrayList<String> quoteArray = new ArrayList<>(Arrays.asList(quote.split ("(?<=It)")));
        quoteArray.add(1, addedPart);


        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        int arLenght = quoteArray.size();

        for (int i = 0; i < arLenght; i++) {
            System.out.print(quoteArray.get(i));
        }


    }
}
