package Kata.kyu8.squareSum;

public class SquareSum {

    public static int squareSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n * n;
        }
        return sum;
    }
}
