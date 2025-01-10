
public class OperadoresRelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// >, <, >=, <=, ==, !=
		int numero1 = 10;
		int numero2 = 20;
		boolean resultado;

		// Maior
		resultado = numero1 > numero2;
		System.out.println("Maior: " + resultado);

		// Menor
		resultado = numero1 < numero2;
		System.out.println("Menor: " + resultado);


		// Maior ou igual
		resultado = numero1 >= numero2;
		System.out.println("Maior ou igual: " + resultado);


		// Menor ou igual
		resultado = numero1 <= numero2;
		System.out.println("Menor ou igual: " + resultado);


		// igual
		resultado = numero1 == numero2;
		System.out.println("Igual: " + resultado);

		// diferente
		resultado = numero1 != numero2;
		System.out.println("Diferente: " + resultado);

		System.out.println("--------------------------------------------------");
//--------------------------------------------------------------------------------------------
		// Operadores Lógicos
		//testando com if e else


		// Maior
		if (numero1 > numero2) {
			System.out.println("Numero 1 é maior que numero 2");
		} else {
			System.out.println("Numero 1 não é maior que numero 2");
		}

		// Menor
		if (numero1 < numero2) {
			System.out.println("Numero 1 é menor que numero 2");
		} else {
			System.out.println("Numero 1 não é menor que numero 2");
		}

		// Maior ou igual
		if (numero1 >= numero2) {
			System.out.println("Numero 1 é maior ou igual que numero 2");
		} else {
			System.out.println("Numero 1 não é maior ou igual que numero 2");
		}

		// Menor ou igual
		if (numero1 <= numero2) {
			System.out.println("Numero 1 é menor ou igual que numero 2");
		} else {
			System.out.println("Numero 1 não é menor ou igual que numero 2");
		}

		// igual
		if (numero1 == numero2) {
			System.out.println("Numero 1 é igual a numero 2");
		} else {
			System.out.println("Numero 1 não é igual a numero 2");
		}

		// diferente
		if (numero1 != numero2) {
			System.out.println("Numero 1 é diferente de numero 2");
		} else {
			System.out.println("Numero 1 não é diferente de numero 2");
		}


	}

}
