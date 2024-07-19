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
        System.out.print("Digite a idade do nadador: ");
        int idade = leitor.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora da faixa etária");
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
