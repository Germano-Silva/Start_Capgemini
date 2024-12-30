Algoritmo "Exercicio_Condicional_1"
// Disciplina: [Lógica de Programação e Algoritmos I]
// Autor: Germano Rodrigues da Silva 
// Data atual  : 09/07/2024
Var
// Seção de Declarações das variáveis 
velocidade_veiculo, velocidade_leve, velocidade_media, velocidade_grave, velocidade_gavissima: real

Inicio
velocidade_leve <- 50 * 1.1
velocidade_media  <- 70
velocidade_grave <- 90
velocidade_gavissima <- 110

Escreval("Informe a velocidade que o veiculo passou: ")
Leia(velocidade_veiculo)
Se  velocidade_veiculo <= velocidade_leve então
    Escreval("Insento de multa")
Senao
     Se velocidade_veiculo <= velocidade_media entao
        Escreval("3 pontos na carteira")
Senao
     Se velocidade_veiculo <= velocidade_grave entao
        Escreval("4 pontos na carteira")
Senao
     Se velocidade_veiculo <= velocidade_gavissima entao
        Escreval("5 pontos na carteira")
Senao
     Escreval("7 pontos na carteira")
Fimse
fimse
fimse
fimse


Fimalgoritmo