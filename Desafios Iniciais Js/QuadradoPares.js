/**
 * Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.
 */

// A função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")

let lines = gets().split('\n');
var N = parseInt(lines.shift());

for (let i = 1; i <= N; i++) {

	if (i % 2 ===  0  ) 
          print(`${i}^2 = ${i * i }`);
}