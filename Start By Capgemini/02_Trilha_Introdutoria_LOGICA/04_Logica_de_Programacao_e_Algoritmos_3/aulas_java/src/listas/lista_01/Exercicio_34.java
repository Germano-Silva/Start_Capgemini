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
  * Exercício: 34.
  * 
  * Elabore um algoritmo que, dada a idade de um nadador. 
  * Classifique-o em uma das seguintes categorias: 
  *  a. Infantil A = 5 - 7 anos;
  *  b. Infantil B = 8 - 10 anos;
  *  c. Juvenil A = 11- 13 anos;
  *  d. Juvenil B = 14 - 17 anos;
  *  e. Sênior = 18 - 25 anos.
  * Apresentar mensagem “idade fora da faixa etária” quando
  * for outro ano não contemplado.
  */
public class Exercicio_34 {
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
