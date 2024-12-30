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
 * Exercício: 27.
 * 
 * A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
 * Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
 * O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
 * (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados.
 * Informe total de desconto e total pago pelos clientes.
 */
public class Exercicio_27 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);

        float totalDesconto = 0;
        float totalPago = 0;
        int contador = 0;
        float desconto = 0;

        System.out.println("=======================================================");
        System.out.println("      Bem-vindo à concessionária CARANGO!      ");
        System.out.println("=======================================================");
        System.out.println("Instruções:");
        System.out.println("Para cadastrar um veículo, digite o tipo de combustível");
        System.out.println("('álcool', 'gasolina', 'diesel') e em seguida o valor do veículo.");
        System.out.println("Para encerrar o cadastro, digite '0' como valor do veículo.\n");

        while (true) {
            contador++;
            System.out.println("-------------------------------------------------------");
            System.out.println("Cadastro do Veículo #" + contador);
            System.out.println("-------------------------------------------------------");

            System.out.print("Digite o tipo de combustível: ");
            System.out.println("[1] Álcool, [2] Gasolina, [3] Diesel e [0] Sair: ");
            int tipoCombustivel = leitor.nextInt();

            if (tipoCombustivel == 0) {
                break;
            }

            System.out.print("Digite o valor do veículo: ");
            float valorVeiculo = leitor.nextFloat();
            System.out.println();

            switch (tipoCombustivel) {
                case 1:
                    desconto = valorVeiculo * 0.25f;
                    break;
                case 2:
                    desconto = valorVeiculo * 0.21f;
                    break;
                case 3:
                    desconto = valorVeiculo * 0.14f;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido. Veículo não computado.\n");
                    contador--;
                    continue;
            }

            float valorPago = valorVeiculo - desconto;

            totalDesconto += desconto;
            totalPago += valorPago;

            System.out.println("\nResumo do Cadastro:");
            System.out.println("Tipo de combustível: " + tipoCombustivel);
            System.out.println("Valor do veículo: R$" + valorVeiculo);
            System.out.println("Desconto aplicado: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
        }

        System.out.println("\n=======================================================");
        System.out.println("          Fim do Cadastro de Veículos");
        System.out.println("=======================================================");
        System.out.println("Total de veículos cadastrados: " + contador);
        System.out.println("Total de descontos aplicados: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

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
