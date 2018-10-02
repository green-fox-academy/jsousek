import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;


public class CopyFile {


    static Scanner inputScan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert file name you want to copy, with filetype");
        String origFileName = inputScan.next();


        System.out.println("Insert new file name");
        String newFileName = inputScan.next()+".txt";

        try {
            boolean CopySuc = copyCat(origFileName, newFileName);

            if (CopySuc){

                System.out.println("Copy was successful");
            }
            else System.out.println("Copy Error");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static boolean copyCat (String origFileName, String newFileName) throws IOException {

        Path oldPath = Paths.get(origFileName);

        Path newPath = Paths.get(newFileName);

        Files.copy( oldPath,newPath );//important

        List<String> origList =Files.readAllLines(oldPath);
        List<String> copiedList = Files.readAllLines(newPath);


        boolean copySuccess = (origList.equals(copiedList));
        return copySuccess;




    }
}
