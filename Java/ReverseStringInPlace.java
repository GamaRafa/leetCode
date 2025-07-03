package Java;

import java.util.Arrays;

public class ReverseStringInPlace {
  private static void reverseString(char[] stringArray) {
    int left = 0;
    int right = stringArray.length - 1;
    char temp = ' ';

    while (left < right) {
      temp = stringArray[left];
      stringArray[left] = stringArray[right];
      stringArray[right] = temp;

      left++;
      right--;
    }
    System.out.println(Arrays.toString(stringArray));
  }

  public static void main(String[] args) {
    reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
  }
}
