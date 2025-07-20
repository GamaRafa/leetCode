package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSumMultiple {
  private static List<List<Integer>> twoSumMultiple(List<Integer> numbers, int target) {
    List<List<Integer>> pairs = new ArrayList<>();
    Map<Integer, Integer> seen = new HashMap<>();

    for (int i = 0; i < numbers.size(); i++) {
      int complement = target - numbers.get(i);
      if (seen.containsKey(complement)) {
        pairs.add(List.of(seen.get(complement), i));
      } else {
        seen.put(numbers.get(i), i);
      }
    }

    return pairs;
  }

  private static List<List<Integer>> twoSumMultipleValues(List<Integer> numbers, int target) {
    List<List<Integer>> pairs = new ArrayList<>();
    Set<Integer> seen = new HashSet<>();

    for (int number : numbers) {
      int complement = target - number;
      if (seen.contains(complement)) {
        pairs.add(List.of(complement, number));
      } else {
        seen.add(number);
      }
    }

    return pairs;
  }

  public static void main(String[] args) {
    List<Integer> multiple = List.of(1, 2, 3, 4, 5);
    System.out.println(twoSumMultiple(multiple, 6));
    System.out.println(twoSumMultipleValues(multiple, 6));
  }
}

/*
 * Em casos em que é pra retornar todos os pares possíveis pra soma, é preciso criar uma lista de listas
 * List<List<Integer>> pairs = new ArrayList<>();
 * e cada iteração, ao invés de retornar uma lista com o par, adicionar a lista com o par à lista de pares
 * 
 * Quando retorna os valores, não os índices, não precisa de um hash map; mas sim de um set (meio hash map)
 * já que o map guarda o valor e o índice
 */