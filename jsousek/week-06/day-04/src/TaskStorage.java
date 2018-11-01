import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    List<OneTask> storage;

    public TaskStorage(){
        this.storage = new ArrayList<>();
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
