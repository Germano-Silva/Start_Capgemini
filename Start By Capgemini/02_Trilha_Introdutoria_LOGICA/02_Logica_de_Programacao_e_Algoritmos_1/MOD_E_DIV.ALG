Algoritmo "MOD e DIV"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Germano Rodrigues da Silva
// Data atual  : 07/07/2024
Var
// Se��o de Declara��es das vari�veis 
x, y: inteiro
w, z: real
par: inteiro

Inicio
//DIV - Divis�o que retorna um interiro evitando disima periodica
x <- 10
y <- 3
w <- x DIV y
escreva(w)
z <- x/y
escreva(z)
//MOD - Retorna o resto da divis�o
w <- x MOD y
escreva(w)
z <- x % y
escreva(z)
// Verificando se uma variavel � par
Escreval("Informe um numero: ")
Leia(par)

Se par % 2 = 0 entao
   Escreval("N�mero � par!")
Senao
     Escreval("N�mero � impar!")
fimse

Fimalgoritmo