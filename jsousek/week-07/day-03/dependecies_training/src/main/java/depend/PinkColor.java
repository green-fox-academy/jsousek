package depend;

import org.springframework.stereotype.Service;


public class PinkColor implements MyColor {

    @Override
    public void printColor(){
        System.out.println("pink");
    }
}
