package utilities;

import org.springframework.stereotype.Service;

@Service
public class EmailValidator {

    public String validate (String input){
        if(input.contains("@") && input.contains(".") ){
            return "green";
        }
        else return "red";
    }
}
