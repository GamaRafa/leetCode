package Java;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
  private static void countWordFrequency(String text) {
    Map<String, Integer> wordFrequency = new HashMap<>();
    String[] textArray = text.split(" ");

    for (String word : textArray) {
      if (!wordFrequency.containsKey(word)) {
        wordFrequency.put(word, 1);
      } else {
        wordFrequency.put(word, wordFrequency.get(word) + 1);
      }
    }

    System.out.println(wordFrequency.values());
  }

  public static void main(String[] args) {
    countWordFrequency("banana aipim banana macaco banana maça");
    countWordFrequency("banana macaco banana aipim banana macaco");
  }
}
