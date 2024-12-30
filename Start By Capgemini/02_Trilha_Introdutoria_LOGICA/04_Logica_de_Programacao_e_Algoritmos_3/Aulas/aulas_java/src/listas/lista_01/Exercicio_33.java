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
  * Exercício: 33.
  * 
  * A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
  * Faça um algoritmo que calcule e exiba o salário de um professor. 
  * Sabe-se que o valor da hora/aula segue a tabela abaixo:
  *  
  * a. Professor Nível 1 R$12,00 por hora/aula;
  * b. Professor Nível 2 R$17,00 por hora/aula;
  * c. Professor Nível 3 R$25,00 por hora/aula.
  */

public class Exercicio_33 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
    System.out.println("Escolha o nível do professor:");
    System.out.println("1 - Nível 1 (R$12,00 por hora/aula)");
    System.out.println("2 - Nível 2 (R$17,00 por hora/aula)");
    System.out.println("3 - Nível 3 (R$25,00 por hora/aula)");
    System.out.print("Digite o número correspondente ao nível: ");
    int nivel = leitor.nextInt();
    double horaAula = 0.0;
        
    switch (nivel) {
        case 1:
            horaAula = 12.0;
            break;
        case 2:
            horaAula = 17.0;
            break;
        case 3:
            horaAula = 25.0;
            break;
        default:
            System.out.println("Opção inválida. Escolha um número de 1 a 3.");
            break;
    }
    if (nivel >= 1 && nivel <= 3) {
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = leitor.nextInt();

        double salario = horaAula * horasTrabalhadas;

        System.out.println("O salário do professor é: R$" + salario);
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
