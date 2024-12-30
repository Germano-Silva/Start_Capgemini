Algoritmo "Trabalhando com tipos de variáveis"
// Disciplina   : [Linguagem e Lógica de Programação]
// Descrição   : Entrada, processamento e saida.
// Autor(a)    : Germano Rodrigues da Silva
// Data atual  : 07/07/2024
Var
// Seção de Declarações das variáveis
//• inteiro: numéricas do tipo inteiro, ou seja, sem casas decimais.
//• real: numéricas do tipo real, ou seja, com casas decimais.
//• caractere: tipo string, ou seja, cadeia de caracteres.
//• logico: booleano, ou seja, com valor VERDADEIRO ou FALSO.
   nome, sobrenome, nomeCompleto: caractere


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  Escreval("Informe o seu nome: ")
  Leia(nome)
  Escreval("Informe o seu sobrenome: ")
  Leia(sobrenome)
  nomeCompleto <- nome + " " + sobrenome
  Escreval("Nome Completo: " + nomeCompleto)

Fimalgoritmo