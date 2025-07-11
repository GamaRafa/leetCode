function camelCaseToSnakeCase(text: string): string {
  let snake = "";

  for (let i = 0; i < text.length; i++) {
    if (text[i] == text[i].toUpperCase()) {
      if (i == 0) {
        snake += text[i].toLocaleLowerCase();
      } else {
        snake += `_${text[i].toLocaleLowerCase()}`;
      }
    } else {
      snake += text[i];
    }
  }

  return snake;
}

console.log(camelCaseToSnakeCase("CamelCaseString"));
console.log(camelCaseToSnakeCase("camelCaseString"));
