function findFirstUnique(word: string): string {
  const letters = word.split("");
  const map = new Map<string, number>;

  for (let letter of letters) {
    if (!map.has(letter)) map.set(letter, 1);
    else map.set(letter, map.get(letter)! + 1);
  }

  for (let key of letters) {
    if (map.get(key) === 1) return key;
  }
  return "";
}

console.log(findFirstUnique("swiss"));
console.log(findFirstUnique("teeter"));
console.log(findFirstUnique("apple"));
