package kata.kyu7.findScreenSize;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class FindScreenSizeTests {
    @Test
    public void basicTests() {
        assertEquals("ratio = 4:3, width = 1600", "1600x1200", FindScreenSize.findScreenHeight(1600,"4:3"));
        assertEquals("ratio = 5:4, width = 1280", "1280x1024", FindScreenSize.findScreenHeight(1280,"5:4"));
        assertEquals("ratio = 3:2, width = 2160", "2160x1440", FindScreenSize.findScreenHeight(2160,"3:2"));
        assertEquals("ratio = 16:9, width = 1920", "1920x1080", FindScreenSize.findScreenHeight(1920,"16:9"));
        assertEquals("ratio = 32:9, width = 5120", "5120x1440", FindScreenSize.findScreenHeight(5120,"32:9"));
    }

    @Test
    public void randomTests() {
        int nTests = 20;
        int widestW = 3000;
        testDimension("4:3", widestW, nTests);
        testDimension("5:4", widestW, nTests);
        testDimension("3:2", widestW, nTests);
        testDimension("16:9", widestW, nTests);
        testDimension("32:9", widestW, nTests);
    }

    private static void testDimension(String ratio, int widestW, int nTests) {
        Random random = new Random();
        int testNumber = 0;
        while (testNumber < nTests) {
            int w = random.nextInt(widestW);
            while (!isHeightAnInt(w, ratio)) {
                w = random.nextInt(widestW);
            }
            assertEquals("ratio = " + ratio + ", width = " + w, validate(w, ratio), FindScreenSize.findScreenHeight(w, ratio));
            testNumber++;
        }
    }

    private static boolean isHeightAnInt(int width, String ratio) {
        String[] r = ratio.split(":");
        int ans = width * Integer.valueOf(r[1]) / Integer.valueOf(r[0]);
        return (ans % 1 == 0);
    }

    private static String validate(int width, String ratio) {
        String[] r = ratio.split(":");
        int height = width * Integer.valueOf(r[1]) / Integer.valueOf(r[0]);
        return width + "x" + height;
    }
}
