Algoritmo "Exercicio tabela - verdade"
// Disciplina: [L�gica de Programa��o e Algoritmos I]
// Autor: Germano Rodrigues da Silva 
// Data atual  : 09/07/2024
Var
// Se��o de Declara��es das vari�veis 
l1, l2, l3: real
condicao1, condicao2, condicao3: logico
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
Escreval("Informe o 1� lado:")
Leia(l1)
Escreval("Informe o 2� lado:")
Leia(l2)
Escreval("Informe o 3� lado:")
Leia(l3)

condicao1 <- l1 > l2+l3
condicao2 <- l2 > l1+l3
condicao3 <- l3 > l1+l2

Se condicao1 ou condicao2 ou condicao3 Entao
   Escreval("N�o � um triangulo")
Senao
   Se (l1 = l2) e (l2 = l3) entao
      Escreval("Equilatero")
   senao
        Se (l1 = l2) ou (l2 = l3) ou (l3 = l1) Entao
           Escreval("Is�celes")
        Senao
             Escreval("Escaleno")
        Fimse
   Fimse
Fimse
Fimalgoritmo