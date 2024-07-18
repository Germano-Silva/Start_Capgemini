package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 21.
 * 
 * Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e 
 * informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais
 */
public class Exercicio_21 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
  
        System.out.print("Quantas pessoas serão cadastradas? ");
        int quantidadePessoas = leitor.nextInt();

        int totalAptas = 0;
        int totalNaoAptas = 0;
        int idade;
        String nome, sexo, saude;
          
          for (int i = 1; i <= quantidadePessoas; i++) {

                System.out.println("Pessoa " + i);
                System.out.print("Nome: ");
                nome = leitor.next();

                System.out.print("Sexo (M)Masculino (F)Feminino: ");
                sexo = leitor.next();

                System.out.print("Idade: ");
                idade = leitor.nextInt();

                System.out.print("Saúde (S)Saldavel (D)Doente: ");
                saude = leitor.next();
  
                if (sexo.equalsIgnoreCase("M") && idade >= 18 && saude.equalsIgnoreCase("S")) {
                    System.out.println("Apto para o serviço militar obrigatório");
                    totalAptas++;
                } else {
                System.out.println("Não apto para o serviço militar obrigatório");
                totalNaoAptas++;
                }

              System.out.println();
            }
  
          System.out.println("Total de pessoas aptas: " + totalAptas);
          System.out.println("Total de pessoas não aptas: " + totalNaoAptas);
  
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
