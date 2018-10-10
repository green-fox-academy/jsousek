import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    Anagram anaTest = new Anagram("do g","go d");
    //Anagram anaWithSpaces =new Anagram("Mother in Law", "Hitler woman");

    @Test
    public void anaWithoutBlanksTest(){
        Anagram anaWithSpaces1 =new Anagram("Mother in Law", "Hitler woman");
        Anagram cleanAnag = new Anagram();
        cleanAnag.inputA = anaWithSpaces1.inputA.replaceAll("\\s+", "").toLowerCase();
        assertEquals(cleanAnag.inputA,"motherinlaw");
    }

    @Test
    public void anaWithoutBlanksTestB(){
        Anagram anaWithSpaces1 =new Anagram("Mother in Law", "Hitler wom   an");
        Anagram cleanAnag = new Anagram();
        cleanAnag.inputB = anaWithSpaces1.inputB.replaceAll("\\s+", "").toLowerCase();
        assertEquals(cleanAnag.inputB, "hitlerwoman");
    }
    @Test
    public void lenghtEqualsTest (){
        Anagram anaWithSpaces1 =new Anagram("Mother inlaw", "hitler woman");
        boolean nextB = true;
        if (anaWithSpaces1.inputA.length() != anaWithSpaces1.inputB.length()){
            nextB = false;
        }
        assertEquals(nextB, true);

    }
    @Test
    public void isAnagram (){
        Anagram anaWithSpaces1 =new Anagram("motherinlaw", "hitlerwoman");
        boolean inFncStatus = false;
        ArrayList<Character> listUno = new ArrayList<Character>();
        ArrayList<Character> listDuo = new ArrayList<Character>();
        for (char c: anaWithSpaces1.inputA.toCharArray()) {
            listUno.add(c);
        }
        for (char h: anaWithSpaces1.inputB.toCharArray()) {
            listDuo.add(h);
        }
        Collections.sort(listDuo);
        Collections.sort(listUno);

        if (listUno.equals(listDuo)){
            inFncStatus = true;
        }
        assertEquals(inFncStatus, true);

    }

}
