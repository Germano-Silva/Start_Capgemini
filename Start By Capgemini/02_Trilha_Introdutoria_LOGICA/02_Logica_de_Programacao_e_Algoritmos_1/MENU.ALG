algoritmo "MENU-Aula_3-E"
// Função : Lógica de Programação e Algoritmos I
// Autor : Germano Rodrigues da Silva
// Data : 10/07/2024
var
   opcaoMenu: real
   totalConta, valorTrocaOleo, valorBalanc, valorTrocaP: inteiro
inicio
   totalConta <- 0
   valorTrocaOleo <- 50
   valorBalanc <- 80
   valorTrocaP <- 30
   Repita
      Escreval ("Bem vindo!")
      Escreval ("Por favor, selecione uma das opções abaixo para seguir:")
      Escreval ("(1) - Troca de óleo")
      Escreval ("(2) - Balanceamento")
      Escreval ("(3) - tracar pineu")
      Escreval ("(4) - Se deseja finalizar")
      Leia (opcaoMenu)
      Se opcaoMenu = 1  Entao
         Escreval("Realizando a Troca de óleo!")
         totalConta <- totalConta +  valorTrocaOleo
      Senao
         Se opcaoMenu = 2 Entao
            Escreval("Realizando a Balanceamento!")
            totalConta <- totalConta +  valorBalanc
         Senao
            Se opcaoMenu = 3 Entao
               Escreval("Realizando a troca do peneu!")
               totalConta <- totalConta +  valorTrocaP
            Fimse
         Fimse
      Fimse
   Ate opcaoMenu = 4
   Escreval("Finalizando nosso atendimento!")
   Escreval("O valor total é R$ ", totalConta)
fimalgoritmo