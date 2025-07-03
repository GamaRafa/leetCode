package Java;

public class InvertString {
  private static String invertWithStringBuilder(String text) {
    StringBuilder inversed = new StringBuilder();
    inversed.append(text);
    return inversed.reverse().toString();
  }

  private static String invertWithTwoPointer(String text) {
    int left = 0;
    int right = text.length() - 1;
    char[] chars = text.toCharArray();
    char temp = ' ';

    while (left < right) {
      temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;
      left++;
      right--; 
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    System.out.println(invertWithStringBuilder("leafaR"));
    System.out.println(invertWithTwoPointer("leafaR"));
  }
}
