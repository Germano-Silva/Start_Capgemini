Algoritmo "Vetores Aula 1-C"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   nomes : vetor[1..5] de caracter
   pesquisa: caracter
   i, sucesso: inteiro
Inicio
   Para i de 1 Ate 5 Faça
      Escreval("Informe o nome: ")
      Leia(nomes[i])
   Fimpara
   Escreval("Informe um nome para pesquisar")
   Leia(pesquisa)
   sucesso <- 0

   Para i de 1 Ate 5 Faça
      Se pesquisa = nomes[i] entao
         sucesso <- 1
      fimse
   Fimpara
   Se sucesso = 1  entao
      Escreval("Encontrado!")
   senao
      Escreval("Não encontrado!")
   Fimse

Fimalgoritmo