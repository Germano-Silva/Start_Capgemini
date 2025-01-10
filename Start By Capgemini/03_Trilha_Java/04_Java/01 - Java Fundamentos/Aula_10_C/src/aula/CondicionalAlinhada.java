package aula;

public class CondicionalAlinhada {

	public static void main(String[] args) {
		
		// Condicional Composta Alinhada
		int idade = 18;

		if (idade < 16) {
			System.out.println("Não pode votar");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Voto Facultativo");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("Voto Obrigatório");
		} else {
			System.out.println("Voto Facultativo");
		}

	}

}
