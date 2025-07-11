function stringCompressor(s: string): string {
  let compressed = "";
  let counter = 1;

  for (let i = 1; i < s.length; i++) {
    if (s[i] === s[i-1]) {
      counter++;
    } else {
      compressed += s[i-1] + counter;
      counter=1;
    }
  }
  compressed += s[s.length - 1] + counter;
  return compressed.length > s.length ? s : compressed;
}

console.log(stringCompressor("aaabbbcc"));
console.log(stringCompressor("aabcccccaaa"));
