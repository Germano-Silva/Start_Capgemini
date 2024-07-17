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
  * Exercício: 16.
  * 
  * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
  * Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
  * Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).
  */
  
public class Exercicio_16 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
    System.out.print("Informe sue nome: ");
    String nome = leitor.nextLine();
    System.out.println("Informe a sua 1ª nota: ");
    double nota1 = leitor.nextDouble();
    System.out.println("Informe a sua 2ª nota: ");
    double nota2 = leitor.nextDouble();
    System.out.println("Informe a sua 3ª nota: ");
    double nota3 = leitor.nextDouble();
    double media = (nota1+nota2+nota3)/3;
    if (media>=5.1 && media<=6.9) {
      System.out.println("Aluno(a): "+ nome + " nota: " + media);
      System.out.println("Recuperação!");
    } else if (media <=5) {
      System.out.println("Reprovado!");
    }else {
      System.out.println("Aprovado!");
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
