import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CountLines {
    public static void main(String[] args) {

        Path nextPath = Paths.get("my-file.txt");
        Path secondPath =Paths.get("Types.txt");

        try {

            Linecounter(secondPath);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of psvm

    public static void Linecounter ( Path tryPath) throws IOException { //what to put in function

        tryPath = Paths.get("");
        List <String> placeholder = Files.readAllLines(tryPath);
        int counter = placeholder.size();
        System.out.println(counter);

    } //end of fnc


}//end of Class
