import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumTest {
    

@Test
    public void getSumTest(){

    ArrayList<Integer> testList = new ArrayList<>();
    Sum temp =new Sum(0);
    testList.add(10);
    testList.add(15);
    testList.add(25);
    assertEquals(50, temp.getSum(testList));
    }

    
}
