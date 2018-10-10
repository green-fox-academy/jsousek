import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

    public String inputA;
    public String inputB;

    public Anagram(String inputA, String inputB) {
        this.inputA = inputA;
        this.inputB = inputB;
    }
    public Anagram(){
        this.inputA = inputA;
        this.inputB = inputB;
    }

    public Anagram anaWithoutBlanks (Anagram anaWithSpaces){
        Anagram cleanAnag = new Anagram();
        cleanAnag.inputA = anaWithSpaces.inputA.replaceAll("\\s+", "").toLowerCase();
        cleanAnag.inputB = anaWithSpaces.inputB.replaceAll("\\s+", "").toLowerCase();
        return cleanAnag;
    }

    public boolean lenghtEquals (Anagram someAna){
        boolean nextB = true;
        if (someAna.inputA.length() != someAna.inputB.length()){
            nextB = false;
        }
        return nextB;
    }
    public boolean isAnagram (Anagram anyAna){
        boolean inFncStatus = false;
        ArrayList<Character> listUno = new ArrayList<Character>();
        ArrayList<Character> listDuo = new ArrayList<Character>();
        for (char c: anyAna.inputA.toCharArray()) {
            listUno.add(c);
            }
        for (char h: anyAna.inputB.toCharArray()) {
            listDuo.add(h);
            }
        Collections.sort(listDuo);
        Collections.sort(listUno);

        if (listUno.equals(listDuo)){
            inFncStatus = true;
            }
        return inFncStatus;
    }
}

