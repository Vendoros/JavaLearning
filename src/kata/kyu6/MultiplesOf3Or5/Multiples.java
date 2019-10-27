package kata.kyu6.MultiplesOf3Or5;

public class Multiples {

    public int multiples(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(number + " " + sum);
            }
        }
        return sum;
    }
}
