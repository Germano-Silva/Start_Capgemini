Algoritmo "Escolha_formato_por_caso"
// Função : Lógica de Programação e Algoritmos I
// Autor : Germano Rodrigues da Silva
// Data : 09/07/2024

Var
   voto: literal


Inicio
   Escreval("Digite o seu voto: ")
   Leia(voto)

   Escolha voto
   caso "10"
      Escreval("Você votou no Pernalonga!")
   caso "20"
      Escreval("Você votou no Papaleguas!")
   caso "30"
      Escreval("Você votou no Patolino!")
   caso "40"
      Escreval("Você votou no Piu-Piu!")
   outrocaso
      Escreval("Você votou nulo!")


Fimalgoritmo