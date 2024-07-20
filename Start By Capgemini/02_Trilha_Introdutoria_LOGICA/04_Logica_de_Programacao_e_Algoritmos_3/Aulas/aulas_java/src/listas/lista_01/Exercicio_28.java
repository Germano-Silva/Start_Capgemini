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
 * Exercício: 28.
 * 
 * Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
 * 
 * a. 50% para aqueles que ganham menos do que três salários mínimos;
 * b. 20% para aqueles que ganham entre três até dez salários mínimos;
 * c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
 * d. 10% para os demais funcionários. 
 * 
 * Leia o nome do funcionário, seu salário e o valor do salário mínimo.
 * Calcule o seu novo salário reajustado.
 * Escrever o nome do funcionário, o reajuste e seu novo salário.
 * Calcule quanto à empresa vai aumentar sua folha de pagamento.
 */
public class Exercicio_28 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        float aumentoTotalFolha = 0;

        System.out.println("=======================================================");
        System.out.println("      Reajuste Salarial dos Funcionários");
        System.out.println("=======================================================");
        System.out.println("Por favor, insira os dados para cada funcionário:\n");

        for (int i = 1; i <= 584; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Funcionário #" + i);
            System.out.println("-------------------------------------------------------");

            System.out.print("Digite o nome do funcionário: ");
            String nomeFuncionario = leitor.nextLine();

            System.out.print("Digite o salário atual do funcionário: ");
            float salarioAtual = leitor.nextFloat();

            System.out.print("Digite o valor do salário mínimo: ");
            float salarioMinimo = leitor.nextFloat();
            System.out.println();

            float novoSalario = salarioAtual;

            if (salarioAtual < 3 * salarioMinimo) {
                novoSalario *= 1.5;
            } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
                novoSalario *= 1.2;
            } else if (salarioAtual > 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
                novoSalario *= 1.15;
            } else {
                novoSalario *= 1.1;
            }

            float reajuste = novoSalario - salarioAtual;
            aumentoTotalFolha += reajuste;

            System.out.println("\nResumo do Reajuste:");
            System.out.println("Nome do funcionário: " + nomeFuncionario);
            System.out.println("Reajuste aplicado: R$" + reajuste);
            System.out.println("Novo salário: R$" + novoSalario);
        }

        System.out.println("\n=======================================================");
        System.out.println("Aumento total na folha de pagamento: R$" + aumentoTotalFolha);
        System.out.println("\n=======================================================");
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
