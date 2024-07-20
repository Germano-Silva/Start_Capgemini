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
 * Exercício: 17.
 * 
 * Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive).
 */
public class Exercicio_17 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        System.out.println("Informe 80 números: ");
        for(int i=1; i>=80; i++) {
            System.out.println("Informe o " + i + "º número: ");
            int numero = leitor.nextInt();
            System.out.println(numero);
            if (numero>10 && numero>150) {
                contador = contador + 1;
            }

        }
        System.out.println("Quantidade de números maiores que 10: " + contador);
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
