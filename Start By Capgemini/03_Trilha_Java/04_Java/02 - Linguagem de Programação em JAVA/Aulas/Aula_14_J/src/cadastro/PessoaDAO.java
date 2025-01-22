package cadastro;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO extends DAO{
	
	public void incluirPessoa(Pessoa pessoa) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoas values(?,?,?)");
		stmt.setInt(1, pessoa.getId_pessoa());
		stmt.setString(2, pessoa.getNome_pessoa());
		stmt.setString(3, pessoa.getEmail_pessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	
	public void alterarPessoa(Pessoa pessoa) throws Exception {
		open();
		stmt = con.prepareStatement("update pessoas set nome_pessoa = ?, email_pessoa = ? where id_pessoa = ?");
		stmt.setString(1, pessoa.getNome_pessoa());
		stmt.setString(2, pessoa.getEmail_pessoa());
		stmt.setInt(3, pessoa.getId_pessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoa pessoa) throws Exception {

		open();
		stmt = con.prepareStatement("delete from pessoas where id_pessoa = ?");
		stmt.setInt(1, pessoa.getId_pessoa());
		stmt.execute();
		stmt.close();
		close();

	}
	// retornando um objeto
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
			open();
			stmt = con.prepareStatement("select * from pessoas where id_pessoa = ? ");
			stmt.setInt(1, cod);
			try {
				rs = stmt.executeQuery();			
			}
			catch (SQLException ex) {
				throw new Exception(ex);
//		        System.out.println("Falha ao recuperar o registro. Contate TI");
			}
			finally {
				System.out.println("Fechando a conexão com banco de dados no Finally");
				close();
			}
			Pessoa pessoa = null;
			if (rs != null) {
				if (rs.next()) {
					pessoa = new Pessoa();
					pessoa.setId_pessoa(rs.getInt("id_pessoa"));
					pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
					pessoa.setEmail_pessoa(rs.getString("email_pessoa"));				
				}
			}
			close();
			return pessoa;
	}

	public List<Pessoa> ListarPessoas() {
		try {
			open();
			stmt = con.prepareStatement("select * from pessoas");
			rs = stmt.executeQuery();
	        List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setId_pessoa(rs.getInt("id_pessoa"));
				pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
				pessoa.setEmail_pessoa(rs.getString("email_pessoa"));
				listaPessoas.add(pessoa);
			}
			close();
			return listaPessoas;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
