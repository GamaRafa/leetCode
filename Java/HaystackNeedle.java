package Java;

public class HaystackNeedle {
  private static int findNeedleInHaystack(String haystack, String needle) {
    int haystackLength = haystack.length(); // 7
    int needleLength = needle.length(); // 4

    for (int i = 0; i <= haystackLength - needleLength; i++) {
      if (haystack.substring(i, needleLength + i).equals(needle)) return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(findNeedleInHaystack("garrafa", "rafa"));
  }
}

/*
 * Recebe haystack e needle, duas strings, e tem que achar a posição em que needle está no haystack
 * guarda o comprimento das duas strings em duas vargs ...Length
 * loop percorre o comprimento da haystack enquanto a needle couber
 *    ou seja, se haystack tem 7 letras, e needle tem 4, vai percorrer 3 posições
 * compara a substring de haystack formada da posição atual até o comprimento de needle + i
 *    o mais i é pq essa posição final deve mudar a cada iteração
 *    tem que ser o tamanho da needle contando a partir da posição i
 */
