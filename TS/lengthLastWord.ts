function getLengthOfLastWord(text: string): number {
  const words = text.trim().split(" ");
  return words[words.length - 1].length;
}

console.log(getLengthOfLastWord("   fly me   to   the moon  "));
