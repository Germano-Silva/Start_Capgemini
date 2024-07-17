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
  * Exercício: 15.
  * 
  * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200.
  */
public class Exercicio_15 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe um número entre 0 e 300:");
    int numero = leitor.nextInt();
    if (numero>=100 && numero<=200) {
      System.out.println("O núemro esta entre 100 e 200!");
    }else{
      System.out.println("O número esta abaixo de 100 ou maior que 200!");
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
