import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ConverterTest {
    Converter converter1 = new Converter();

    @Test
    public void ConvertOne(){
        assertEquals(converter1.ConvertOne(2),"One");
    }

    @Test
    public void LastDigit(){
        assertEquals(converter1.lastDigit(11), 1);
    }
    @Test
    public void LastDigitAndZero(){
        assertEquals(converter1.lastDigitAndZero(10), 0);
    }

}
