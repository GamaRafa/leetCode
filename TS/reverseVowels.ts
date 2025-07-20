function reverseVowels(word: string): string {
  let letters = word.split("");
  const vowels = "aeiouAEIOU";
  let left = 0;
  let right = word.length - 1;

  while (left < right) {
    if (vowels.includes(letters[right]) && vowels.includes(letters[left])) {
      [letters[right], letters[left]] = [letters[left], letters[right]];
      left++;
      right--;
    } else {
      if (!vowels.includes(letters[left])) left++;
      if (!vowels.includes(letters[right])) right--;
    }
  }
  return letters.join("");
}

console.log(reverseVowels("amendoim"));
console.log(reverseVowels("IceCreAm"));
console.log(reverseVowels("leetcode"));

/**
 * Versão mais limpa tem um while com um if else dentro
 * Usa two pointer. Se ambos são vogal, troca usando atribuição de array
 * Se não forem, testa cada ponteiro, se não for, move o ponteiro
 */