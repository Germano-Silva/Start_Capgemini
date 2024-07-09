Algoritmo "Extra - Curto circuito"
// Função : Lógica de Programação e Algoritmos I
// Autor : Germano Rodrigues da Silva
// Data : 09/07/2024

Var
   l1, l2, l3: real
   condicao1, condicao2, condicao3: logico



Inicio
   Escreval("Informe o 1º lado: ")
   Leia(l1)
   Escreval("Informe o 2º lado: ")
   Leia(l2)
   Escreval("Informe o 3º lado: ")
   Leia(l3)

   condicao1<-l1>l2+l3
   condicao2<- l2>l1+l3
   condicao3<- l3>l1+l2
   Se condicao1 e condicao2 entao
      Escreval("Não é um triangulo")
   Fimse



Fimalgoritmo