package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {
  private static List<List<String>> groupAnagrams(String[] words) {
    Map<String, List<String>> groupedAnagrams = new HashMap<>();

    for (String word : words) {
      char [] wordArray = word.toCharArray();
      Arrays.sort(wordArray);
      String sortedWord = new String(wordArray);

      if (groupedAnagrams.containsKey(sortedWord)) {
        groupedAnagrams.get(sortedWord).add(word);
      } else {
        List<String> newGroup = new ArrayList<>();
        newGroup.add(word);
        groupedAnagrams.put(sortedWord, newGroup);
      }
    }
    return new ArrayList<>(groupedAnagrams.values());
  }

  public static void main(String[] args) {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(groupAnagrams(words));
  }
}

/*
 * Recebe um array de palavras
 * Deve retornar os anagramas agrupados
 * 
 * Criar um hash map, onde cada chave é uma palavra ordenada e cada valor é uma lista de anagramas
 * Algumas dessas listas podem estar vazias (exceto pela própria palavra que é a chave)
 * 
 * iterar sobre o array
 * transformar cada palavra em array, ordenar e transformar em string de novo
 * se a palavra ordenada já é chave do hash map, adicionar a palavra na forma original à lista daquela chave
 * se não, criar uma nova lista, adicionar a palavra na forma original à lista, e adicionar ao hash map com a ordenada com chave
 * retorna uma nova lista com os valores do hash map
 */