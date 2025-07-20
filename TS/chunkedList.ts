function splitIntoChunks(nums: number[], size: number): number[][] {
  let chunkedList: number[][] = [];
  let chunk: number[] = [];

  for (let num of nums) {
    chunk.push(num);
    if (chunk.length === size) {
      chunkedList.push(chunk);
      chunk = [];
    }
  }

  if (chunk.length !== 0) {
    chunkedList.push(chunk);
  }

  return chunkedList;
}

console.log(splitIntoChunks([1, 2, 3, 4, 5, 6, 7], 2));
