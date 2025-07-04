function findNeedleInHaystack(haystack: string, needle: string): number {
  if (haystack.length < needle.length) return -1;

  const haystackLength = haystack.length;
  const needleLength = needle.length;

  for (let i = 0; i <= haystackLength - needleLength; i++) {
    if (haystack.substring(i, needleLength + i) === needle) return i;
  }
  return -1;
}

console.log(findNeedleInHaystack("leetcode", "code"));
console.log(findNeedleInHaystack("garrafa", "rafa"));


/*
 * guardar o comprimento das duas strings
 * a needle tem que caber na haystack
 * só pode percorrer a haystack até a última posição em que a needle ainda caiba
 *  ex: haystack 7 letras, needle 3 letras, só pode percorrer até a quarta letra (index 3)
 *  isso se resolve percorrendo enquanto i < tamanho da haystack - tamanho da needle
 * 
 * capturar substring formada pelo indice atual até o comprimento da needle + indice atual
 *  somar comprimento da needle com indice atual pra ajustar a posição em que estamos procurando a needle
 * se a substring for igual a needle, retornar o indice
 * se o loop não encontrar, retornar -1
 */