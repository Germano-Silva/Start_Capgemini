algoritmo "Trabalhando com Tipos e Operadores Aritméticos"
// Disciplina   : [Lógica de Programação e Algoritmos I]
// Descrição   : Trabalhando com tipos e operadores aritméticos.
// Autor(a)    : Germano Rodrigues da Silva
// Data atual  : 08/07/2024

var
n1, n2, soma, sub, multiplicacao: inteiro
divisao: real
sucesso: logico

inicio
Escreval("Digite o 1º número:")
Leia(n1)
Escreval("Digite o 2º número:")
Leia(n2)
soma <- n1 + n2
Escreval("A soma dos dois número ?: ")
Escreval(soma)
sub <- n1 - n2
Escreval("A subtração dos dois número ?: ")
Escreval(sub)
multiplicacao <- n1 * n2
Escreval("A multiplicação dos dois número ?: ")
Escreval(multiplicacao)
divisao <- n1 / n2
Escreval("A divisão dos dois número ?: ")
Escreval(divisao)
fimalgoritmo