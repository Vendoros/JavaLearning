package kata.kyu6.MultiplesOf3Or5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesTests {
    @Test
    public void test(){
        assertEquals(23, new Multiples().multiples(10));
    }
}
