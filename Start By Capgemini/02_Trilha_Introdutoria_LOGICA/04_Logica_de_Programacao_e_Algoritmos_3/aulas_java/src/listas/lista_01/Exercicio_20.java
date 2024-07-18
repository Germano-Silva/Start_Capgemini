package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 20.
 * 
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
 * Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros.
 * O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%.
 * O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja:
 * “(N) Não”. Informar total de carros com ano até 2000 e total geral.
 */
public class Exercicio_20 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        double desconto = 0.0;
        double valorTotal = 0.0;
        boolean sair = true;
        String opcao;
        
        while (sair) {
          System.out.println("╔════════════════════════════════════════════╗");
          System.out.println("║           Bem-vindo ao sistema             ║");
          System.out.println("║              CARANGO VELHO                 ║");
          System.out.println("╚════════════════════════════════════════════╝");
          System.out.println();
          System.out.println("══════════ Desconto (D) Sair (S) ═════════════");
          opcao = leitor.next();
          if(opcao.equals("D")){
            System.out.println("Informe o nome do veiculo: ");
            String veiculo = leitor.next();
            System.out.println("Informe o ano do veiculo: ");
            int ano = leitor.nextInt();
            System.out.println("Informe o valor do veiculo: ");
            double valor = leitor.nextDouble();
            
              if (ano>2000) {
                desconto = valor * 0.07;
                System.out.println("Veiculo: " + veiculo);
                System.out.println("Valor do desconto: 7% R$" + desconto);
                valorTotal = valor - desconto;
                System.out.println("Valor total do veiculo com desconto: " + valorTotal);
              } else {
                desconto = valor * 0.12;
                System.out.println("Veiculo: " + veiculo);
                System.out.println("Valor do desconto: 12% R$" + desconto);
                valorTotal = valor - desconto;
                System.out.println("Valor total do veiculo com desconto: " + valorTotal);
                
              }
          }else if(opcao.equals("S")){
            System.out.println();
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║           Obrigado por utilizar o          ║");
            System.out.println("║            sistema CARANGO VELHO           ║");
            System.out.println("╚════════════════════════════════════════════╝");
            sair = false;
          }else{
            System.out.println();
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║                Opção invalida              ║");
            System.out.println("╚════════════════════════════════════════════╝");
  
          }
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
