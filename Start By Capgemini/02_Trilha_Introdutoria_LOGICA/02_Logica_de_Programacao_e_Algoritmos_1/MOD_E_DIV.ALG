Algoritmo "MOD e DIV"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Germano Rodrigues da Silva
// Data atual  : 07/07/2024
Var
// Seção de Declarações das variáveis 
x, y: inteiro
w, z: real
par: inteiro

Inicio
//DIV - Divisão que retorna um interiro evitando disima periodica
x <- 10
y <- 3
w <- x DIV y
escreva(w)
z <- x/y
escreva(z)
//MOD - Retorna o resto da divisão
w <- x MOD y
escreva(w)
z <- x % y
escreva(z)
// Verificando se uma variavel é par
Escreval("Informe um numero: ")
Leia(par)

Se par % 2 = 0 entao
   Escreval("Número é par!")
Senao
     Escreval("Número é impar!")
fimse

Fimalgoritmo