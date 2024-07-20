package aulas;

import java.io.IOException;

public class Aula_4_H_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();

        /*
        Igual a: ==
        Verifica se dois valores são iguais.
        
        Diferente de: !=
        Verifica se dois valores são diferentes.
        
        Maior que: >
        Verifica se o valor da esquerda é maior que o valor da direita.
        
        Menor que: <
        Verifica se o valor da esquerda é menor que o valor da direita.
        
        Maior ou igual a: >=
        Verifica se o valor da esquerda é maior ou igual ao valor da direita.
        
        Menor ou igual a: <=
        Verifica se o valor da esquerda é menor ou igual ao valor da direita.

        Em Java, existem três operadores lógicos principais:
        
        "&&" (E lógico)
        O operador "&&" retorna verdadeiro se todas as expressões booleanas envolvidas forem verdadeiras. 
        Caso contrário, retorna falso.
        
        "||" (OU lógico)
        O operador "||" retorna verdadeiro se pelo menos uma das expressões booleanas envolvidas for verdadeira.
        Retorna falso apenas se todas as expressões forem falsas.
        
        "!" (NÃO lógico).
        O operador "!" inverte o valor de uma expressão booleana.
        Se a expressão for verdadeira, o operador "!" a torna falsa, e vice-versa.
        
        Esses operadores são usados para combinar expressões booleanas e realizar operações lógicas.
        */
        
        int media = 7;
        if(media>= 7){
            if(media == 10){
                System.out.println("Aprovado com nota maxima!");
                
            }else{
                System.out.println("Aprovado!");
            }
            
        }else{
            System.out.println("Reprovado!");
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
