package kata.kyu8.centuryFromYear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class Tests {
    @Test
    public static void FixedTests() {
        assertEquals(18, Century.century(1705));
        assertEquals(19, Century.century(1900));
        assertEquals(17, Century.century(1601));
        assertEquals(20, Century.century(2000));
        assertEquals(1, Century.century(89));
        assertEquals(0, Century.century(0));
    }
    @Test
    public static void RandomTests() {
        Random rand = new Random();
        for(int i = 0; i < 100;) {
            int a = rand.nextInt(++i * 100);
            int b = (int)(--a/100+1);
            assertEquals(b,  Century.century(++a));
        }
    }
}