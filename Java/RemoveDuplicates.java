package Java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {
  private static List<Object> removeDuplicates(Object[] array) {
    List<Object> uniqueArray = new ArrayList<>();
    Map<Object, Boolean> map = new LinkedHashMap<>();

    for (Object obj : array) {
      if (!map.containsKey(obj)) {
        map.put(obj, true);
        uniqueArray.add(obj);
      }
    }

    return uniqueArray;
  }

  public static void main(String[] args) {
    Integer[] nums = {1, 2, 2, 3, 1};
    String[] words = {"banana", "macaco", "banana", "mamaco", "aipim", "maça"};
    System.out.println(removeDuplicates(nums));
    System.out.println(removeDuplicates(words));
  }
}
