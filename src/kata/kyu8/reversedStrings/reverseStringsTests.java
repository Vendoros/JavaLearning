package kata.kyu8.reversedStrings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class reverseStringsTests {

    @Test
    public void sampleTest(){
        assertEquals("dlrow", reversedStrings.Reverse("world"));
        assertEquals("987654321", reversedStrings.Reverse("123456789"));
    }

    @Test
    public void NullTest(){
        assertEquals("", reversedStrings.Reverse(""));
        assertNull(reversedStrings.Reverse(null));
    }
}
