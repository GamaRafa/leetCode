package Java;

import java.util.ArrayList;
import java.util.List;

public class ChunkedArraySplit {
  static private List<List<Integer>> splitIntoChunks(List<Integer> nums, int size) {
    List<List<Integer>> chunkedList = new ArrayList<>();
    List<Integer> chunk = new ArrayList<>();

    for (int num : nums) {
      chunk.add(num);   // a lista começa vazia, então já vai botando
      if (chunk.size() == size) {  // se o tamanho do chunk for igual o especificado
        chunkedList.add(new ArrayList<>(chunk));  // bota o chunk na lista de chunks
        chunk.clear();  // esvazia o chunk
      }
    }

    if (!chunk.isEmpty()) {
      chunkedList.add(chunk); // resgata o último chunk, se for menor que o size
    }

    return chunkedList;
  }

  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);
    System.out.println(splitIntoChunks(nums, 2));
  }
}
