package aula;

public class CondicionalSwitchCase {

	public static void main(String[] args) {
		//Condicionais com Switch Case
		//menu de escolhas 

		int opcao = 2;

		switch (opcao) {
		case 1 -> System.out.println("Adicionando um novo contato");
		case 2 -> System.out.println("Listando todos os contatos");
		case 3 -> System.out.println("Removendo um contato");
		default -> System.out.println("Opção inválida");
		}

	}

}
