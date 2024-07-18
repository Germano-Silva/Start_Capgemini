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
 * Exercício: 22.
 * 
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
 * Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
 * Informe o valor de custo de cada produto, o valor de venda de cada produto,
 * a média de preço de custo e do preço de venda.
 */
public class Exercicio_22 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        String nomeProduto;
        float precoCusto, precoVenda; totalCusto, totalVenda;
        int i = 0;

        for (i = 1; i<=40; i++) {
            System.out.println("Digite o nome do produto:");
            nomeProduto = leitor.next();
            System.out.println("Informe o valor de custo:");
            precoCusto = leitor.nextFloat();
            System.out.println("Informe o preço de venda:");
            precoVenda = leitor.nextFloat();
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto==precoVenda) {
                System.out.println("O preço de custo é o mesmo que o preço de venda!");
                System.out.println("Empate no valor!");
                
            } else if(precoCusto>precoVenda){
                System.out.println("O preço de custo é maior que o preço de venda!");
                System.out.println("Prejuizo!");
            }else{
                System.out.println("O preço do custo é menor que preço de venda!");
                System.out.println("Lucro!");
            }
            System.out.println("Nome do produto: " + nomeProduto);
            System.out.println("Preço de custo: R$" + precoCusto);
            System.out.println(" preço de venda: R$" + precoVenda);
        }
        System.out.println("O média de preço de custo é de: R$" + (totalCusto/i));
        System.out.println("O média de preço de venda é de: R$" + (totalVenda/i));
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
