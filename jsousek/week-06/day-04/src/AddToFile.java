import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddToFile {
    private String location = "data.txt";
    private Path path = Paths.get(location);
    TaskStorage t = new TaskStorage();

    public AddToFile(){

    }

    private void addTaskToStorage (String[] args){
        OneTask task = new OneTask(Integer.parseInt(args[1]) ,false, args[2]);
        this.t.addTask(task);
    }

    private void writeToFile(String[] args){
        addTaskToStorage(args);

        try {
            BufferedWriter writeList = new BufferedWriter(new FileWriter(location));
            for(OneTask o : t.storage){
                writeList.write(o.toString());
            }
            writeList.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
