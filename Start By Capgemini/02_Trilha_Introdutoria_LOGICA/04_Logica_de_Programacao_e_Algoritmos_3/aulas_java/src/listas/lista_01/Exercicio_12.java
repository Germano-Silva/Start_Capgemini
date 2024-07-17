package listas.lista_01;

/**
 * Códigos realizados por Germano Silva.
 * GitHub: {@literal https://github.com/Germano-Silva}
 * LinkedIn: {@literal https://www.linkedin.com/in/germanorodriguessilva/}
 * Todos os direitos autorais são reservados a Germano Silva.
 */

/**
 * Exercício: 12.
 * 
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados 
 * (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo 
 * que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e 
 * informe o custo ao consumidor do mesmo
 */
public class Exercicio_12 {
    
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o preço de custo do carro para a fabrica: R$ ");
        double custoFabrica = leitor.nextDouble();
        double imposto = custoFabrica*(45/100);
        double percentualDistribuidor = custoFabrica*(28/100);
        System.out.print("São 45% de impostos aplicados no valor de: R$" + imposto );
        double percentualAcrescimo = leitor.nextDouble();
        double valorVenda = precoCusto * (1 + percentualAcrescimo / 100);
        System.out.println("O valor de venda do produto é: R$ " + valorVenda);
        leitor.close();

}
