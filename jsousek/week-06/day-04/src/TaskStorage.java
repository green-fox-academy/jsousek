import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    List<OneTask> storage = new ArrayList<>();

    public TaskStorage(){

    }

    public void addTask (String[] args){
        storage.add(new OneTask(false, args[1]));
    }

    public List<OneTask> TaskStorageTOList(TaskStorage t){
        List<OneTask> toReturn = t.storage;
        return toReturn;
    }

    public void writeStream (){
        try {
            FileOutputStream fileOut = new FileOutputStream("DataStream.txt");
            ObjectOutputStream stream = new ObjectOutputStream(fileOut);
            stream.writeObject(storage);
            stream.close();
            fileOut.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String loadStream (String fileName){
        String s = "";
        try {
            FileInputStream fileIn = new FileInputStream("DataStream.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileIn);
            s = inputStream.readObject().toString();
            inputStream.close();
            fileIn.close();
        }
        catch (IOException e) {e.printStackTrace(); }
        catch (ClassNotFoundException e ) {e.printStackTrace(); }
        return s;
    }



    public void serviceDisplay() {
        for(OneTask o : storage) {
            System.out.println(o.toString());
        }
    }
}
