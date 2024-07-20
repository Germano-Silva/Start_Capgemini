package aulas;

import java.io.IOException;

public class Aula_4_F_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();

        int idade = 0;
        float cotacaoDolar = 5.0f;
        double cotacaoEuro = 6.0d;
        char genero = 'm';
        byte ponto = 0;
        boolean estaCadastro = false;
        String nome = "Germano";

        System.out.println(idade);
        System.out.println(cotacaoDolar);
        System.out.println(cotacaoEuro);
        System.out.println(genero);
        System.out.println(ponto);
        System.out.println(estaCadastro);
        System.out.println(nome);

        int a = 10;
        int b = 5;
        
        int soma = a + b; // soma = 15
        int subtracao = a - b; // subtracao = 5
        int multiplicacao = a * b; // multiplicacao = 50
        int divisao = a / b; // divisao = 2
        int modulo = a % b; // modulo = 0
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        
        int c = 5;
        int incremento = c++; // incremento = 5
        int decremento = c--; // decremento = 6
        
        System.out.println("Incremento: " + incremento);
        System.out.println("Decremento: " + decremento);
        
    }

    public static void clearScreen() throws IOException, InterruptedException {
        try {
            new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }

}
