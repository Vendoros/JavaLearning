package Kata.kyu8.removeDuplicateWords;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTests {
    private Random random = new Random();
    String lets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String ans(String s) {
        String[] words = s.split(" ");
        List<String> dedup = new ArrayList<>();
        for (String word : words) {
            if (!dedup.contains(word)) {
                dedup.add(word);
            }
        }
        return String.join(" ", dedup);
    }

    private int random(int l, int u) {
        return random.nextInt(u - l) + l;
    }

    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }

    @Test
    public void randomTests() {
        List<String> randWords;
        int j;
        int k;
        int c;
        int cnt;
        String randWord;
        String res;
        randWords = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            for (j = 0; j < 10; j++) {
                c = random(8, 12);
                cnt = 0;
                randWord = "";
                while (cnt < c) {
                    randWord += lets.charAt(random(0, lets.length()));
                    cnt++;
                }
                randWords.add(randWord);
            }

            for (k = 0; k < random(1, randWords.size()); k++) {
                randWords.add(random(2, randWords.size()), randWords.get(random(0, randWords.size())));
            }
            res = String.join(" ", randWords);
            assertEquals(ans(res), RemoveDuplicateWords.removeDuplicateWords(res));
        }
    }
}
