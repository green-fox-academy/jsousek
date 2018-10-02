import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFile {


    static Scanner inputScan = new Scanner(System.in);

    public static void main(String[] args) {
        Path oldPath = Paths.get("input.txt");

        System.out.println("Insert new file name");
        String fileName = inputScan.next()+".txt";

        try {
            copyCat(oldPath,fileName );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
    public static boolean copyCat (Path oldPath, String fileName) throws IOException {
        Path newPath = Paths.get(fileName);
        Files.copy(oldPath,newPath );


        return (oldPath == newPath);

    }
}
