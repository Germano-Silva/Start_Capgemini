Algoritmo "Estrutura_condicional"
// Disciplina: [L�gica de Programa��o e Algoritmos I]
// Autor: Germano Rodrigues da Silva
// Data atual: 09/07/2024
Var
// Se��o de Declara��es das vari�veis 
n1, n2, n3, n4, media: real


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
Escreval("Informa a nota da 1� prova: ")
Leia(n1)
Escreval("Informa a nota da 2� prova: ")
Leia(n2)
Escreval("Informa a nota da 3� prova: ")
Leia(n3)
Escreval("Informa a nota da 4� prova: ")
Leia(n4)
media <- (n1+n2+n3+n4)/4
Escreval("A media das provas realizadas �: ")
Escreval(media)
Se media < 7 entao
   Escreval("Esta de recupera��o :(")
Senao
   Escreval("Parab�ns - Voc� passou :)")
Fimse
Fimalgoritmo

