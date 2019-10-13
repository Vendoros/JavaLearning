package centuryFromYear;


public class Century {
    public static int century(int number) {

        int cent = 0;

        System.out.print("year: " + number);
        if(number % 100 == 0){
            cent= number/100;
            System.out.println(" century: " + cent);
            return cent;
        }
        cent= number/100;
        cent++;
        System.out.println(" century: " + cent);
        return cent;
    }
}
