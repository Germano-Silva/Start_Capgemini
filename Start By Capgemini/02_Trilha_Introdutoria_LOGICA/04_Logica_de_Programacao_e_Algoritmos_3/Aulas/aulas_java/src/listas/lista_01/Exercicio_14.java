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
 * Exercício: 14.
 * 
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.
 */
public class Exercicio_14 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: "); 
        int numero1 = leitor.nextInt();
        System.out.println("Informe o segundo valor: ");
        int numero2 = leitor.nextInt();
        
        if (numero1>numero2) {
            System.out.println("O primeiro valor é maior que o segundo!");
        } else {
            System.out.println("O Segundo valor é maior que o primeiro!");
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
