import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public String lengthCheckMessage(String s, String s2){
        boolean sameLength;
        String message="";

        sameLength = (s.length() == s2.length());
        if(sameLength == false){
            message = "Your strings are not anagram";
        }
        return message;
    }
    public boolean lengthCheck (String s, String s2){
        return (s.length() == s2.length());
    }
    public boolean charArraySize (String s1, String s2){
       return s1.toCharArray().length == s2.toCharArray().length;
    }

    public ArrayList<Character> arrList1(String s1){
        ArrayList<Character> list1 = new ArrayList<>();
        if ( s1 == null){
            ArrayList<Character> nuller = new ArrayList<Character>();
            nuller.add(null);
            return nuller;
        }
        else {
        for (Character c : s1.toCharArray()) {
            list1.add(c);
            }
        }
        return list1;
    }

//    public ArrayList<Character> arrList2(String s2){
//
//    }

    public boolean charArraySortedSize (String s1, String s2){
    if (s1 == null || s2 == null){
        return false;
    }
    else {

        List <Character> array = new ArrayList<>();
        List <Character> array1 = new ArrayList<>();
        for (Character character : s1.toCharArray()) {
            array.add(character);
        }
        for (Character character : s2.toCharArray()) {
            array1.add(character);
        }

        Collections.sort(array);
        Collections.sort(array1);

        return array.equals(array1);
        }
    }
}
