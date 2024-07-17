package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

 /**
  * Exercício: 06.
  * 
  * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável 
  * A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. 
  * Apresentar os valores trocados
  */

public class Exercicio_06 {
  public static void main(String[] args) throws Exception {
          clearScreen();
          Scanner leitor = new Scanner(System.in);
          System.out.println("Informe um número: ");
          float numeroA = leitor.nextFloat();
          System.out.println("Informe outro numero: ");
          float numeroB = leitor.nextFloat();
          System.out.println("O 1º número: " + numeroA + " o segundo número " + numeroB);
          float n = numeroA;
          float m = numeroB;
          numeroB = n;
          numeroA = m;
          System.out.println("Trocando  1º número: " + numeroA + " e o segundo número " + numeroB);
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
