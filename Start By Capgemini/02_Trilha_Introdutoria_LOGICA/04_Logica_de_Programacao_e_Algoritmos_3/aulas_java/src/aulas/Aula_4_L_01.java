package aulas;

import java.io.IOException;

public class Aula_4_L_01 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        
    
      /**
     *   for (inicialização; condição; iteração) {
     *        [bloco de código a ser repetido]
     *   }
     *   
     *   Inicialização: É onde você define e inicializa uma variável de controle. Geralmente,
     *   é aqui que você declara e atribui um valor inicial à variável que será usada para controlar
     *   o número de repetições. Por exemplo, int i = 0;.
     *   
     *   Condição: É uma expressão booleana que determina se a repetição continuará ou não.
     *   Enquanto a condição for verdadeira, o bloco de código dentro do for será executado.
     *   Por exemplo, i < 5;.
     *   
     *   Iteração: É onde você atualiza o valor da variável de controle após cada repetição. Geralmente,
     *   é aqui que você incrementa ou decrementa a variável. Por exemplo, i++ ou i--.
     *   
     */
        for (int i = 0; i < 5; i++) {
            System.out.println("Repetição número " + (i+1));
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
