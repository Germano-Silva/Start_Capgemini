Algoritmo "Vetores metodo bolha Aula 1-E"
// Disciplina: L�gica de Programa��o e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   numeros: vetor[1..10] de inteiro
   i, j, k: inteiro
Inicio
   Para i de 1 Ate 10 Fa�a
      Escreval("N�meros: ", i)
      Leia(numeros[i])
   Fimpara


   Para i de 1 Ate 10 Fa�a
      Para j De 1 Ate 10 faca
         Se numeros[j] > numeros[i] Entao
            k <- numeros[i]
            numeros[i] <- numeros[j]
            numeros[j] <- k

         Fimse
      Fimpara
   Fimpara
   limpatela
   Escreval("-----------------------------------")
   Escreval("---------Vetor organizado----------")
   Escreval("-----------------------------------")
   Para i de 1 Ate 10 Fa�a
      Escreval(numeros[i])
   Fimpara


Fimalgoritmo