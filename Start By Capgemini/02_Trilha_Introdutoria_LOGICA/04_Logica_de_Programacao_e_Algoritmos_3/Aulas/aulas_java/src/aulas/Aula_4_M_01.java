package aulas;

import java.io.IOException;
import java.util.Scanner;

public class Aula_4_M_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        /**
            A estrutura de repetição while é usada em Java para executar um bloco de código
            repetidamente enquanto uma condição específica for verdadeira.

            while (condição) {
                // bloco de código a ser repetido
            }

            Condição: É uma expressão booleana que determina se a repetição continuará ou não.
            Enquanto a condição for verdadeira, o bloco de código dentro do while será executado.
            Por exemplo, i < 5.

            
        */

        int condicao = 2;

        Scanner leitor = new Scanner(System.in);
        
        while (condicao > 0) {
            String nome = leitor.nextLine();
            int idade = leitor.nextInt();
            leitor.nextLine(); // Adicione esta linha para consumir a quebra de linha pendente
            System.out.println("O nome do aluno é: " + nome + " e a sua idade é: " + idade);
            condicao = condicao - 1;
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
