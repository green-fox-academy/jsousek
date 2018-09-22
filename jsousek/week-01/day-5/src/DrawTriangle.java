// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle{
    public static void main(String[] args) {
        System.out.println("Type number of lines");

        Scanner userInput = new Scanner(System.in);
        int numberOfLines = userInput.nextInt();
        String star = "*";

        for (int i= 0;i<numberOfLines;i++){
            System.out.println(star);
            star = star+"*";

        }


    }
}
