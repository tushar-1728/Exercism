import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

    private String word;
    private Map<Character, Integer> charCount;

    Anagram(String word) {
        this.word = word.toLowerCase();
        charCount = new HashMap<>();
        for (char key: word.toLowerCase().toCharArray()) {
            charCount.put(key, charCount.getOrDefault(key, 0) + 1);
        }
    }

    List<String> match(List<String> wordList) {
        ArrayList<String> anagramList = new ArrayList<>();
        HashMap<Character, Integer> cHashMap = new HashMap<>();
        for (String word: wordList) {
            for (char ch: word.toLowerCase().toCharArray()) {
                cHashMap.put(ch, cHashMap.getOrDefault(ch, 0) + 1);
            }
            if (charCount.equals(cHashMap) && !(this.word.contentEquals(word.toLowerCase()))) {
                anagramList.add(word);
            }
            cHashMap.clear();
        }
        return anagramList;
    }
}
