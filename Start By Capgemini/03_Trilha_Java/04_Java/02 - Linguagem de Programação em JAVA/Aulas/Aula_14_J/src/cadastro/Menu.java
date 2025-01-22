package cadastro;

import java.util.List;

public class Menu {
	public static void main(String[] args) {
		// Criando um novo objeto DAO
		DAO dao = new DAO();
		try {
			dao.open();
			System.out.println("Conexão bem-sucedida!");
		} catch (Exception e) {
			e.printStackTrace();
		}

        // Consultar uma pessoa individual
		PessoaDAO pd = new PessoaDAO();
		try {
			// Incluir uma pessoa
			/*
			Pessoa p1 = new Pessoa(1,"jose", "jose@gmail.com");
			Pessoa p2 = new Pessoa(2,"joao", "joao@gmail.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
		
			*/
			// Alterar uma pessoa
			// - Alterar a informação desejada usando o set(Classe encapsulada)
			try {
				Pessoa pes = pd.consultarPessoaIndividual(3);
			
				// se o resultado da consulta a pessoa retornar null é porque não encontrou
				// a pessoa
				if (pes != null) {
						pes.setEmail_pessoa("joao2@gmail.com");
						// chamar o método de contém o comando update
						pd.alterarPessoa(pes);
				} else {
					System.out.println("Pessoa não encontrada ou falha no acesso ao banco de dados");
				}
		
				// Listando todas as pessoas
				List<Pessoa> listaPessoas = pd.ListarPessoas();
				for(Pessoa p : listaPessoas){
					System.out.println("Id : " + p.getId_pessoa());
					System.out.println("Nome : "  + p.getNome_pessoa());
					System.out.println("E-mail : " + p.getEmail_pessoa());
				}
			}catch (Exception ex ){
		        System.out.println("Alguma coisa deu errado no acesso ao banco de dados. Contate a TI");
			}

			/*
			// Excluir uma pessoa    
			// verificar se a pessoa existe por c�digo
			Pessoa pessoa1 = pd.consultarPessoaIndividual(1);
			// chamar o m�todo que cont�m o comando delete
			pd.excluirPessoa(pessoa1);
			// Listando todas as pessoas
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			for(Pessoa p : listaPessoas){
				System.out.println("Id.: " + p.getIdPessoa());
				System.out.println("Nome : "  +p.getNomePessoa());
				System.out.println("Email : " +p.getEmail());
			}
			*/
			
		} catch (Exception e) {
			System.out.println("Error:  " + e.getMessage());
		}		
		
	}

}
