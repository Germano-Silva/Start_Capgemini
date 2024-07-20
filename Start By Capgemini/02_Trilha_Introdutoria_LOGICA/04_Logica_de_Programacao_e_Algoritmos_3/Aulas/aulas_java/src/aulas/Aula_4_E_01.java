package aulas;

import java.io.IOException;
import java.util.Scanner;


public class Aula_4_E_01 {
    public static void main(String[] args) throws Exception{
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numeroInteiro = leitor.nextInt();

        System.out.println("Digite um número decimal:");
        double numeroDecimal = leitor.nextDouble();

        System.out.println("Digite um caractere:");
        String caracteres = leitor.next();

        System.out.println("Digite true ou false:");
        boolean booleano = leitor.nextBoolean();

        // Saída de dados
        System.out.println("\nValores digitados:");

        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Caracteres: " + caracteres);
        System.out.println("Booleano: " + booleano);

        // Exemplos adicionais
        byte byteVar = 100;
        short shortVar = 1000;
        long longVar = 1000000000L;
        float floatVar = 3.14f;

        System.out.println("\nOutros tipos de variáveis:");

        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);

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
