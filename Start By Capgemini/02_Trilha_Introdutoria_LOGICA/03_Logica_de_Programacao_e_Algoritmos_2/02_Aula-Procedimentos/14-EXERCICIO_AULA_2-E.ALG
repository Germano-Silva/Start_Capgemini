Algoritmo "14-Exercicio_Aula_2-E"
// Disciplina: L�gica de Programa��o e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 11/07/2024
Var
   gabarito: vetor[1..10] de caracter
   opcaoMenu: caracter
   notaFinal: inteiro
Procedimento mostrarMenu()
Inicio
   Escreval("1- Cadastre o gabarito")
   Escreval("2- Cadastre a prova")
   Escreval("3- Sair")
   Leia(opcaoMenu)

Fimprocedimento
//==============================================================================
Procedimento cadastrarGabarito()
var
   i: inteiro
Inicio
   Para i de 1 Ate 10 fa�a
      Escreval("Informe a resposta da quest�o: ", i)
      Leia(gabarito[i])
   Fimpara
Fimprocedimento
//==============================================================================
funcao cadastrarProva(): inteiro
var
   i, nota: inteiro
   resposta: caracter
Inicio
   nota <- 0
   Para i de 1 Ate 10 fa�a
      Escreval("Informe a resposta da quest�o: ", i)
      Leia(resposta)
      Se resposta = gabarito[i] entao
         nota <- nota + 1
      Fimse
   Fimpara
   retorne nota
Fimprocedimento
//==============================================================================

funcao verificarNota(notaFinal: inteiro): caracter
Inicio
   Se notaFinal >= 7 entao
      retorne "Aprovado!"
   Senao
      retorne "Reprovado!"
   fimse
Fimfuncao
//==============================================================================

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   Repita
      mostrarMenu()
      Escolha opcaoMenu
      Caso "1"
         cadastrarGabarito()
      Caso "2"
         notaFinal <- cadastrarProva()
         Escreval(verificarNota(notaFinal))
      Outrocaso
         Escreval("Op��o invalida")
      Fimescolha
   Ate opcaoMenu = "3"

Fimalgoritmo