function invertString(word: string): string {
  let left = 0;
  let right = word.length - 1;
  let letters = word.split("");

  while (left < right) {
    let temp = letters[left];
    letters[left] = letters[right];
    letters[right] = temp;

    left++;
    right--;
  }
  return letters.join("");
}

console.log(invertString("leafaR"));
