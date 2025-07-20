package Java;
import java.util.Set;

public class ReverseVowels {
  private static String reverseVowels(String word) {
    char[] letters = word.toCharArray();
    int left = 0;
    int right = letters.length - 1;
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    while (left < right) {
      if (vowels.contains(letters[left]) && vowels.contains(letters[right])) {
        char temp = letters[left];
        letters[left] = letters[right];
        letters[right] = temp;

        left++;
        right--;
      } else {
        if (!vowels.contains(letters[left])) left++;
        if (!vowels.contains(letters[right])) right--;
      }
    }
    return new String(letters);
  }

  public static void main(String[] args) {
    System.out.println(reverseVowels("amendoim"));
    System.out.println(reverseVowels("IceCreAm"));
    System.out.println(reverseVowels("leetcode"));
  }
}
