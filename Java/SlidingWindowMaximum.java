package Java;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
  private static List<Integer> findMaximumInWindow(int[] numbers, int k) {
    int start = 0;
    int end = k - 1;
    List<Integer> result = new ArrayList<>();

    while (end < numbers.length) {
      int max = numbers[start];
      for (int i = start + 1; i <= end; i++) {
        if (numbers[i] > max) max = numbers[i];
      }
      result.add(max);
      start++;
      end++;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] num1 = {100, 200, 300, 400}; 
    System.out.println(findMaximumInWindow(num1, 2));
    int[] num2 = {1, 4, 2, 19, 23, 3, 1, 9, 20};
    System.out.println(findMaximumInWindow(num2, 4));
  }
}
