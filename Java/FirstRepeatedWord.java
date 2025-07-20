package Java;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedWord {
  private static String findFirstRepeatedWord(String sentence) {
    List<String> words = List.of(sentence.toLowerCase().split(" "));
    Map<String, Integer> map = new LinkedHashMap<>();

    for (String word : words) {
      if (!map.containsKey(word)) {
        map.put(word, 1);
      } else {
        map.put(word, map.get(word) + 1);
      }
    }

    for (String key : map.keySet()) {
      if (map.get(key) > 1) return key;
    }
    return "";
  }

  private static String improvedFindFirstRepeatedWord(String sentence) {
    List<String> words = List.of(sentence.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+"));
    Set<String> seen = new HashSet<>();

    for (String word : words) {
      if (seen.contains(word)) {
        return word;
      } else {
        seen.add(word);
      }
    }

    return "";
  }

  public static void main(String[] args) {
    System.out.println(findFirstRepeatedWord("banana macaco aipim mamaco aipim mamaco"));
    System.out.println(improvedFindFirstRepeatedWord("Banana macaco aipim, mamaco aipim mamaco!"));

  }
}