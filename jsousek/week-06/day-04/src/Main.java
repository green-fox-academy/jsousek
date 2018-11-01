import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        if (args[0].equals("-l")) {
        }
        if (args[0].equals("-a")) {
            AddToFile add = new AddToFile();
            add.addTaskToStorage(args);
            add.writeToFile();
        }
        if (args[0].equals("-r")) {
        }
        if (args[0].equals("-c")) {

        } else {
            WelcomeScreen ws = new WelcomeScreen();}
    }
}
