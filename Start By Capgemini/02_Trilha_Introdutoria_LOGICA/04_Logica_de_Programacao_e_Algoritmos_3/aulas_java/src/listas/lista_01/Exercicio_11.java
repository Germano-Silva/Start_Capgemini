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
 * Exercício: 11.
 * 
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
 * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado 
 * pelo usuário
 */
public class Exercicio_11 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o preço de custo do produto: R$ ");
        double precoCusto = leitor.nextDouble();
        System.out.print("Informe o percentual de acréscimo: ");
        double percentualAcrescimo = leitor.nextDouble();
        double valorVenda = precoCusto * (1 + percentualAcrescimo / 100);
        System.out.println("O valor de venda do produto é: R$ " + valorVenda);
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
