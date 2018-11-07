package depend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuschiaColor implements MyColor {


    @Override
    public void printColor(){

        System.out.println("Fuchsia");

    }
}
