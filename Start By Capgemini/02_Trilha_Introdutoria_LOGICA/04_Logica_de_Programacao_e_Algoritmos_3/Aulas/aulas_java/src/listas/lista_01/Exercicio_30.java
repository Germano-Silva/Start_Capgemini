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
 * Exercício: 30.
 * 
 * Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente.
 */

public class Exercicio_30 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("          Digite três valores inteiros distintos:      ");
        System.out.println("=======================================================");
        System.out.println();
        System.out.print("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = leitor.nextInt();
        System.out.print("Valor 3: ");
        int valor3 = leitor.nextInt();

        
        int n1, n2, n3;

        
        if (valor1 <= valor2 && valor1 <= valor3) {
            n1 = valor1;
            if (valor2 <= valor3) {
                n2 = valor2;
                n3 = valor3;
            } else {
                n2 = valor3;
                n3 = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            n1 = valor2;
            if (valor1 <= valor3) {
                n2 = valor1;
                n3 = valor3;
            } else {
                n2 = valor3;
                n3 = valor1;
            }
        } else { // valor3 é o n1
            n1 = valor3;
            if (valor1 <= valor2) {
                n2 = valor1;
                n3 = valor2;
            } else {
                n2 = valor2;
                n3 = valor1;
            }
        }

        System.out.println("=======================================================");
        System.out.println("\n            Valores em ordem crescente:");
        System.out.println("                "+n1 + ", " + n2 + ", " + n3);
        System.out.println("=======================================================");
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
