package listas.lista_01;
/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

import java.io.IOException;
import java.util.Scanner;

/**
  * Exercício: 04.
  * 
  * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas
  * efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
  * suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês
  */


public class Exercicio_04 {
    public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe a o nome do vendedor: ");
    String nomeVendendor = leitor.nextLine();
    System.out.println("Informe o salario fixo: ");
    float salarioFixo = leitor.nextFloat();
    System.out.println("Informe o total de vendas: ");
    float totalvendas = leitor.nextFloat();
    float comissao = totalvendas*(15/100);
    float salarioMaisComissao = comissao + salarioFixo;
    System.out.println("O funcionario: " + nomeVendendor + " recebe o salario: R$" + salarioFixo);
    System.out.println("Este mês fez o total em vendas de " + totalvendas+ " e sua comissão é no valor de R$" + comissao);
    System.out.println("O seu salario mais comissão fica no valor de R$" + salarioMaisComissao);
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
