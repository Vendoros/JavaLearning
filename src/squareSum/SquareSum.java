package squareSum;

public class SquareSum {

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i : n) {
            sum += n[i] * n[i];
        }
        return sum;
    }
}
