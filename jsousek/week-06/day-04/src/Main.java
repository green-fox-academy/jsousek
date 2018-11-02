import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {

    static TaskStorage TASK_STORAGE = new TaskStorage();
    public static List<OneTask> STATIC_LIST = TASK_STORAGE.storage;

    public static void main(String[] args) {
        if (args.length == 0){
            WelcomeScreen ws = new WelcomeScreen();
        }
        else if (args[0].equals("-l")) {
            System.out.println(TASK_STORAGE.loadStream("DataStream.txt"));
        }
        else if (args[0].equals("-a")) {


            TASK_STORAGE.addTask(args);
            TASK_STORAGE.writeStream();

            STATIC_LIST = TASK_STORAGE.TaskStorageTOList(TASK_STORAGE);
            AddToFile add1 = new AddToFile();
            add1.writeToFile(STATIC_LIST);

        }
        else if (args[0].equals("-r")) {
        }
        else  if(args[0].equals("-c")) {}


    }
}
