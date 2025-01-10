package aula;

public class ClassePrincipal {

	public static void main(String[] args) {
		// Instanciando a classe Pessoa e criando um objeto pessoa
		Pessoa pessoa = new Pessoa();
		// Atribuindo valores aos atributos do objeto pessoa
		pessoa.nome = "João";
		pessoa.idade = 30;
		
		// Chamando o método mostrarDadosPessoa da classe Pessoa
		pessoa.mostrarDadosPessoa(pessoa.nome, pessoa.idade);

	}

}
