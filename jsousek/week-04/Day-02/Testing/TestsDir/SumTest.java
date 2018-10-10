import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SumTest {

    ArrayList<Integer> testList = new ArrayList<>();
    Sum temp =new Sum(0);
    

@Test
    public void getSumTest(){
    testList.add(10);
    testList.add(15);
    testList.add(25);
    assertEquals(50, temp.getSum(testList));
    }

@Test
    public void getSumTestEmptyList(){
    assertEquals(0,temp.getSum(testList) );
}
@Test
    public void getSumTestOne(){
    testList.add(10);
    assertEquals(10, temp.getSum(testList));
}
@Test
    public void getSumTestNull(){
    assertNull(null, temp.getSum(testList));} //??
    }
