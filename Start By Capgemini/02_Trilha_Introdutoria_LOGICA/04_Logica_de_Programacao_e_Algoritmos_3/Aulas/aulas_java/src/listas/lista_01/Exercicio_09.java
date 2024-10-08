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
 * Exercício: 09.
 * 
 * Faça um algoritmo que receba um valor que foi depositado e 
 * exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 0,07% a. m.
 */

public class Exercicio_09 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor que deseja depositar: R$");
        double deposito = leitor.nextDouble();
        double juros = (0.07/100);
        double jurosMes = deposito *juros;
        double rendimento = deposito + jurosMes;
        System.out.print("Após um mês o valor vai ser: R$" + rendimento);
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
