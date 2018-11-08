package depend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main  implements CommandLineRunner{

    Printer printer;
    MyColor color;

    @Autowired
    public Main(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    @Override
    public void run(String...args){
        //pink1.printColor();
        color.printColor();
    }





   // @Autowired
    // PinkColor pink1;

    @Autowired
    FuschiaColor fuchs1;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
