Algoritmo "Escolha_formato_por_caso"
// Fun��o : L�gica de Programa��o e Algoritmos I
// Autor : Germano Rodrigues da Silva
// Data : 09/07/2024

Var
   voto: literal


Inicio
   Escreval("Digite o seu voto: ")
   Leia(voto)

   Escolha voto
   caso "10"
      Escreval("Voc� votou no Pernalonga!")
   caso "20"
      Escreval("Voc� votou no Papaleguas!")
   caso "30"
      Escreval("Voc� votou no Patolino!")
   caso "40"
      Escreval("Voc� votou no Piu-Piu!")
   outrocaso
      Escreval("Voc� votou nulo!")


Fimalgoritmo