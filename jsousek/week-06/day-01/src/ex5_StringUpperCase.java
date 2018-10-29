

import java.util.List;
import java.util.stream.Collectors;

public class ex5_StringUpperCase {
    public static void main(String[] args) {
        String testWord = "Holla";

        for(char c : listOfUpperCase(testWord)){
            System.out.println(c);
        }
    }

    public static List<Character> listOfUpperCase ( String str){
        List <Character> lettersOfString = str.chars().
                mapToObj(s -> (char)s).
                filter(s -> s.isUpperCase(s)).
                collect(Collectors.toList());

        return lettersOfString;
    }
}
