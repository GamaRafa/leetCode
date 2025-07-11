package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllPairsSum {
  private static List<List<Integer>> findAllPairSum(int[] nums, int target) {
    List<List<Integer>> pairs = new ArrayList<>();
    Set<Integer> seen = new HashSet<>();
    Set<String> pairsUsed = new HashSet<>();

    for (int num : nums) {
      int complement = target - num;

      if (seen.contains(complement)) {
        int first = Math.min(num, complement);
        int second = Math.max(num, complement);
        String pair = first + "," + second;

        if (!pairsUsed.contains(pair)) {
          pairs.add(Arrays.asList(first, second));
          pairsUsed.add(pair);
        }
      }

      seen.add(num);
    }

    return pairs;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    int target = 6;
    System.out.println(findAllPairSum(nums, target));
  }
}
