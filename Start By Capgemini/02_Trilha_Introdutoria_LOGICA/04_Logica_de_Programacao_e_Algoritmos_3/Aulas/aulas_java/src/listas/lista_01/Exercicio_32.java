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
  * Exercício: 32.
  * 
  * Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
  * Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade:
  * o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
  *
  * a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
  * b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
  * c. Triângulo equilátero é também isóscele;
  * d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.
  */
  
public class Exercicio_32 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("           Digite os três lados do triângulo:          ");
        System.out.println("=======================================================");
        System.out.println();
        System.out.print("Lado 1: ");
        int l1 = leitor.nextInt();
        System.out.print("Lado 2: ");
        int l2 = leitor.nextInt();
        System.out.print("Lado 3: ");
        int l3 = leitor.nextInt();

        
        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
            System.out.println("=======================================================");
            System.out.println("              Os lados formam um triângulo.            ");
            System.out.println("=======================================================");
            if (l1 == l2 && l1 == l3) {
                System.out.println("=======================================================");
                System.out.println("               É um triângulo Equilátero.              ");
                System.out.println("=======================================================");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("=======================================================");
                System.out.println("                É um triângulo Isóscele.               ");
                System.out.println("=======================================================");
            } else {
                System.out.println("=======================================================");
                System.out.println("                É um triângulo Escaleno.               ");
                System.out.println("=======================================================");
            }
        } else {
            System.out.println("=======================================================");
            System.out.println("        Não forma um triângulo, tente novamente.       ");
            System.out.println("=======================================================");
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
