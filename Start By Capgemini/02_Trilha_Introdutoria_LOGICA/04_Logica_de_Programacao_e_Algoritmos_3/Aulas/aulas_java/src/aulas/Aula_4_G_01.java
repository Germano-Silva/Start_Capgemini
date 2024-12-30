package aulas;

import java.io.IOException;

public class Aula_4_G_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();
                int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
//=====================================================================
        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
//=====================================================================
        int idade2 = 18;
        String status = (idade2 >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status);
        
    }

    public static void clearScreen() throws IOException, InterruptedException {
        try {
            new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }

}
