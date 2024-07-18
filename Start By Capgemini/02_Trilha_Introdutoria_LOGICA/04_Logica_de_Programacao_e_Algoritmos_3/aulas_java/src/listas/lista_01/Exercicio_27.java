package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 27.
 * 
 * A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
 * Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
 * O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
 * (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados.
 * Informe total de desconto e total pago pelos clientes.
 */
public class Exercicio_27 {
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
