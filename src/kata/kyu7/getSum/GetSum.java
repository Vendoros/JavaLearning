package kata.kyu7.getSum;


import java.util.ArrayList;
import static java.lang.Math.*;


public class GetSum {


    public static int getSum(int a, int b) {
        int sum = 0;
        int max = max(a, b);
        int min = min(a, b);
        ArrayList<Integer> arr = new ArrayList<>();
        while (min != max+1){
            arr.add(min);
            sum += min;
            min++;
        }
        return sum;
    }
}
