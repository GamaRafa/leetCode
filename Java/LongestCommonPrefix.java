package Java;

// String 14. Longest Common Prefix
public class LongestCommonPrefix {
  public static String findLongestCommonPrefix(String[] words) {
    String prefix = words[0];

    for (int i = 1; i < words.length; i++) {
      String current = words[i];
      while (!current.startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }

  public static void main(String[] args) {
    String[] words1 = {"flower", "flow", "flight"};
    String[] words2 = {"cow", "dog", "cat"};

    System.out.println(findLongestCommonPrefix(words1));
    System.out.println(findLongestCommonPrefix(words2));
  }
}

/*
 * Presume que o prefixo é a primeira palavra do array
 * Percorre o array COMEÇANDO COM A SEGUNDA POSIÇÃO, OU SEJA, [1]
 * current é a palavra atual (dããã)
 * enquanto o current não começar com o prefixo, é tirado fora a última letra do prefixo
 *  se acabar eliminando todas as letras do prefixo, retorna string vazia, pq não achou prefixo em comum
 * se achou o prefixo em comum, sai do while, itera de novo com a próxima palavra, se tiver
 * segue diminuindo, ou não, o prefixo enquanto precisar
 * retorna o prefixo
 * 
 * Exemplo: tendo 3 palavras, flower, flow e flight, vai presumir que flower é o prefixo
 * vai testar se flow começa com flower... não começa, então come a última letra de flower
 * vai testar se flow começa com flowe... não começa, então come a última letra de flowe
 * vai testar se flow começa com flow... começa! prefixo por enquanto é flow, vamos pra próxima palavra
 * vai testar se flight começa com flow... não, então come a última letra de flow
 * vai testar se flight começa com flo... não, então come a última letra de flo
 * vai testar se flight começa com fl... começa! prefixo é fl
 * acabaram as palavras
 * retorna fl 
 */