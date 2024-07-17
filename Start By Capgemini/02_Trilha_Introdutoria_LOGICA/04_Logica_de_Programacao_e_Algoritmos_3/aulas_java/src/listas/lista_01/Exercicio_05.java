package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

 /**
  * Exercício: 05.
  * 
  * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve 
  * no semestre. No final informar o nome do aluno e a sua média (aritmética).
  */

public class Exercicio_05 {
  public static void main(String[] args) throws Exception {
        clearScreen();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a o nome do aluno: ");
        String nomeAluno = leitor.nextLine();
        System.out.println("Informe o nota da 1ª prova: ");
        float nota1 = leitor.nextFloat();
        System.out.println("Informe o nota da 2ª prova: ");
        float nota2 = leitor.nextFloat();
        System.out.println("Informe o nota da 3ª prova: ");
        float nota3 = leitor.nextFloat();
        float media = (nota1 + nota2 + nota3)/3;
        System.out.println("O aluno: " + nomeAluno + " possui a média de " + media);
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
