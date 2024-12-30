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
  * Exercício: 35.
  * 
  * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
  *
  * Tipo de Cliente Valor do KW/h
  *
  * a. (Residência) 0,60;
  * b. (Comércio) 0,48;
  * c. (Indústria) 1,29.
  */

public class Exercicio_35 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);

    System.out.println("Escolha o tipo de cliente:");
    System.out.println("1 - Residência (R$0,60 por kWh)");
    System.out.println("2 - Comércio (R$0,48 por kWh)");
    System.out.println("3 - Indústria (R$1,29 por kWh)");
    System.out.print("Digite o número correspondente ao tipo de cliente: ");
    int cliente = leitor.nextInt();

    double valor = 0.0;

    switch (cliente) {
        case 1:
            valor = 0.60;
            break;
        case 2:
            valor = 0.48;
            break;
        case 3:
            valor = 1.29;
            break;
        default:
            System.out.println("Opção inválida. Escolha um número de 1 a 3.");
            break;
    }

    if (cliente >= 1 && cliente <= 3) {
        System.out.print("Digite a quantidade de kWh consumidos: ");
        double consumo = leitor.nextDouble();

        double valorConta = valor * consumo;

        if (cliente==1) {
          System.out.println("Tipo de Cliente: Residencial.");
        } else if(cliente==2) {
          System.out.println("Tipo de Cliente: Comercial.");
        }else{
          System.out.println("Tipo de Cliente: Industrial.");
        }
        System.out.println("Consumo de kWh: " + consumo);
        System.out.println("Valor da conta de luz: R$" + valorConta);
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
