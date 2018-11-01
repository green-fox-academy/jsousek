import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToFile {
    private String location = "data.txt";
    private Path path = Paths.get(location);


    public AddToFile(){

    }

    public void addTaskToStorage (String[] args){
        TaskStorage inFncStorage = new TaskStorage();


        OneTask task = new OneTask(false, args[1]);
        inFncStorage.addTask(task);
    }

    public void writeToFile(){
        TaskStorage inFncStorage = new TaskStorage();
        List<String> placeholder = new ArrayList<>();
        for (OneTask o : inFncStorage.storage){
            placeholder.add(o.toString());
        }


        try {
            Files.write(path, placeholder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            BufferedWriter writeList = new BufferedWriter(new FileWriter(location));
            for(OneTask o : inFncStorage.storage){
                writeList.write(o.toString());
            }
            writeList.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }


    }


