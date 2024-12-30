Algoritmo "13-exercicio-funcao-procedimento_Aula 2.D"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   // vareiaveis globais
   opcaoMenu: caracter
   clientes: vetor [1..5] de caracter

   //------------------------------------------------------------------------------
   // Procedimento  para criar menu
Procedimento mostrarMenu()
inicio
   Escreval("------------------------")
   Escreval(" - - - -  Menu  - - - - ")
   Escreval("------------------------")
   Escreval("     1 - Cadastrar      ")
   Escreval("     2 - Pesquisar      ")
   Escreval("     3 - Listar         ")
   Escreval("     4 - Excluir        ")
   Escreval("     5 - Sair           ")
   Escreval("------------------------")
   Leia(opcaoMenu)
   Escreval("------------------------")
Fimprocedimento
//------------------------------------------------------------------------------

Procedimento cadastrar()
var
//bloco de variaveis locais
   indiceCadastro: inteiro

inicio
   Para indiceCadastro de 1 Ate 5 faça
      Se clientes[indiceCadastro] = "" entao
         Escreval("Informe o nome do cliente: ")
         Leia(clientes[indiceCadastro])
      Fimse
   Fimpara
Fimprocedimento

//------------------------------------------------------------------------------
Procedimento pesquisar()
var
   //bloco de variaveis locais
   indicePesquisar, sucesso: inteiro
   nomePesquisar: caracter

inicio
   Escreval("Informe o nome do cliente: ")
   Leia(nomePesquisar)
   sucesso <- -1
   Para indicePesquisar De 1 Ate 5 faca
      Se clientes[indicePesquisar] = nomePesquisar entao
         sucesso <- indicePesquisar
         Interrompa
      Fimse
   Fimpara
   Se sucesso = -1 entao
      Escreval("Cliente não encontrado!")
   Senao
      Escreval("Cliente encontrado na posição: ", sucesso," - ", nomePesquisar)
   Fimse
Fimprocedimento
//------------------------------------------------------------------------------
Procedimento listar()
var
   indice: inteiro
   temCadastro: logico

Inicio
   temCadastro <- Falso
   Para indice de 1 ate 5 faca
      Se clientes[indice] <> "" entao
         temCadastro <- Verdadeiro
         Interrompa
      Fimse
   Fimpara

   Se temCadastro entao
      Para indice de 1 ate 5 faca
         Se clientes[indice] <> "" entao
            Escreval("Cliente: ", indice, "-", clientes[indice])
         Fimse
      Fimpara
   Senao
      Escreval("Nenhum cliente cadastrado!")
   Fimse
Fimprocedimento
//------------------------------------------------------------------------------

Procedimento excluir()
var
   //bloco de variaveis locais
   indiceExcluir: inteiro

inicio
   Escreval("Informe o indice do cliente pr excluir: ")
   Leia(indiceExcluir)
   Se (indiceExcluir < 1) ou (indiceExcluir > 5) entao
      Escreval("Indice não encontrado!")
   Senao
      clientes[indiceExcluir] <- ""
      Escreval("Cliente excluido na posiçao: ", indiceExcluir)
   Fimse
Fimprocedimento
//------------------------------------------------------------------------------

Inicio
   // inicio do programa
   Repita
      mostrarMenu()
      Escolha opcaoMenu
      Caso "1"
         cadastrar()
      Caso "2"
         pesquisar()
      Caso "3"
         listar()
      Caso "4"
         excluir()
      Outrocaso
         Escreval("Opção invalida")
      Fimescolha

   Ate opcaoMenu = "5"




Fimalgoritmo