Algoritmo "Estrutura_condicional"
// Disciplina: [Lógica de Programação e Algoritmos I]
// Autor: Germano Rodrigues da Silva
// Data atual: 09/07/2024
Var
// Seção de Declarações das variáveis 
n1, n2, n3, n4, media: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Informa a nota da 1ª prova: ")
Leia(n1)
Escreval("Informa a nota da 2ª prova: ")
Leia(n2)
Escreval("Informa a nota da 3ª prova: ")
Leia(n3)
Escreval("Informa a nota da 4ª prova: ")
Leia(n4)
media <- (n1+n2+n3+n4)/4
Escreval("A media das provas realizadas é: ")
Escreval(media)
Se media < 7 entao
   Escreval("Esta de recuperação :(")
Senao
   Escreval("Parabéns - Você passou :)")
Fimse
Fimalgoritmo

