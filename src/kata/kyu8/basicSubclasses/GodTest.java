package kata.kyu8.basicSubclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodTest {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
    @Test
    public void makingEva(){
        Human[] paradise = God.create();
        assertEquals("Eva are a woman", true, paradise[1] instanceof Woman);
    }
    @Test
    public void adamAreHuman(){
        Human[] paradise = God.create();
        assertEquals("Adam are human race", true, paradise[0] instanceof Human);
    }
    @Test
    public void evaAreHuman(){
        Human[] paradise = God.create();
        assertEquals("Eva are human race", true, paradise[1] instanceof Human);
    }
    @Test
    public void listHaveRightLenght(){
        Human[] paradise = God.create();
        assertEquals("It`s only two persons on earth", 2, paradise.length);
    }
}
