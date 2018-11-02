import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToFile {
    private String location = "data.txt";
    private Path path = Paths.get(location);


    public AddToFile(){

    }

   /* public void addTaskToStorage (String[] args, List<OneTask> listA){
        TaskStorage inFncStorage = new TaskStorage();
        listA = inFncStorage.storage;
        OneTask task = new OneTask(false, args[1]);
        listA.add(task);
        inFncStorage.serviceDisplay();
    }*/

    public void writeToFile (List<OneTask> listWrite){
        List<String> placeholder = new ArrayList<>();
        for (int i = 0; i <listWrite.size() ; i++) {
            placeholder.add(listWrite.get(i).toString());
        }
        StringBuffer buffer = new StringBuffer();
        String toWrite = "";
        for(String s : placeholder){
            buffer.append(s);
        }
        toWrite = buffer.toString();
        try {
            Files.write(path, toWrite.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            BufferedWriter writeList = new BufferedWriter(new FileWriter(location));
            for(String s : placeholder){
                writeList.write(s);
            }
            writeList.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }


    }


