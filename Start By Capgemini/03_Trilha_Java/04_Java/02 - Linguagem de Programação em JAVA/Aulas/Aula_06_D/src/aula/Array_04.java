package aula;

import javax.swing.JOptionPane;

public class Array_04 {

	public static void main(String[] args) {
		//declarando o array
		int [] numeros = new int[10];

		//abastecendo o array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}

		//imprimindo o array
		for (int listaNumeros: numeros) {
			System.out.println(listaNumeros);
		}

		//criando uma variavel para armazenar um valor
		int valor = 11;
		//sobrescrevendo um valor ao array
		numeros[8] = valor;
		//imprimindo o array
		for (int listaNumeros: numeros) {
			System.out.println(listaNumeros);
		}
	}

}
