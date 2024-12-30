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
 * Exercício: 31.
 * 
 * Dados três valores A, B e C, em que A e B são números reais e C é um caractere,
 * pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
 * caso contrário deve ser impressa uma mensagem de operador não definido.
 * Tratar erro de divisão por zero.
 */
public class Exercicio_31 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A (número real): ");
        double A = leitor.nextDouble();
        System.out.print("Digite o valor de B (número real): ");
        double B = leitor.nextDouble();
        System.out.print("Digite o caractere C (operador aritmético [+][-][*][/]): ");
        char C = leitor.next().charAt(0);

        // Verificação e execução da operação
        switch (C) {
            case '+':
                System.out.println("Soma A + B: " + (A + B));
                break;
            case '-':
                System.out.println("Resultado da subtração A - B: " + (A - B));
                break;
            case '*':
                System.out.println("Resultado da multiplicação A * B: " + (A * B));
                break;
            case '/':
                if (B != 0) {
                    System.out.println("Resultado da divisão A / B: " + (A / B));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador aritmético não definido: " + C);
                break;
        }

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
