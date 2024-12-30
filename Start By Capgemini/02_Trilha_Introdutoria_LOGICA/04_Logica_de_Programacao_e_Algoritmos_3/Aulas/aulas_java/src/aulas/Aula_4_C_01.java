package aulas;

import java.io.IOException;

public class Aula_4_C_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        System.out.println("Hello, World!");
        System.out.println("Meu segundo comando de saida!");
    }
    
    public static void clearScreen() throws IOException, InterruptedException {
        try {
            new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }

}
