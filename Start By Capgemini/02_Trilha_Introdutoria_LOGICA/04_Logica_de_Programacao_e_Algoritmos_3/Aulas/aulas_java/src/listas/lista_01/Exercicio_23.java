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
 * Exercício: 23.
 * 
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, menor que 25 ou igual a 40.
 */
public class Exercicio_23 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = leitor.nextInt();

        if (numero>80 && numero<25 && numero==40) {
            System.out.println("Cumpre com os requisitos!");
        } else {
            System.out.println("Não cumpre com os requisitos!");
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
