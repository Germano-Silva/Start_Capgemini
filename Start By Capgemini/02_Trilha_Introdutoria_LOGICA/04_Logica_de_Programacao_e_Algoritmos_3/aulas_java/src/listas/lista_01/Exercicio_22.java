package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 22.
 * 
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
 * Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
 * Informe o valor de custo de cada produto, o valor de venda de cada produto,
 * a média de preço de custo e do preço de venda.
 */
public class Exercicio_22 {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
  
        
  
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
