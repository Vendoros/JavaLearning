package getSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetSumTests {
    GetSum s = new GetSum();

    @Test
    public void TestPositive()
    {
        assertEquals(14, GetSum.getSum(5, -1));
        assertEquals(127759, GetSum.getSum(505, 4));
        assertEquals(44178, GetSum.getSum(321, 123));
    }

    @Test
    public void TestNegative()
    {
        assertEquals(-1275, GetSum.getSum(-50, 0));
        assertEquals(-15, GetSum.getSum(-1, -5));
        assertEquals(-5, GetSum.getSum(-5, -5));
        assertEquals(-127755, GetSum.getSum(-505, 4));
        assertEquals(-44055, GetSum.getSum(-321, 123));
    }

    @Test
    public void TestZero()
    {
        assertEquals(0, s.getSum(0, 0));
    }

    @Test
    public void TestSwitchMinMax()
    {
        assertEquals(-15, GetSum.getSum(-5, -1));
        assertEquals(15, GetSum.getSum(5, 1));
    }

    @Test
    public void TestEqual()
    {
        assertEquals(-17, GetSum.getSum(-17, -17));
        assertEquals(17, GetSum.getSum(17, 17));
    }
}
