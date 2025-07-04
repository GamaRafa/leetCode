function isPalindrome(text: string): boolean {
  const cleanText = text.trim().replace("[^a-zA-Z0-9]", "");
  let left = 0;
  let right = cleanText.length - 1;

  while (left < right) {
    if (cleanText[left] != cleanText[right]) return false;

    left++;
    right--;
  }
  return true;
}

console.log(isPalindrome("racecar"));
