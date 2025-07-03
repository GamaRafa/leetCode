package Java;

public class ReverseVowels {
  private static String reverseVowels(String word) {
    char[] letters = word.toCharArray();
    int left = 0;
    int right = letters.length - 1;

    while (left < right) {
      while (left < right && !isVowel(letters[left])) {
        left++;
      }
      while(left < right && !isVowel(letters[right])) {
        right--;
      }

      char temp = letters[left];
      letters[left] = letters[right];
      letters[right] = temp;     

      left++;
      right--;
    }
    return new String(letters);
  }

  private static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }

  public static void main(String[] args) {
    System.out.println(reverseVowels("amendoim"));
    System.out.println(reverseVowels("IceCreAm"));
    System.out.println(reverseVowels("leetcode"));
  }
}
