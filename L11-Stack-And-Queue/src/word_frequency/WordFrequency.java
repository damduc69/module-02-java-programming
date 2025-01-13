package word_frequency;

import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "I love you and i love you";
        countWordFrequency(input);
    }
    
    public static void countWordFrequency(String str) {
        String input = str;
        String[] words = input.toLowerCase().split(" ");

        TreeMap<String, Integer> wordMap = new TreeMap<>();
        
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        System.out.println("Tần suất xuất hiện của các từ: ");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
}
