function wordFrequencyCounter(text: string): void {
  const array = text.split(" ");
  let map = new Map<string, number>();

  for (let word of array) {
    if (!map.has(word)) {
      map.set(word, 1);
    } else {
      map.set(word, map.get(word)! + 1);
    }
  }

  console.log(map.entries());
  
}

wordFrequencyCounter("banana aipim banana macaco banana maça");
wordFrequencyCounter("banana macaco banana aipim banana mamaco");