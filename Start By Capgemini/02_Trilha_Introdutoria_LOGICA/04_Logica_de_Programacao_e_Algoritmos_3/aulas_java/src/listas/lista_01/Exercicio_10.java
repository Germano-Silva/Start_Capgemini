package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 10.
 * 
 * A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros.
 * Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.
 */


public class Exercicio_10 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println(" - - - Loja Mamão com Açúcar - - - ");
        System.out.println("===================================");

        System.out.print("Informe o valor total da compra: R$ ");
        float valorTotal = leitor.nextFloat();

        for (int i = 1; i <= 5; i++) {
            float valorParcela = valorTotal / i;
            System.out.printf("Para valor em " + i + " parcela o valor é: R$ %.2f\n", valorParcela);
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
