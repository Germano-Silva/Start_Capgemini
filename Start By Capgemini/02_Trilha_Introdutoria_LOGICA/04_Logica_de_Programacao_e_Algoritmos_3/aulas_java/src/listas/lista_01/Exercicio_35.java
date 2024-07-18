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
  * Exercício: 35.
  * 
  * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
  *
  * Tipo de Cliente Valor do KW/h
  *
  * a. (Residência) 0,60;
  * b. (Comércio) 0,48;
  * c. (Indústria) 1,29.
  */

public class Exercicio_35 {
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
