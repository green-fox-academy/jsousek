import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DisplayFile extends OneTask {
    private String location = "data.txt";
    private Path path = Paths.get(location);
    TaskStorage t = new TaskStorage();

    public void showTasks(){

        StringBuffer buffer1 = new StringBuffer();
       // for(String s : createListToDisplay()){

        //}


    }
    private List createListToDisplay(){
        List <String> displayList = new ArrayList<String>();


        try {
            displayList = Files.readAllLines(path, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return displayList;
    }
    @Override
    public  String toString(){
        String s = "";
        if (this.isDone == false){
            return s = id + " -  [ ] " + taskDecryption +"\n";}
        else return s = id + " -  [x] " + taskDecryption +"\n";


    }
}
