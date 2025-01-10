package aula;

public class IncrementacaoDecrementacao {

	public static void main(String[] args) {
		int resultado = 0;

		System.out.println("-----------------------------------");
		//incrementação
		while (resultado <= 10) {
			resultado++;
			System.out.println("Resultado: " + resultado);
			
		}

		System.out.println("-----------------------------------");
		resultado = 10;
		//decrementação
		while (resultado >= 0) {
			System.out.println("Resultado: " + resultado);
			resultado--;
		}

	}

}
