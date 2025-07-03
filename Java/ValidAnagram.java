package Java;

import java.util.Arrays;

public class ValidAnagram {
  private static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) return false;

    char[] arrayA = a.toCharArray();
    char[] arrayB = b.toCharArray();

    Arrays.sort(arrayA);
    Arrays.sort(arrayB);

    return Arrays.equals(arrayA, arrayB);
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "nagaram"));
    System.out.println(isAnagram("rat", "car"));
  }
}
