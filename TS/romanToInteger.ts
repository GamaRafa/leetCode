function romanToInt(romanNumber: string) {
  const map = new Map<string, number>();
  map.set("I", 1);
  map.set("V", 5);
  map.set("X", 10);
  map.set("L", 50);
  map.set("C", 100);
  map.set("D", 500);
  map.set("M", 1000);

  let total = 0;

  for (let i = 0; i < romanNumber.length; i++) {
    let current = map.get(romanNumber[i])!;
    let next = (i + 1 < romanNumber.length) ? map.get(romanNumber[i+1])! : 0;

    if (current < next) {
      total -= current;
    } else {
      total += current;
    }
  }
  return total;
}

console.log(romanToInt("III"));
console.log(romanToInt("IV"));
console.log(romanToInt("LVIII"));

/*
 * Bota cada par dentro de um hash map
 * percorre a string
 * current é o caractere na posição atual (i)
 * next é o próximo (dãaaa), a não ser que seja "depois do último", aí é 0
 * números romanos são escritos do MAIOR pro MENOR, da esquerda pra direita
 * se o atual for menor que o próximo, então tem que diminuir o valor do atual do total
 * se o atual for maior que o próximo, normal, só somar
 */