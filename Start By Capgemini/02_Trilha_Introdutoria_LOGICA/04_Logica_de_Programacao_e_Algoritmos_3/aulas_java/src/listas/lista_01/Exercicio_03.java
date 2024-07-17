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
  * Exercício: 03.
  *  
  * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida
  * a distância total percorrida pelo automóvel e o total de combustível gasto
  */

public class Exercicio_03 {
  public static void main(String[] args) throws Exception {
    clearScreen();
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe a distancia total: ");
    float distanciaTotal = leitor.nextFloat();
    System.out.println("Informe o combustivel gasto: ");
    float combustivelGasto = leitor.nextFloat();
    float media = combustivelGasto/distanciaTotal;
    System.out.println("O consumo medio por km é " + media);
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
