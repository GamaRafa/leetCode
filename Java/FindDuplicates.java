package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
  private static void findDuplicatesInArray(Object[] array) {
    Map<Object, Integer> map = new HashMap<>();
    List<Object> duplicates = new ArrayList<>();

    for (Object obj : array) {
      if (!map.containsKey(obj)) {
        map.put(obj, 1);
      } else {
        map.put(obj, map.get(obj) + 1);
      }
    }

    for (Object key : map.keySet()) {
      if (map.get(key) > 1) {
        duplicates.add(key);
      }
    }
    if (duplicates.isEmpty()) System.out.println("No duplicates!");
    else System.out.println("Duplicates: " + duplicates);
  } 

  public static void main(String[] args) {
    Integer[] nums = {1, 2, 3, 2, 4, 5, 1};
    Integer[] numsUnique = {10, 20, 30, 40, 50};
    Integer[] numsSame = {7,7,7,7,7};
    Integer[] numsEmpty = {};
    String[] words = {"apple", "banana", "apple", "orange", "banana", "kiwi"};

    findDuplicatesInArray(nums);
    findDuplicatesInArray(numsUnique);
    findDuplicatesInArray(numsSame);
    findDuplicatesInArray(numsEmpty);
    findDuplicatesInArray(words);

  }
}
