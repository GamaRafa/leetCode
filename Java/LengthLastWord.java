package Java;

public class LengthLastWord {
  // solução de júnior
  private static int getLengthOfLastWord(String text) {
    int indexLastSpace = -1;
    String trimmedText = text.trim();

    for (int i = 0; i < trimmedText.length(); i++) {
      if (trimmedText.charAt(i) == ' ') indexLastSpace = i;
    }
    String lastWord = trimmedText.substring(indexLastSpace + 1, trimmedText.length());
    return lastWord.length();
  }

  // solução de sênior
  private static int getLengthUsingSplit(String text) {
    String[] words = text.trim().split(" ");
    return words[words.length - 1].length();
  }

  public static void main(String[] args) {
    System.out.println(getLengthOfLastWord("Hello World"));
    System.out.println(getLengthOfLastWord("   fly me   to   the moon  "));
    System.out.println(getLengthOfLastWord("luffy is still joyboy"));
    System.out.println(getLengthOfLastWord("Hello"));

    System.out.println(getLengthUsingSplit("Hello"));
    System.out.println(getLengthUsingSplit("Hello my baby"));
  }
}

/*
 * Calcular tamanho da última palavra de um texto (recebe uma string que é um texto com palavras e espaços)
 * percorrer todo o texto comparando cada caractere com " ", botando numa var a posição do " "
 *    ao final do loop, isso vai retornar a posição do último espaço
 * capturar a substring do último espaço + 1 até o final do texto (text.length() - 1)
 * retornar .length() dessa substring
 */
