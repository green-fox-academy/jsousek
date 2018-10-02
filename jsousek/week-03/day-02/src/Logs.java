// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        Path filePath = Paths.get("my-file.txt");



        try {
            List<String> origList = Files.readAllLines(filePath);
            System.out.println(ratio(filePath));

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            iPList(filePath);
            System.out.println(iPList(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    } //end of main

    public static List iPList (Path filePath) throws IOException {
        filePath = Paths.get("my-file.txt");
        List<String> origList = Files.readAllLines(filePath);
        List <String> iPList =new ArrayList<>();
        for (String s:origList) {

            iPList.add(s.substring(27,38));

        }

        return iPList;

    }

    public static double ratio(Path filePath) throws IOException {
        filePath = Paths.get("my-file.txt");
        List<String> origList = Files.readAllLines(filePath);

        int postC = 0, getC = 0;

        for (String s : origList) {
            if (s.substring(41, 45).equals("POST")) {
                postC++;
            } else if (s.substring(41, 44).equals("GET")) {
                getC++;
            }

        }//end fore
        // int nrPost = Collections.frequency(origList,"POST");
        return postC / (double) getC;

    }//end of fnc2
} //end of class