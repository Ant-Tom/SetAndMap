import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printWordCounts(strings);
    }

    public static void printWordCounts(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
