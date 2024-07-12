Algoritmo "Vetores Aula 1-D"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   numeros : vetor[1..10] de inteiro
   numerosReversos : vetor[1..10] de inteiro
   i, j: inteiro
Inicio
   Para i de 1 Ate 10 Faça
      numeros[i] <- i
      Escreval(numeros[i])

   Fimpara
   j <- 11
   Para i de 1 Ate 10 Faça
        numerosReversos[j-i] <- numeros[i]
   Fimpara
   Para i de 1 Ate 10 faça
        Escreval(numerosReversos[i])
   Fimpara

Fimalgoritmo