Algoritmo "Operadores L�gicos"
// Disciplina: [L�gica de Programa��o e Algoritmos I]
// Autor: Germano Rodrigues da Silva 
// Data atual  : 09/07/2024
// nao - Operador un�rio de nega��o. nao VERDADEIRO = FALSO, e nao FALSO = VERDADEIRO. Tem a maior preced�ncia entre os operadores l�gicos. Equivale ao NOT do Pascal.
// ou - Operador que resulta VERDADEIRO quando um dos seus operandos l�gicos for verdadeiro. Equivale ao OR do Pascal.
// e - Operador que resulta VERDADEIRO somente se seus dois operandos l�gicos forem verdadeiros. Equivale ao AND do Pascal.
// xou - Operador que resulta VERDADEIRO se seus dois operandos l�gicos forem diferentes, e FALSO se forem iguais. Equivale ao XOR do Pascal.

Var
i, j: inteiro


Inicio
//Tabela verdade.
i <- 10
j <- 20

Se (i = 10) E (j = 20) entao
   Escreval("Fa�a algo")
Sen�o
   Escreval("N�o fazer nada")
Fimse


Fimalgoritmo