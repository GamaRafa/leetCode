function validateBrackets(brackets: string): boolean {
  let stack: string[] = [];

  for (let i = 0; i < brackets.length; i++) {
    if (brackets[i] === '(' || brackets[i] === '[' || brackets[i] === '{') {
      stack.push(brackets[i]);
    } else if (brackets[i] === ')' || brackets[i] === ']' || brackets[i] === '}') {

      let top = stack.pop();

      switch (brackets[i]) {
        case ')':
          if (top !== '(') return false;
          break;
        case ']':
          if (top !== '[') return false;
          break;
        case '}':
          if (top !== '{') return false;
          break;
        default:
          return false;
      }
    }
  }
  return stack.length === 0;
}

console.log(validateBrackets("()"));
console.log(validateBrackets("()[]{}"));
console.log(validateBrackets("(]"));


