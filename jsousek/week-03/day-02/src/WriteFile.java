import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteFile {
    public static void main(String[] args) {

        Path myPath = Paths.get("my-file.txt");

        try {
            Files.write(myPath,"Jiri Sousek".getBytes());

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Cant write into file");
        }//end of catch
        
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"


    }
}