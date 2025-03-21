package embarque;

import controle.AeronaveGenerics;
import java.util.Scanner;

/*
 * Informar a quantidade de aeronaves no pátio, o nr dos vóos por ordem de chegada. 
 * A ordem de decolagem é FIFO, o primeiro que entra é o primeiro que sai. 
 * Mostrar qual o primeiro vóo á decolar
 */

public class PrincipalGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Criação de objeto AeronaveGenerics para armazenar números inteiros
        AeronaveGenerics<Integer> air = new AeronaveGenerics<>();

        // Solicitação do número de aeronaves
        System.out.println("Informe o número de aeronaves:");
        int nrAeronaves = sc.nextInt();

        // Adicionando números dos voos
        for (int i = 0; i < nrAeronaves; i++) {
            System.out.println("Informe o número do voo:");
            int nrVoo = sc.nextInt();
            air.addVoo(nrVoo);
        }

        // Exibindo o primeiro voo a decolar
        try {
            Integer primeiroVoo = air.primeiroVoo();
            System.out.println("O primeiro voo a decolar é: " + primeiroVoo);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Listando todos os voos
        System.out.print("Lista de voos na ordem de chegada: ");
        air.listaVoos();

        // Fechando o scanner
        sc.close();

	}

}
