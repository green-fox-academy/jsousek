import org.junit.Test;

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
}
