package listas.lista_01;
/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

import java.io.IOException;
import java.util.Scanner;

/**
 * Exercício: 13.
 * 
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10.
 */

public class Exercicio_13 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = leitor.nextInt();
        if (numero<10) {
            System.out.println("É menor que 10!");
        } else {
            System.out.println("É maior que 10!");
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
