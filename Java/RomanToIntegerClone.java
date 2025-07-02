package Java;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerClone {
  private static int convert(String romanNumeral) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int total = 0;

    for (int i = 0; i < romanNumeral.length(); i++) {
      int current = map.get(romanNumeral.charAt(i));
      int next = (i + 1 < romanNumeral.length()) ? map.get(romanNumeral.charAt(i+1)) : 0;

      if (current < next) {
        total -= current;
      } else {
        total += current;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(convert("III"));
    System.out.println(convert("XM"));
  }
}
