function isAnagram(firstWord: string, secondWord: string): boolean {
  if (firstWord.length !== secondWord.length) return false;

  const firstArray = firstWord.toLowerCase().split("");
  const secondArray = secondWord.toLowerCase().split("");

  return firstArray.sort().join("") === secondArray.sort().join("");
}

console.log(isAnagram("anagram", "nagaram"));
console.log(isAnagram("cat", "rat"));

