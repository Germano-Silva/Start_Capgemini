package listas.lista_01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 12.
 * 
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do
 * distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo 
 * de fábrica, e depois o percentual do distribuidor sobre o resultado). 
 * Supondo que o percentual do distribuidor seja de 28% e os impostos 45%,
 * escreva um algoritmo que leia o custo de fábrica de um carro e 
 * informe o custo ao consumidor do mesmo
 */
public class Exercicio_12 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o preço de custo do carro para a fabrica: R$ ");
        double custoFabrica = leitor.nextDouble();

        double imposto = custoFabrica * (0.45);
        System.out.println("São 45% de impostos aplicados no valor de: R$" + imposto );

        double percentualDistribuidor = (custoFabrica + imposto)*(0.28);
        System.out.println("São 28% de percentual do distribuidor no valor de: R$" + percentualDistribuidor);


        double valorTotal = custoFabrica + imposto + percentualDistribuidor;
        System.out.println("O valor total do produto é de R$ " + valorTotal);

        leitor.close();
        
    }

    public static void clearScreen() throws IOException, InterruptedException {
        try {
                new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
        } catch (Exception e) {
                System.err.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }
        

}
