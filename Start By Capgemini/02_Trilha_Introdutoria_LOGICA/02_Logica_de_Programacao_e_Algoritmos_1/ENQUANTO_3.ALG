Algoritmo "Enquanto_3"
// Aula: Operadores e Exercícios
// Autor: Germano Rodrigues da Silva
// Data atual  : 09/07/2024
Var
   qtdEntrevistados, maisNovo, maisVelho, idadeInformada, qtdPessoas: inteiro
   mediaIdades, pocentagemMenorIdade, qtdMenorIdade, somaIdade: real


Inicio
   qtdEntrevistados <- 0
   maisNovo <- 9999
   maisVelho <- 0
   qtdMenorIdade <- 0
   Escreval("Informe a quantidade de entrevistados: ")
   Leia(qtdPessoas)
   Enquanto qtdEntrevistados < qtdPessoas faça
      Escreval("Informe a idade: ")
      Leia(idadeInformada)
      Se idadeInformada >= maisVelho entao
         maisVelho <- idadeInformada
      Fimse
      Se idadeInformada <= maisNovo entao
         maisNovo <- idadeInformada
      Fimse
      Se idadeInformada < 18 entao
         qtdMenorIdade <- qtdMenorIdade + 1
      fimse
      qtdEntrevistados <- qtdEntrevistados + 1
      somaIdade <- somaIdade + idadeInformada
   Fimenquanto
   Escreval("Mais novo: ", maisNovo)
   Escreval("Mais velho: ", maisVelho)
   pocentagemMenorIdade <- (qtdMenorIdade / qtdPessoas)*100
   Escreval("Porcentagem menor idade: ", pocentagemMenorIdade,"%")
   mediaIdades <- somaIdade / qtdPessoas
   Escreval("Media de idade: ", mediaIdades)
   
   


Fimalgoritmo