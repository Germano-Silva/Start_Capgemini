Algoritmo "Orientacao_a_objetos-Aula_4-B"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva
// Data atual  : 12/07/2024

Tipo
   //Tambem chamados de class em outras linguagens
   cadastroCliente = registro
      nomes : caracter
      rg : caracter
      idades : inteiro
   fimregistro
Var
   clientes: vetor[1..3] de cadastroCliente
   opcaoMenu, rgPesquisa: caracter
   i: inteiro

Inicio
   Repita
      escreval("1 - Cadastrar")
      Escreval("2 - Pesquisar")
      Escreval("3 - Sair")
      Leia(opcaoMenu)

      se opcaoMenu = "1" entao
         Para i de 1 ate 3 faca
            se clientes[i].nomes = "" entao
               Escreval("Informe o nome do cliente: ")
               Leia(clientes[i].nomes)
               Escreval("Informe o idade do cliente: ")
               Leia(clientes[i].idades)
               Escreval("Informe o RG do cliente: ")
               Leia(clientes[i].rg)
               interrompa
            fimse
         fimpara
      Senao
         Se opcaoMenu = "2" entao
            Escreval("Informe o RG para pequisar: ")
            Leia(rgPesquisa)
            Para i de 1 ate 3 faca
               Se rgPesquisa = clientes[i].rg entao
                  Escreval(clientes[i].nomes," - Enconrado na posição", i)
                  interrompa
               fimse
            Fimpara
         Fimse
      Fimse
   ate  opcaoMenu = "3"

Fimalgoritmo