package cadastros;

import java.util.List;

public class Menu {

	public static void main(String[] args) {
	    PessoaDao pd = new PessoaDao();

	    try {
	        // Incluir pessoas
	        incluirPessoa(pd, new Pessoa(1, "jose", "jose@gmail.com"));
	        incluirPessoa(pd, new Pessoa(2, "joao", "joao@gmail.com"));

	        // Alterar pessoa
	        alterarPessoa(pd, 3, "joao2@gmail.com");

	        // Listar todas as pessoas
	        listarPessoas(pd);

	        // Excluir pessoa
	        excluirPessoa(pd, 1);

	        // Listar todas as pessoas novamente
	        listarPessoas(pd);

	    } catch (Exception e) {
	        System.out.println("Erro: " + e.getMessage());
	    }
	}

	private static void incluirPessoa(PessoaDao pd, Pessoa pessoa) {
	    try {
	        pd.incluirPessoa(pessoa);
	        System.out.println("Pessoa adicionada: " + pessoa.getNomePessoa());
	    } catch (Exception e) {
	        System.out.println("Erro ao incluir pessoa: " + e.getMessage());
	    }
	}

	private static void alterarPessoa(PessoaDao pd, int id, String novoEmail) {
	    try {
	        Pessoa pessoa = pd.consultarPessoaIndividual(id);
	        if (pessoa != null) {
	            pessoa.setEmail(novoEmail);
	            pd.alterarPessoa(pessoa);
	            System.out.println("Pessoa alterada: ID " + pessoa.getIdPessoa() + ", novo email: " + novoEmail);
	        } else {
	            System.out.println("Pessoa não encontrada para alteração. ID: " + id);
	        }
	    } catch (Exception e) {
	        System.out.println("Erro ao alterar pessoa: " + e.getMessage());
	    }
	}

	private static void listarPessoas(PessoaDao pd) {
	    try {
	        List<Pessoa> listaPessoas = pd.ListarPessoas();
	        if (listaPessoas.isEmpty()) {
	            System.out.println("Nenhuma pessoa encontrada.");
	        } else {
	            listaPessoas.forEach(p -> {
	                System.out.println("Id.: " + p.getIdPessoa());
	                System.out.println("Nome: " + p.getNomePessoa());
	                System.out.println("Email: " + p.getEmail());
	                System.out.println("----------------------");
	            });
	        }
	    } catch (Exception e) {
	        System.out.println("Erro ao listar pessoas: " + e.getMessage());
	    }
	}

	private static void excluirPessoa(PessoaDao pd, int id) {
	    try {
	        Pessoa pessoa = pd.consultarPessoaIndividual(id);
	        if (pessoa != null) {
	            pd.excluirPessoa(pessoa);
	            System.out.println("Pessoa excluída: " + pessoa.getNomePessoa());
	        } else {
	            System.out.println("Pessoa não encontrada para exclusão. ID: " + id);
	        }
	    } catch (Exception e) {
	        System.out.println("Erro ao excluir pessoa: " + e.getMessage());
	    }
	}


}
