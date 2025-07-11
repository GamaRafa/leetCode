function letterHistogram(text: string): void {
  let map = new Map<string, number>();

  for (let char of text) {
    if (!map.has(char)) {
      map.set(char, 1);
    } else {
      map.set(char, map.get(char)! + 1);
    }
  }

  for (let key of map.keys()) {
    console.log(`${key}: ${"=".repeat(map.get(key)!)}`);    
  }
}

function caseInsensitiveLetterHistogram(text: string): void {
  let map = new Map<string, number>();
  const cleanString = text.replace(/[^a-zA-Z]/g, "").toLowerCase();

  for (let char of cleanString) {
    if (!map.has(char)) map.set(char, 1);
    else map.set(char, map.get(char)! + 1);
  }

  for (let key of map.keys()) {
    console.log(key + ": " + "=".repeat(map.get(key)!));
    
  }
}

console.log(letterHistogram("O rato roeu a roupa do rei de Roma"));
console.log(caseInsensitiveLetterHistogram("O rato roeu a roupa do rei de Roma"));
