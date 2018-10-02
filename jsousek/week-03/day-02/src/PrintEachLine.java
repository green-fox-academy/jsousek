import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        File file = new File("my-file.txt");
        System.out.println(file.exists() +" "+ file.canRead() +" "+ file.canWrite());


        try {

            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNext()){
                System.out.println(fileScan.nextLine());
            }
            fileScan.close();
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File cannot be opened");
        }


    }
}