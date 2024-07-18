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
 * Exercício: 25.
 * 
 * Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
 * Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.
 * Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes.
 */


public class Exercicio_25 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro número!");
        int numero = leitor.nextInt();
        System.out.println("Informe o 2 número!");
        int numero2 = leitor.nextInt();

        if (numero>numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
            System.out.println("o primeiro número é: " + numero);
            System.out.println("O segundo número é: " + numero2);
        } else if(numero<numero2){
            System.out.println("O segundo número é maior que o primeiro.");
            System.out.println("O segundo número é: " + numero2);
            System.out.println("o primeiro número é: " + numero);
        }else{
            System.out.println("Os numero são iguais!");
            System.out.println("o primeiro número é: " + numero);
            System.out.println("O segundo número é: " + numero2);
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
