import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private final Set<String> wordPresense = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(wordPresense, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String s) {
        if (wordPresense.contains(s))
            return true;
        else return false;
    }
}