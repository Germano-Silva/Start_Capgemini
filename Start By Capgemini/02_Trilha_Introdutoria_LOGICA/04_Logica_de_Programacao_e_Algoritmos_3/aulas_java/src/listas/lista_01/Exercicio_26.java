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
 * Exercício: 26.
 * 
 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
 * Caso o usuário digite um número  que não esteja neste intervalo,
 * exibir a seguinte mensagem: número inválido.
 */
public class Exercicio_26 {
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
