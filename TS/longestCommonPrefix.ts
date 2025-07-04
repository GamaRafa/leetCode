function getLongestCommonPrefix(words: string[]): string {
  let prefix = words[0];

  for (let i = 1; i < words.length; i++) {
    let current = words[i];

    while (!current.startsWith(prefix)) {
      prefix = prefix.substring(0, prefix.length - 1);

      if (prefix === "") return "";
    }
  }
  return prefix;
}

console.log(getLongestCommonPrefix(["flower", "flow", "flight"]));



/**
 * Presume que o prefixo é a primeira palavra do array
 * Percorre o array COMEÇANDO COM A SEGUNDA POSIÇÃO, OU SEJA, [1]
 * current é a palavra atual (dããã)
 * enquanto o current não começar com o prefixo, é tirado fora a última letra do prefixo
 *  se acabar eliminando todas as letras do prefixo, retorna string vazia, pq não achou prefixo em comum
 * se achou o prefixo em comum, sai do while, itera de novo com a próxima palavra, se tiver
 * segue diminuindo, ou não, o prefixo enquanto precisar
 * retorna o prefixo
 */