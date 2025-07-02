package Java;

import java.util.HashMap;
import java.util.Map;

// String 13. Roman to Integer
public class RomanToInteger {
  private static int convertRomanToInteger(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int total = 0;

    for (int i = 0; i < s.length(); i++) {
      int current = map.get(s.charAt(i));
      int next = (i + 1< s.length()) ?  map.get(s.charAt(i + 1)) : 0;

      if (current < next) {
        total -= current;
      } else {
        total += current;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(convertRomanToInteger("III"));
    System.out.println(convertRomanToInteger("IV"));
    System.out.println(convertRomanToInteger("LVIII"));
  }
}

/*
 * Bota cada par dentro de um hash map
 * percorre a string
 * current é o caractere na posição atual (i)
 * next é o próximo (dãaaa), a não ser que seja "depois do último", aí é 0
 * números romanos são escritos do MAIOR pro MENOR, da esquerda pra direita
 * se o atual for menor que o próximo, então tem que diminuir o valor do atual do total
 * se o atual for maior que o próximo, normal, só somar
 */