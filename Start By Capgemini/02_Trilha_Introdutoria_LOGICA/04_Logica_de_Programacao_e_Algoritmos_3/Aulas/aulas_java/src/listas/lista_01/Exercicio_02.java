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
  * Exercício 02:
  *
  * Faça um algoritmo que receba dois números e ao final mostre a soma,
  * subtração, multiplicação e a divisão dos dois números lidos
  */

public class Exercicio_02 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);

    double n1, n2, soma, multiplica, sub, div;

    System.out.println("Informe um número!");
    n1 = leitor.nextDouble();
    System.out.println("Informe mais um número!");
    n2 = leitor.nextDouble();
    soma = n1 + n2;
    System.out.println("A soma dos número é " + soma );
    multiplica = n1 * n2;
    System.out.println("A soma dos número é " + multiplica );
    sub = n1 - n2;
    System.out.println("A soma dos número é " + sub );
    div = n1 / n2;
    System.out.println("A soma dos número é " + div );
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
