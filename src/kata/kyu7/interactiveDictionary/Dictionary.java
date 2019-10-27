package kata.kyu7.interactiveDictionary;


import java.util.HashMap;
import java.util.Map;

class Dictionary {

    private Map<String, String> dictionary = new HashMap<>();// <key, value>

    Dictionary() {
    }

    void newEntry(String key, String value) {
        dictionary.put(key, value);
    }

    String look(String key) {
        return dictionary.getOrDefault(key, "Cant find entry for " + key);
    }
}
