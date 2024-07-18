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
 * Exercício: 19.
 * 
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher.
 * No final informe total de homens e de mulheres
 */
public class Exercicio_19 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int mulher = 0;
        int homem = 0;

        for (int i = 1; i<=56 ; i++) {

          System.out.println("Informe o nome: ");
          String nome = leitor.nextLine();

          System.out.print("Informe o seu sexo biologico (M) Macho (F) Femea: ");
          String sexo = leitor.nextLine();

          if (sexo.equals("M")) {
            System.out.println("Nome: " + nome);
            System.out.println("Sexo biologico: Homen ");
            homem = homem + 1;

          } else if(sexo.equals("F")) {
            System.out.println("Nome: " + nome);
            System.out.println("Sexo biologico: Mulher ");
            mulher = mulher+1;
          }else{
            System.out.println("Sexo informado incorretamente!");
          }

        }
        System.out.println("A quantidade de mulheres é: " + mulher + " A quantidade de homens é: " + homem);
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
