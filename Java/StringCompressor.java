package Java;

import java.util.HashMap;
import java.util.Map;

public class StringCompressor {
  private static String compress(String s) {
    Map<Character, Integer> map = new HashMap<>();
    char[] array = s.toCharArray();
    StringBuilder compressed = new StringBuilder();

    for (char letter : array) {
      if (!map.containsKey(letter)) {
        map.put(letter, 1);
      } else {
        map.put(letter, map.get(letter) + 1);
      }
    }

    for (char key : map.keySet()) {
      compressed.append(key);
      compressed.append(map.get(key));
    }

    return compressed.toString();
  }

  private static String classicCompressor(String s) {
    if (s == null || s.isEmpty()) return s;

    StringBuilder compressed = new StringBuilder();
    int counter = 1;

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        counter++;
      } else {
        compressed.append(s.charAt(i - 1));
        compressed.append(counter);
        counter = 1;
      }
    }
    compressed.append(s.charAt(s.length() - 1));
    compressed.append(counter);

    return compressed.toString().length() > s.length() ? s : compressed.toString();
  }

  public static void main(String[] args) {
    System.out.println(compress("aaabbbcc"));
    System.out.println(classicCompressor("aabcccccaaa"));
  }
}
