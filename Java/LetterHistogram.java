package Java;

import java.util.Map;
import java.util.TreeMap;

public class LetterHistogram {
  private static void generateHistogram(String s) {
    Map<Character, Integer> map = new TreeMap<>();
    char[] array = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();

    for (char letter : array) {
      if (!map.containsKey(letter)) {
        map.put(letter, 1);
      } else {
        map.put(letter, map.get(letter) + 1);
      }
    }

    for (char key : map.keySet()) {
      System.out.printf("%c: %s\n", key, "=".repeat(map.get(key)));
    }
  }

  public static void main(String[] args) {
    generateHistogram("O rato roeu a roupa do rei de Roma");
  }
}
