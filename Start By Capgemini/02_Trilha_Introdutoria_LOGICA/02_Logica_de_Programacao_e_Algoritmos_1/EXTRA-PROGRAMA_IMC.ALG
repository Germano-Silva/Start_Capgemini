Algoritmo "Extra - programa IMC"
// Função : Lógica de Programação e Algoritmos I
// Autor : Germano Rodrigues da Silva
// Data : 09/07/2024

Var
   altura, peso, imc: real


Inicio
   Escreval("Informe a altura: ")
   Leia(altura)
   Escreval("Informe a peso: ")
   Leia(peso)
   imc <- peso/(altura * altura)
   Se imc < 19 entao
      Escreval("Abaixo do peso!")
   Senao
      Se imc < 24 entao
         Escreval("Peso ideal!")
      Senao
         Escreval("Acima do peso!")
      Fimse
   Fimse



Fimalgoritmo