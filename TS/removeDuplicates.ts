function removeDuplicates(array: any[]): any[] {
  let uniqueArray = [];
  let map = new Map<any, boolean>();

  for (let item of array) {
    if (!map.has(item)) {
      map.set(item, true);
      uniqueArray.push(item);
    }
  }

  return uniqueArray;
}

console.log(removeDuplicates([1, 2, 2, 3, 1]));
console.log(removeDuplicates(["banana", "macaco", "banana", "mamaco", "aipim", "maça"]));
