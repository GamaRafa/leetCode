function findDuplicates(array: any[]): any[] | string {
  let map = new Map<any, number>();
  let duplicates = [];

  for (let item of array) {
    if (!map.has(item)) {
      map.set(item, 1);
    } else {
      map.set(item, map.get(item)! + 1);
    }
  }

  for (let key of map.keys()) {
    if (map.get(key)! > 1) {
      duplicates.push(key);
    }
  }
  if (duplicates.length > 0) return duplicates;
  else return "No duplicates"
}

console.log(findDuplicates([1, 2, 3, 2, 4, 5, 1]));
console.log(findDuplicates([10, 20, 30, 40, 50]));
console.log(findDuplicates([7,7,7,7,7]));
console.log(findDuplicates([]));
console.log(findDuplicates(["apple", "banana", "apple", "orange", "banana", "kiwi"]));