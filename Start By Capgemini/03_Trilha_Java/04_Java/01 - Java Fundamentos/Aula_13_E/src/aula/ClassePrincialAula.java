package aula;
//Classe principal
public class ClassePrincialAula {
	//Método principal
	public static void main(String[] args) {
		//Instanciando a classe Pessoa e criando um objeto pessoa
		//PessoaAbstracao = nome da classe
		//pessoa = nome do objeto
		//new = palavra reservada para criar um objeto
		//PessoaAbstracao() = construtor da classe
		PessoaAbstracao pessoa = new PessoaAbstracao();
		// Atribuindo valores aos atributos do objeto pessoa
		//pessoa = nome do objeto
		//"." = operador de acesso
		//nome = atributo da classe
		pessoa.nome = "João";
		pessoa.idade = 30;
		
		// Chamando o método mostrarDadosPessoa da classe Pessoa
		pessoa.mostrarDadosPessoa(pessoa.nome, pessoa.idade);

	}

}
