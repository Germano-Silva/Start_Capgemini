package listas.lista_01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

 /**
  * Exercício: 08.
  * 
  * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponíveis com o usuário
  */

public class Exercicio_08 {
  public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe a quanto você tem de dinheiro: ");
    float real = leitor.nextFloat();
    System.out.println("Informe o valor do dólar: ");
    float dolar = leitor.nextFloat();
    float quantidadeDolar = real*dolar;
    System.out.println("A quantidade em dólares é US$ " + quantidadeDolar);
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
