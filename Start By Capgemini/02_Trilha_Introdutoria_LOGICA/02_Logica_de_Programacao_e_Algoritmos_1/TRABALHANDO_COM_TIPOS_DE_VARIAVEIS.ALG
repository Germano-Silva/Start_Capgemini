Algoritmo "Trabalhando com tipos de vari�veis"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Descri��o   : Entrada, processamento e saida.
// Autor(a)    : Germano Rodrigues da Silva
// Data atual  : 07/07/2024
Var
// Se��o de Declara��es das vari�veis
//� inteiro: num�ricas do tipo inteiro, ou seja, sem casas decimais.
//� real: num�ricas do tipo real, ou seja, com casas decimais.
//� caractere: tipo string, ou seja, cadeia de caracteres.
//� logico: booleano, ou seja, com valor VERDADEIRO ou FALSO.
   nome, sobrenome, nomeCompleto: caractere


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  Escreval("Informe o seu nome: ")
  Leia(nome)
  Escreval("Informe o seu sobrenome: ")
  Leia(sobrenome)
  nomeCompleto <- nome + " " + sobrenome
  Escreval("Nome Completo: " + nomeCompleto)

Fimalgoritmo