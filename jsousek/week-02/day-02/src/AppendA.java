/*import java.lang.reflect.Array;
import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        appendA(far);

        System.out.println(appendA());

    }

    public static ArrayList appendA (ArrayList <String> newAppend) {

        ArrayList <String> tempList = new ArrayList<>();

        for (Object str:newAppend) {
            tempList.add(str.toString()+"a");

        }
        /*for (int i = 0; i <newAppend.size() ; i++) {
            tempList.add(tempList.get(i)+"a");

        }
        return tempList;
    }
}

 The output should be: "boa", "anaconda", "koala", "panda", "zebra"

*/