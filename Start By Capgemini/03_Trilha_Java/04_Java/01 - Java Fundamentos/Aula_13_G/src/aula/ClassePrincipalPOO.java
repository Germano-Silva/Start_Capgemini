package aula;

public class ClassePrincipalPOO {

	public static void main(String[] args) {
		//Instanciando a classe Pessoa e criando um objeto pessoa
		//PessoaAbstracao = nome da classe
		//pessoa = nome do objeto
		//new = palavra reservada para criar um objeto
		//PessoaAbstracao() = construtor da classe
		PessoaAbs pessoa = new PessoaAbs();
		// Atribuindo valores aos atributos do objeto pessoa
		//pessoa = nome do objeto
		//"." = operador de acesso
		//nome = atributo da classe
		//pessoa. = "João";
		//pessoa.idade = 30;

		// Atribuindo valores aos atributos do objeto pessoa
		//usa-se o método setNome e setIdade para atribuir valores aos atributos
		pessoa.setNome("João");
		pessoa.setIdade(30);
		
		//usa-se o getNome e getIdade para pegar os valores dos atributos
		// Chamando o método mostrarDadosPessoa da classe Pessoa
		pessoa.mostrarDadosPessoa(pessoa.getNome(), pessoa.getIdade());

	}

}
