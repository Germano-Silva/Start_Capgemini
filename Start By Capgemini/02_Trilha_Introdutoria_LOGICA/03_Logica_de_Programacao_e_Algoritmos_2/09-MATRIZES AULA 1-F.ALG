Algoritmo "Matrizes Aula 1-F"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   cinema: vetor[1..10, 1..10] de caractere
   i, j: inteiro
   opcao, fila, poltrona: caractere
Inicio
   Para i de 1 Ate 10 Faça
      Para j De 1 Ate 10 faca
         cinema[i, j] <- "0"
      Fimpara
   Fimpara
   Repita
      Escreval("--------------------------------------")
      Escreval("----------------Cinema----------------")
      Escreval("--------------------------------------")
      Escreval("1 - Reservar  | 2 - Layout | 3 - Sair ")
      Leia(opcao)
      Escolha opcao
      Caso "1"
         Escreval("Informe a fila: ")
         Leia(fila)
         Escreval("Informe a poltrona: ")
         Leia(poltrona)

         Se cinema[fila, poltrona] = "0" entao
            cinema[fila, poltrona] <- "X"
         Senao
            Escreval("Poltrona já ocupada")
         Fimse
      Caso "2"
         Para i de 1 Ate 10 Faça
            Para j De 1 Ate 10 faca
               Escreva(" ", cinema[i, j], " ")
            Fimpara
            Escreval("")
         Fimpara
      Fimescolha



   Ate opcao = "3"



Fimalgoritmo