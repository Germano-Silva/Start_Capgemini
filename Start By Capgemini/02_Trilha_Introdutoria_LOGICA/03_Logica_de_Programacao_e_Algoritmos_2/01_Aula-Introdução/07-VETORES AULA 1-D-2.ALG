Algoritmo "Vetores Aula 1-D"
// Disciplina: L�gica de Programa��o e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   numeros1, numeros2, numeros3: vetor[1..5] de inteiro
   i, j: inteiro
   opcao : caracter
Inicio
   Para i de 1 Ate 5 Fa�a
      Escreval("01 - numeros: ", i)
      Leia(numeros1[i])
   Fimpara
   Para i de 1 Ate 5 Fa�a
      Escreval("02 - numeros: ", i)
      Leia(numeros2[i])
   Fimpara
   Escreval("1 - Soma")
   Escreval("2 - Subtra��o")
   Escreval("3 - Mutiplica��o")
   Escreval("4 - Divis�o")
   Leia(opcao)
   
   Se opcao = "1" entao
      Para i De 1 Ate 5 faca
           numeros3[i] <- numeros1[i] + numeros2[i]
      Fimpara
   Senao
      Se opcao = "2" entao
      Para i De 1 Ate 5 faca
           numeros3[i] <- numeros1[i] - numero2[i]
      Fimpara
   Senao
      Se opcao = "3" entao
      Para i De 1 Ate 5 faca
           numeros3[i] <- numeros1[i] * numeros2[i]
      Fimpara
   Senao
      Se opcao = "4" entao
      Para i De 1 Ate 5 faca
           numeros3[i] <- numeros1[i] / numeros2[i]
      Fimpara
Fimse
Fimse
Fimse
Fimse

Para i De 1 Ate 5 faca
     Escreval("A soma � iagual a: ", i , " - ", numeros3[i])
Fimpara
           
Fimalgoritmo