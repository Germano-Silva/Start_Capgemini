Algoritmo "Exercicio tabela - verdade"
// Disciplina: [Lógica de Programação e Algoritmos I]
// Autor: Germano Rodrigues da Silva 
// Data atual  : 09/07/2024
Var
// Seção de Declarações das variáveis 
l1, l2, l3: real
condicao1, condicao2, condicao3: logico
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Informe o 1º lado:")
Leia(l1)
Escreval("Informe o 2º lado:")
Leia(l2)
Escreval("Informe o 3º lado:")
Leia(l3)

condicao1 <- l1 > l2+l3
condicao2 <- l2 > l1+l3
condicao3 <- l3 > l1+l2

Se condicao1 ou condicao2 ou condicao3 Entao
   Escreval("Não é um triangulo")
Senao
   Se (l1 = l2) e (l2 = l3) entao
      Escreval("Equilatero")
   senao
        Se (l1 = l2) ou (l2 = l3) ou (l3 = l1) Entao
           Escreval("Isóceles")
        Senao
             Escreval("Escaleno")
        Fimse
   Fimse
Fimse
Fimalgoritmo