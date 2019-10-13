package smileFaces;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SmileFacesTests {
    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test3() {
        List<String> a = new ArrayList<String>();
        a.add(";)"); a.add(";D"); a.add("8p"); a.add("~'x"); a.add(":)D");
        a.add(";p~D"); a.add("'-X"); a.add("5~D"); a.add("px"); a.add("oD");
        a.add(";p"); a.add(":)"); a.add("'~DX"); a.add("~:-2D"); a.add("x;-D");
        a.add("522D"); a.add(":X"); a.add("')"); a.add("'X"); a.add(";D");
        a.add(";dxD"); a.add(":~)");
        assertEquals(5, SmileFaces.countSmileys(a,0));
    }


    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }
}
