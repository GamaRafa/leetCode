package Java;

public class ValidPalindrome {
  private static boolean isPalindrome(String texto) {
    StringBuilder inverso = new StringBuilder();
    String cleanString = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    inverso.append(cleanString);
    
    return cleanString.equals(inverso.reverse().toString());
  }

  private static boolean isPalindromeWithTwoPointer(String text) {
    String cleanString = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left = 0;
    int right = cleanString.length() - 1;

    while (left < right) {
      if (cleanString.charAt(left) != cleanString.charAt(right)) return false;
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(isPalindromeWithTwoPointer("A man, a plan, a canal: Panama"));
  }
}
