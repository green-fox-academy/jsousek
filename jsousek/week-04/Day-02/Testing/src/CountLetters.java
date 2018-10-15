import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public String inputStr;


    public CountLetters(String inputStr) {
        this.inputStr = inputStr;

    }

    public CountLetters() {
        this.inputStr = inputStr;
    }

    public int stringLen (String inputStr) {
        int len = inputStr.length();
        return len;
    }
    public Map letterDictionary(String inputStr){
        Map <Character , Integer> dictionary = new HashMap<Character, Integer>();
        for (int i = 0; i <inputStr.length() ; i++) {
            char charAt = inputStr.charAt(i);
            dictionary.put(charAt, dictionary.get(charAt)+1);
        }
        return dictionary;



    }






}
