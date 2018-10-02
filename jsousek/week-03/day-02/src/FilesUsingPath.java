import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesUsingPath {

    public static void main(String[] args) {

        Path myPath = Paths.get("my-file.txt");


        try {
            List<String> ourList =Files.readAllLines(myPath);

            for(String lineOutput:ourList){
                System.out.println(lineOutput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path secondPath = Paths.get("types.txt");
        //Files.createFile(secondPath); creates nex empty file
        try {
            Files.write(secondPath, "Boolean, char , int, byte".getBytes());

            List <String> nextList = Files.readAllLines(secondPath);

            for(String linesRom : nextList){
                System.out.println(linesRom);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}

