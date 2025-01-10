package aula;

public class LacoDeRepeticaoComandoBreack {

	public static void main(String[] args) {
		
		// Comando break
		// O comando break é utilizado para interromper a execução de um laço de repetição.
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				System.out.println("Achou o número 5");
				break;
			}
			System.out.println("Estou fazendo  " + i + "ª vez");
		}
		
		System.out.println("Fim do programa");

	}

}
