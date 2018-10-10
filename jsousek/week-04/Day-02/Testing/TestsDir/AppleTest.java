import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {
    Apple appL = new Apple("apple");

    @Test
    public void getAppleTest (){
        assertEquals("apple",appL.getApple() );
    }
}
