package cadastro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados e as operações básicas como
 * consultas, comandos preparados e chamadas de procedimentos armazenados.
 * Camada DAO (Data Access Object)
 */
public class DAO {
    // Objeto de conexão com o banco de dados.
    Connection conexao;

    // Objeto utilizado para criar comandos SQL preparados (insert, update, delete, select).
	// A sigla stmt é uma abreviação de "statement" (declaração ou instrução em inglês).
    PreparedStatement stmt;

    // Objeto utilizado para armazenar o resultado de consultas SQL (select).
	//A sigla rs é uma abreviação de "ResultSet" (conjunto de resultados em inglês).
    ResultSet rs;

    // Objeto utilizado para chamar procedimentos e funções armazenados no banco de dados.
	// A sigla call vem de "callable" indica que é algo que pode ser invocado ou chamado..
    CallableStatement call;

    /** 
	 * Método responsável por abrir a conexão com o banco de dados.
     * @throws Exception Caso ocorra algum erro ao carregar o driver ou ao conectar.
     */
    public void open() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/cadastros"; // URL do banco de dados
        String user = "postgres"; // Usuário do banco
        String password = "Seilaputis?1"; // Senha do banco
		
		/**
		 * Tenta estabelecer uma conexão com o banco de dados PostgreSQL 
		 * usando as credenciais fornecidas.
		 * 
		 * - Carrega o driver do PostgreSQL necessário para a conexão.
		 * - Estabelece a conexão com o banco de dados usando a URL, usuário e senha fornecidos.
		 * - Exibe uma mensagem de sucesso caso a conexão seja bem-sucedida.
		 * - Captura e exibe uma mensagem de erro caso ocorram exceções durante o processo,
		 *  como falha na conexão
		 *   ou ausência do driver necessário.
		 */
		try {
            // Carrega o driver do PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Estabelece a conexão com o banco de dados
            conexao = DriverManager.getConnection(url, user, password);

			// Exibe a mensagem de sucesso após a conexão ser estabelecida
			System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
			
		// Capitura a mensagem de erro
		// 1. SQLException: Erros relacionados ao acesso ou interação com o banco de dados,
		// como falha de conexão ou comandos inválidos.
		// 2. ClassNotFoundException: Erro que ocorre quando a classe do driver JDBC necessário
		// (neste caso, o driver PostgreSQL) não é encontrada no classpath.
        } catch (SQLException | ClassNotFoundException ex) {
			// Exibe a mensagem de erro caso ocorra uma exceção durante a conexão
            System.out.println("Erro ao conectar com o banco");
        }
    }

    /**
     * Método responsável por fechar a conexão com o banco de dados.
     * @throws Exception Caso ocorra algum erro ao fechar a conexão.
     */
    public void close() throws Exception {
        conexao.close();
    }
}
