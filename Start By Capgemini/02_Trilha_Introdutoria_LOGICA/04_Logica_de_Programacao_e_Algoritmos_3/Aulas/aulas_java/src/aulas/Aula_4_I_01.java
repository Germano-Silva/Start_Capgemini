package aulas;

import java.io.IOException;

public class Aula_4_I_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        int codigoProduto = 2;
        switch (codigoProduto) {
            case 1:
                System.out.println("Produto 1!");
                break;
            case 2:
                System.out.println("Produto 2!");
                break;
            default:
                System.out.println("Produto não cadastrado!");
                
        }
        
    }

    public static void clearScreen() throws IOException, InterruptedException {
        try {
            new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }

}
