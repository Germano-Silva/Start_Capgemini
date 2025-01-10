package aula;

public class ClassePrincipalAulaPOO {

	public static void main(String[] args) {
		// Instanciando um objeto da classe Pessoas
		Pessoas pessoa = new Pessoas();
		pessoa.nome = "Maria";
		pessoa.endereco = "Rua 1";
		pessoa.telefone = "999999999";
		pessoa.status = "Ativo";

		// Instanciando um objeto da classe PessoaFisica
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.nome = "João";
		pessoaFisica.endereco = "Rua 2";
		pessoaFisica.telefone = "888888888";
		pessoaFisica.status = "Inativo";
		pessoaFisica.cpf = "123456789";
		pessoaFisica.registroGeral = "987654321";

		// Instanciando um objeto da classe PessoaJuridica
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.nome = "Empresa";
		pessoaJuridica.endereco = "Rua 3";
		pessoaJuridica.telefone = "777777777";
		pessoaJuridica.status = "Ativo";
		pessoaJuridica.cnpj = "123456789";
		pessoaJuridica.inscricaoEstadual = "987654321";


		// Imprimindo os objetos
		System.out.println(pessoa);
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);
	}

}
