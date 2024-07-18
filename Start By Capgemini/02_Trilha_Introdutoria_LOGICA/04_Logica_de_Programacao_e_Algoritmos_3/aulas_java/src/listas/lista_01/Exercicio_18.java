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
 * Exercício: 18.
 * 
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
 * “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade
 */

public class Exercicio_18 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i>=75 ; i++) {
          System.out.print("Informe a idade:");
          int idade = leitor.nextInt();
          if (idade<18) {
            System.out.println("Menor de idade!");
          } else {
            System.out.println("Maior de idade!");
          }
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
