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
