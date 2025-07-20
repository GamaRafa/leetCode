package Java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
  private static List<Integer> naiveTwoSum(List<Integer> numbers, int target) {
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        if (numbers.get(i) + numbers.get(j) == target) {
          // return List.of(numbers.get(i), numbers.get(j));  pra retornar valores, não índices
          return List.of(i, j);
        }
      }
    }

    return List.of();
  }

  private static List<Integer> hashTwoSum(List<Integer> numbers, int target) {
    Map<Integer, Integer> seen = new HashMap<>();

    for (int i = 0; i < numbers.size(); i++) {
      int complement = target - numbers.get(i);
      if (seen.containsKey(complement)) {
        return List.of(seen.get(complement), i);
      } else {
        seen.put(numbers.get(i), i);
      }
    }

    return List.of();
  } 

  public static void main(String[] args) {
    List<Integer> numbers = List.of(2, 7, 11, 15);
    List<Integer> multiple = List.of(1, 2, 3, 4, 5);
    System.out.println(naiveTwoSum(numbers, 9));
    System.out.println(hashTwoSum(numbers, 9));
    System.out.println(hashTwoSum(multiple, 6));
  }
}

/*
 * usar hash map pra ver se o complemento (target - número atual) já foi visto (se já está no hash map)
 * esta solução presume que só um par é possível
 */