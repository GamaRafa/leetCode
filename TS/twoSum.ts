function classicTwoSum(numbers: number[], target: number): number[] { // retorna lista com UM par de índices
  let seen = new Map<number, number>();

  for (let i = 0; i < numbers.length; i++) {
    let complement = target - numbers[i];
    if (seen.has(complement)) {
      return [seen.get(complement)!, i];
    } else {
      seen.set(numbers[i], i);
    }
  }

  return [];
}

console.log("Par de índices que somam 9:")
console.log(classicTwoSum([2, 7, 11, 15], 9));

/**
 * O clássico retorna um único par de índices. Usar hashmap pra guardar cada valor e seu índice
 * iterar a lista calculando o complemento de cada número
 * verifica se o complemento do número atual está no hashmap de números vistos
 * se estiver, retorna o par do índice do complemento e o índice atual
 * se não estiver, bota o número atual no hash map com seu índice
 */

/////////////////////////////////////////////////

function valueTwoSum(numbers: number[], target: number): number[] { // retorna lista com UM par de valores
  let seen = new Set<number>;

  for (let number of numbers) {
    let complement = target - number;
    if (seen.has(complement)) {
      return [complement, number];
    } else {
      seen.add(number);
    }
  }

  return [];
}

console.log("Par de valores que somam 9:")
console.log(valueTwoSum([2, 7, 11, 15], 9));

/**
 * Parecido com o clássico, mas retorna um par de valores, não índices
 * Usa Set ao invés de HashMap, já que não precisa guardar o índice
 */
/////////////////////////////////////////////////

function twoSumMultiple(numbers: number[], target: number): number[][] {  // retorna lista com todos os pares de índices
  let seen = new Map<number, number>();
  let pairs: number[][] = [];

  for (let i = 0; i < numbers.length; i++) {
    let complement = target - numbers[i];
    if (seen.has(complement)) {
      pairs.push([seen.get(complement)!, i]);
    } else {
      seen.set(numbers[i], i);
    }
  }

  return pairs;
}

/**
 * Pra retornar uma lista de pares, precisa criar um array bidimensional (matriz)
 *  Se fosse Java, seria uma List<List<Integer>>, mas isso não existe em TS, então é number[][]
 *  Ao invés de retornar dentro do loop, bota pra dentro da lista de pares e retorna fora do loop
 */

console.log("Todos os pares de índices que somam 6:")
console.log(twoSumMultiple([1, 2, 3, 4, 5], 6));

/////////////////////////////////////////////////

function twoSumMultipleValues(numbers: number[], target: number): number[][] { // retorna lista com todos os pares de valores
  let seen = new Set<number>();
  let pairs: number[][] = [];

  for (let number of numbers) {
    let complement = target - number;
    if (seen.has(complement)) {
      pairs.push([complement, number]);
    } else {
      seen.add(number);
    }
  }

  return pairs;
}

/**
 * Mesma coisa que o de cima, mas retorna os valores, então também não precisa de HashMap, mas sim Set
 */

console.log("Todos os pares de valores que somam 6:")
console.log(twoSumMultipleValues([1, 2, 3, 4, 5], 6));
