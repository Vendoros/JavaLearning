package kata.kyu8.squareSum;

import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class SquareSumTests {
    @Test
    public void testBasic() {
        assertEquals(9, SquareSum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareSum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareSum.squareSum(new int[]{5, -3, 4}));
    }

    @Test
    public void testRandom() {
        Random rnd = new Random();
        final int dimension = 100;
        for (int t = 0; t < dimension; ++t) {
            int[] array = IntStream.generate(() -> rnd.nextInt(100) - 50).limit(rnd.nextInt(20) + 30).toArray();
            int sum = IntStream.of(array).map(i -> i * i).sum();
            assertEquals(sum, SquareSum.squareSum(array));
        }
    }

}