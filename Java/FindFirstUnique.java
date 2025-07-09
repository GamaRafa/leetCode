package Java;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUnique {
  private static char findFirstUnique(String word) {
    Map<Character, Integer> chars = new HashMap<>();
    char[] letters = word.toCharArray();

    for (char letter : letters) {
      if (!chars.containsKey(letter)) {
        chars.put(letter, 1);
      } else {
        chars.put(letter, chars.get(letter) + 1);
      }
    }
    
    for (char key : letters) {
      if (chars.get(key) == 1) return key;
    }
    return ' ';
  }

  public static void main(String[] args) {
    System.out.println(findFirstUnique("swiss"));
    System.out.println(findFirstUnique("teeter"));
    System.out.println(findFirstUnique("apple"));
  }
}

/*
 * Recebe uma palavra e retorna a primeira letra que não repete
 * 
 * Criar um hash map de char e int pra guardar a letra e suas ocorrências
 * criar um array com as letras da palavra
 * percorrer o array vendo se a letra já está no hash map, caso esteja, aumentando a ocorrência
 *  se não estiver, adiciona com ocorrência 1
 * 
 * percorre o array de novo, vendo se tem alguma key cujo valor seja 1, se tiver, retorna a key
 * se não, retorna ' '
 */