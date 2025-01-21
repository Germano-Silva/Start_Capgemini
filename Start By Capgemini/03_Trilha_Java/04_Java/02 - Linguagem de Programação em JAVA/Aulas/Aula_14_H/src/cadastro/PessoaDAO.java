package cadastro;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO extends DAO{
	
	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoas values(?,?,?)");
		stmt.setInt(1, p.getId_Pessoa());
		stmt.setString(2, p.getNome_Pessoa());
		stmt.setString(3, p.getEmail_Pessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	
	public void alterarPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update pessoas set nome_pessoa = ?, email_pessoa = ? where id_pessoa = ?");
		stmt.setString(1, p.getNome_Pessoa());
		stmt.setString(2, p.getEmail_Pessoa());
		stmt.setInt(3, p.getId_Pessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoa p) throws Exception {

		open();
		stmt = con.prepareStatement("delete from pessoas where id_pessoa = ?");
		stmt.setInt(1, p.getId_Pessoa());
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
			Pessoa p = null;
			if (rs != null) {
				if (rs.next()) {
					p = new Pessoa();
					p.setId_Pessoa(rs.getInt("id_pessoa"));
					p.setNome_Pessoa(rs.getString("nome_pessoa"));
					p.setEmail_Pessoa(rs.getString("email_pessoa"));				
				}
			}
			close();
			return p;
	}

	public List<Pessoa> ListarPessoas() {
		try {
			open();
			stmt = con.prepareStatement("select * from pessoas");
			rs = stmt.executeQuery();
	        List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setId_Pessoa(rs.getInt("id_pessoa"));
				p.setNome_Pessoa(rs.getString("nome_pessoa"));
				p.setEmail_Pessoa(rs.getString("email_pessoa"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
