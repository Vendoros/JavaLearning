package Kata.kyu8.squareSum;

public class SquareSum {

    public static int squareSum(int[] n) {
        // TODO: 14.10.2019
        int sum = 0;
        for (int i : n) {
            sum += n[i] * n[i];
        }
        return sum;
    }
}
