import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    List<OneTask> storage = new ArrayList<>();

    public TaskStorage(){

    }

    public void addTask (OneTask task){
        storage.add(task);
    }

    public void serviceDisplay() {
        for(OneTask o : storage) {
            System.out.println(o.toString());
        }
    }
}
