// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WriteMultipleLines{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        Path myPath = Paths.get("input.txt");

        System.out.println("How many lines should be in a file?");

        int nrLines = userInput.nextInt();

        System.out.println("Please insert input word");

        String word = userInput.next();

        try {

            fileWriter( myPath, word, nrLines );

        } catch (IOException e) {
            e.printStackTrace();
        }//end catch

    }//end main

   public static void fileWriter (Path myPAth, String word, int nrLines) throws IOException {


        List<String> tempList = new ArrayList<>();
        for (int i = 0; i <nrLines ; i++) {
           tempList.add(word);

       }//end of fori

       Files.write(myPAth,tempList, Charset.defaultCharset() );
   }//end of fnc

}