Algoritmo "Orientacao_a_objetos-Aula_4-A"
// Disciplina: Lógica de Programação e Algoritmos II
// Autor: Germano Rodrigues da Silva 
// Data atual  : 12/07/2024

Tipo
cadastroCliente = registro
   nomes : caracter
   rg : caracter
   idades : inteiro
fimregistro
Var
cliente1: cadastroCliente


Inicio
Escreval("Informe o nome do cliente: ")
Leia(cliente1.nomes)
Escreval("Informe o idade do cliente: ")
Leia(cliente1.idades)
Escreval("Informe o RG do cliente: ")
Leia(cliente1.rg)
Escreval("Cliente cadastrado: ")
Escreval("Nome: ", cliente1.nomes, " - RG: ",cliente1.rg," - Idade: ",cliente1.idades)

Fimalgoritmo