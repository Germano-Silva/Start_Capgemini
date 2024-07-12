Algoritmo "12-exercicio-funcao-procedimento_Aula 2.C"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   l1, l2, l3: inteiro
procedimento lerDados()
inicio
   Escreval("Informe o 1º lado)
   Leia(l1)
   Escreval("Informe o 2º lado)
   Leia(l2)
   Escreval("Informe o 3º lado)
   Leia(l3)
fimprocedimento

funcao ehTriangulo(): logico
inicio
   Se (l1 > l2 + l3) Ou (l2 > l1 + l3) Ou (l3 > l1 + l2) Entao
      retorne falso
   Senao
      retorne verdadeiro
   Fimse
fimfuncao

funcao tipoTriangulo(): caracter
inicio
   Se (l1 = l2) E (l2 = l3) Entao
      retorne "Equilátero"
   Senao
      Se (l1 = l2) Ou (l2 = l3) Ou (L1 = L3) Entao
         retorne "Isósceles"
      Senao
         retorne "Escaleno"
      Fimse
   Fimse
fimfuncao

Inicio
   lerDados()
   Se ehTriangulo() Entao
      Escreval(tipoTriangulo())
   Senao
      Escreval("Não é triangulo")
   Fimse




Fimalgoritmo