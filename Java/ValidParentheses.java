package Java;

import java.util.Stack;

// String 20. Valid Parentheses
public class ValidParentheses {
  private static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      }
      else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
        if (stack.isEmpty()) return false;

        char top = stack.pop();

        switch (s.charAt(i)) {
          case ')':
            if (top != '(') return false;
            break;
          case '}':
            if (top != '{') return false;
            break;
          case ']':
            if (top != '[') return false;
            break;
          default:
            return false;
        }
      }
    }
    return stack.isEmpty();
  }  

  public static void main(String[] args) {
        System.out.println(isValid("()"));          // true
        System.out.println(isValid("()[]{}"));      // true
        System.out.println(isValid("(]"));          // false
        System.out.println(isValid("([)]"));        // false
        System.out.println(isValid("{[]}"));        // true
  }
}

/*
 * cria uma pilha
 * percorre a string
 * se o caractere da vez é abertura, ou seja, (, { ou [, bota no topo da pilha
 * se o caractere da vez é fechamento, ou seja, ), } ou ] faz a validação:
 *  se a pilha estiver vazia, retorna false, pq não tem nenhum char de abertura, então tá errado
 *  guarda na variável top o valor do topo da pilha, pra comparar
 *   faz um switch com o char da vez:
 *    vê se o top é abertura do mesmo tipo do char da vez (que é fechamento), se NÃO FOR, retorna false
 *    pq se NÃO FOR? Pq se for, não é pra retornar true ainda, tem que validar o resto da string
 * sai do loop e retorna se a pilha tá vazia ou não (se todos foram popados na ordem, então tá vazia, tudo certo)
 * 
 * 
 * Exemplo: ()[]{}
 * 
 * primeiro char é (, bota pra pilha -> pilha = (
 * segundo char é ), então tira fora o topo da pilha e vê se são do mesmo tipo
 *  topo = (, da vez é ), não retorna false, pilha vazia
 * terceiro char é [, bota pra pilha -> pilha = [
 * quarto char é ], então tira fora o topo da pilha e vê se são do mesmo tipo
 *  topo = [, da vez é ], não retorna false, pilha vazia
 * quinto char é {, bota pra pilha -> pilha = {
 * sexto char é }, então tira fora o topo da pilha e vê se são do mesmo tipo
 *  topo = }, da vez é {, não retorna false, pilha vazia
 * sai do loop. pilha vazia? sim! retorna true
 * 
 * Exemplo (]
 * primeiro char é (, bota pra pilha -> pilha = (
 * segundo char é ], então tira fora o topo da pilha e vê se são do mesmo tipo
 *  da vez é ], topo é ( , ou seja, não é [, então retorna false, e acabou aqui
 * 
 * Exemplo {[]}
 * primeiro char é {, bota pra pilha -> pilha = {
 * segundo char é [, bota pra pilha -> pilha = {, [
 * terceiro char é ], então tira pra fora o topo da pilha e vê se são do mesmo tipo
 *  da vez é ], topo é [, não retorna false, pilha = {
 * quarto char é }, que é fechamento do topo da pilha, esvazia a pilha, retorna true, e seja feliz
 */