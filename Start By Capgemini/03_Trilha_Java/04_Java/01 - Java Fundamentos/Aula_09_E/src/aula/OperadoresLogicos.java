package aula;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// Operadores Lógicos
		// &&, ||, !
		int numero1 = 10;
		int numero2 = 20;

		System.out.println("--------------------------------------------------");

		// E
		if (numero1 > 5 && numero2 > 5) {
			System.out.println("Os dois números são maiores que 5.");
		} else {
			System.out.println("Um dos numeros não é maior que 5 ou nenhum dos dois numeros é maior que 5.");
		}

		// OU
		if (numero1 > 5 || numero2 > 5) {
			System.out.println("Pelo menos um dos números é maior que 5.");
		} else {
			System.out.println("Nenhum dos números é maior que 5.");
		}

		// Negação
		if (!(numero1 > 5)) {
			System.out.println("Número 1 é menor que 5.");
		} else {
			System.out.println("Número 1 é maior que 5.");
		}

		System.out.println("--------------------------------------------------");

	}

}
