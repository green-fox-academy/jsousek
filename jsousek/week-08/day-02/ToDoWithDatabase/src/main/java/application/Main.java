package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    ToDoInterface data;
    @Autowired
    public Main(ToDoInterface data){
        this.data = data;
    }


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*ToDo example = data.save(ToDo.builder().title("learn sql").urgent(true).done(false)
                .build());
        ToDo example2 = data.save(ToDo.builder().title("learn interfaces").urgent(true).done(false)
                .build());
        ToDo example3 = data.save(ToDo.builder().title("walk the fish").urgent(false).done(true)
                .build());*/
    }
}
