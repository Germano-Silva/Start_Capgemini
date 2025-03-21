package cadastro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	Connection con;  // Conexao ao Banco de Dados
	PreparedStatement stmt; // Acessa a Tabela ( insert, update, delete , select)
	ResultSet rs; // Consulta a Tabela( select )
	CallableStatement call; // Procedures e Function
	
    public void open() throws Exception{
	    String url = "jdbc:postgresql://localhost:5432/cadastros";
	    String user = "postgres";
	    String password = "Seilaputis?1";
	    try {
	    	Class.forName("org.postgresql.Driver");
	        con = DriverManager.getConnection(url, user, password);
	        System.out.println("Banco conectado com sucesso!");
	    } catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace(); // Mostra detalhes do erro
			System.out.println("Erro ao conectar com o banco: " + ex.getMessage());
		}
	}
	
	public void close() throws Exception {
		if (con != null && !con.isClosed()) {
			con.close();
		}
	}
}
