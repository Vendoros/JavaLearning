package kata.kyu7.interactiveDictionary;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class DictionaryTests {
    @Test
    public void fixedTests() {
        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Cant find entry for Hi", d.look("Hi"));
        assertEquals("Cant find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));
    }

    final private static Random rnd = new Random();
    final private static String ALPHA = "aezrtyiuopmlkjhgfdsqwxccvbn";

    private static int rand(int n) {
        return rnd.nextInt(n);
    }

    private String randName(int l) {
        return IntStream.range(0, l / 2 + rand(l / 2))
                .mapToObj(i -> "" + ALPHA.charAt(rand(ALPHA.length())))
                .collect(Collectors.joining());
    }


    @Test
    public void randomTests() {

        for (int i = 0; i < 100; i++) {
            Dictionary d = new Dictionary();

            Set<String> used = new HashSet<>();
            List<List<String>> added = new ArrayList<>(),
                    notAdded = new ArrayList<>(),
                    cnd;

            for (int x = 0; x < 20; x++) {
                while (true) {
                    String word = randName(10),
                            descript = randName(20);

                    if (used.contains(word)) continue;
                    used.add(word);

                    if ((rand(2) == 1 || added.isEmpty()) && !notAdded.isEmpty()) {      // enforce at least one element in each
                        d.newEntry(word, descript);
                        added.add(Arrays.asList(word, descript));
                    } else {
                        notAdded.add(Arrays.asList(word, ""));
                    }
                    break;
                }
            }

            for (int x = 0; x < 50; x++) {
                cnd = rand(2) == 1 ? added : notAdded;
                int idx = rand(cnd.size());
                String w = cnd.get(idx).get(0),
                        desc = cnd.get(idx).get(1);
                assertEquals(desc.isEmpty() ? "Cant find entry for " + w : desc, d.look(w));
            }
        }
    }
}
