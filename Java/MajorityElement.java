package Java;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  private static Object findMajorityElement(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    
    for (int num : nums) {
      if (!frequencyMap.containsKey(num)) {
        frequencyMap.put(num, 1);
      } else {
        frequencyMap.put(num, frequencyMap.get(num) + 1);
      }
    }

    for (int key : frequencyMap.keySet()) {
      if (frequencyMap.get(key) > (nums.length / 2)) return key;
    }
    return "none";
  }

  public static void main(String[] args) {
    int[] normal = {3, 3, 4, 3, 5, 3, 3};
    int[] noMaj = {1, 2, 3, 4, 5};
    int[] justFifty = {9, 9, 1, 2};
    int[] allSame = {7, 7, 7, 7, 7};
    int[] withNegative = {-1, -1, -1, 2, 3};

    System.out.println(findMajorityElement(normal));
    System.out.println(findMajorityElement(noMaj));
    System.out.println(findMajorityElement(justFifty));
    System.out.println(findMajorityElement(allSame));
    System.out.println(findMajorityElement(withNegative));
  }
}
