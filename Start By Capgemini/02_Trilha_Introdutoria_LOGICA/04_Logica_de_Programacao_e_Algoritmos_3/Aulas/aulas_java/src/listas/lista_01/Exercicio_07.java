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
  * Exercício: 07.
  * 
  * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
  * conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
  */
  
public class Exercicio_07 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe a temperatura: ");
    float c = leitor.nextFloat();
    float f = ((9*c)+160)/5;
    System.out.println("A temperatura em Fahrenheit é: F " + f);
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
