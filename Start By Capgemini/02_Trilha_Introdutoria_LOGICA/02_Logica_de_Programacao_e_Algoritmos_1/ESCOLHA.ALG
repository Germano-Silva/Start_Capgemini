Algoritmo "Escolha"
// Fun��o : L�gica de Programa��o e Algoritmos I
// Autor : Germano Rodrigues da Silva
// Data : 09/07/2024

Var
   voto: literal


Inicio
   Escreval("Digite o seu voto: ")
   Leia(voto)

   Se voto = "20" entao
      Escreval("Voc� votou no Pernalonga")
   Senao
      Se voto = "30" entao
         Escreval("Voc� votou no Patolino")
      Senao
         Se voto = "40" entao
            Escreval("Piu-Piu")
         Senao
            Escreval("Voto nulo")
         Fimse
      Fimse
   Fimse



Fimalgoritmo