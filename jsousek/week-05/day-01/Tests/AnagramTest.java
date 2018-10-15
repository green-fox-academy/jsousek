import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AnagramTest {


    Anagram anagram2 = new Anagram();

//    @Test
//    public void testIsEqualSize(){
//        assertEquals(firstString.length(), secondString.length() );
//    }
    @Test
    public void testOfAnagram(){
        assertEquals(anagram2.lengthCheck("bubak","kuba"),false);

    }
    @Test
    public void testAnagramLenght(){
        assertEquals(anagram2.lengthCheck("BabaYaga", "ScaryMonster"), false);
    }
    @Test
    public void testAnagramLenght2 () {
        assertEquals(anagram2.lengthCheckMessage("BabaYaga", "ScaryMonster"), "Your strings are not anagram");
    }
    @Test
    public void charArraySize(){
        assertEquals(anagram2.charArraySize("holla","hi" ), false);
    }

    @Test
    public void arrList1Test (){
        assertEquals(anagram2.arrList1(null).get(0),null);
    }
    @Test
    public void charArraySorted(){
        assertEquals(anagram2.charArraySize("holla","hallo" ), true);
    }

}
