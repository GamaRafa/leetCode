package Java;

public class TextCleaner {
  private static String cleanText(String text) {
    return text.replaceAll("[^a-zA-Z0-9\\s]", "").trim().toLowerCase();
  }

  public static void main(String[] args) {
    System.out.println(cleanText("O Rato roeu a roupa do Rei. Do Rei de Roma@!"));
  }
}