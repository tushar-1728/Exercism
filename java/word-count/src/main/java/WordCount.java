import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        StringBuilder word = new StringBuilder();
        Character type = 'n';
        String processedPhrase = input.lines()
                .map(String::toLowerCase)
                .collect(Collectors.joining());

        for (int i = 0; i < processedPhrase.length(); i++) {
            char charUnderConsideration = processedPhrase.charAt(i);
            System.out.println(charUnderConsideration);
            if (type == 'n') {
                if (Character.isAlphabetic(charUnderConsideration)) {
                    type = 'a';
                } else if (Character.isDigit(charUnderConsideration)) {
                    type = 'd';
                } else {
                    type = 'n';
                }
            }

            if (charUnderConsideration == '\'' && type == 'a') {
                if (i + 1 < processedPhrase.length() && Character.isAlphabetic(processedPhrase.charAt(i + 1))) {
                    word.append(charUnderConsideration);
                    type = 'a';
                } else {
                    type = 'n';
                }
            } else if (Character.isAlphabetic(charUnderConsideration) && type == 'a') {
                word.append(charUnderConsideration);
                type = 'a';
            } else if (Character.isDigit(charUnderConsideration) && type == 'd') {
                word.append(charUnderConsideration);
                type = 'd';
            } else {
                if (word.length() > 0) {
                    wordCount.put(word.toString(), wordCount.getOrDefault(word.toString(), 0) + 1);
                    word.delete(0, word.length());
                }
                type = 'n';
            }
        }

        if (word.length() > 0) {
            wordCount.put(word.toString(), wordCount.getOrDefault(word.toString(), 0) + 1);
        }

        return wordCount;
    }
}
