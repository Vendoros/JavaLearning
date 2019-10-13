package Kata.kyu6.smileFaces;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream()
                .filter(x -> x.matches("[:;][~-]?[)D]"))
                .count();
    }


    public static int countSmileys(List<String> arr, int count) {
        for (int i = 0; i < arr.size(); i++) {
            String mask = "^(?!0-9$)([:;]{1}[-~]{0,1}[)D]{1})$";
            if (arr.get(i).matches(mask)) {
                count++;
                System.out.println(arr.get(i) + " index " + i);
            }
        }
        System.err.println("number of smiles: "+count);
        return count;
    }


}
