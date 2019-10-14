package kata.kyu8.removeDuplicateWords;

import java.util.Arrays;
import static java.util.stream.Collectors.joining;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String str) {
        return Arrays.stream(str.split("\\s+"))
                .distinct()
                .collect(joining(" "));
    }
}
