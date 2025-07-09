package Java;

public class CamelToSnake {
  private static String camelToSnake(String word) {
    char[] array = word.toCharArray();
    StringBuilder snake_case = new StringBuilder();

    for (int i = 0; i < array.length; i++) {
      // if (!Character.isUpperCase(array[i])) {
      //   snake_case.append(array[i]);
      // } else if (i == 0) {
      //   snake_case.append(Character.toLowerCase(array[i]));
      // } else {
      //   snake_case.append("_" + Character.toLowerCase(array[i]));
      // }

      // refatoração abaixo
      if (Character.isUpperCase(array[i])) {
        if (i == 0) {
          snake_case.append(Character.toLowerCase(array[i]));
        } else {
          snake_case.append('_');
          snake_case.append(Character.toLowerCase(array[i]));
        }
      } else {
        snake_case.append(array[i]);
      }
    }
    return snake_case.toString();
  }

  public static void main(String[] args) {
    System.out.println(camelToSnake("camelCaseString"));
    System.out.println(camelToSnake("CamelCaseString"));
  }
}

/*
 * joga a palavra pra um array de char
 * cria um StringBuilder pra montar a nova string em snake_case
 * percorre o array
 * se o char[i] for uppercase
 *  se for o primeiro da string, só adiciona o minúsculo no StringBuilder
 *  se não for o primeiro, adiciona _, depois adiciona o minúsculo
 * se o char[i] não é uppercase
 *  adiciona o próprio char[i] ao StringBuilder
 *
 */