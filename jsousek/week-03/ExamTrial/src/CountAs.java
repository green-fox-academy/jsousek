import java.util.Scanner;

public class CountAs {
    static Scanner newScan = new Scanner(System.in);

    public static void main(String[] args) {



    }
    public static int letterCount ( String inputString ) {

        inputString = newScan.next();
        int countLetter = 0;

        for (int i = 0; i <inputString.length() ; i++) {

            if (inputString.charAt(i) == 'a' ){
                countLetter =countLetter+1; //or countLetter++
            }//end of If
        }//end of fori

        return countLetter;
    }//end of function
}

// Create a function that takes a string parameter,
// counts the occurrences of the letter "a", and returns it as a number.

// example: on the input "Apple" the function should return 1 - print this result
// example: on the input "Avocado" the function should return 2 - print this result
// example: on the input "Blueberry" the function should return 0 - print this result