package aula;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// Laço de repetição do while laço pós teste

		int contador = 0;

		do {
			System.out.println("Contador: " + contador);
			contador++;
		} while (contador <= 10);

		System.out.println("Fim do laço e estou com o valor" + contador);

	}

}
