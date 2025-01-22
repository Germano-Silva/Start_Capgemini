package cadastros;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao {
	
	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}

	
	public void alterarPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update pessoa set nomepessoa = ?, email = ? where idpessoa = ?");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoa p) throws Exception {

		open();
		stmt = con.prepareStatement("delete from pessoa where idpessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();

	}
	// retornando um objeto
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
			open();
			stmt = con.prepareStatement("select * from pessoa where idpessoa = ? ");
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
					p.setIdPessoa(rs.getInt("idpessoa"));
					p.setNomePessoa(rs.getString("nomepessoa"));
					p.setEmail(rs.getString("email"));				
				}
			}
			close();
			return p;
	}

	public List<Pessoa> ListarPessoas() {
		try {
			open();
			stmt = con.prepareStatement("select * from pessoa");
			rs = stmt.executeQuery();
	        List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt("idpessoa"));
				p.setNomePessoa(rs.getString("nomepessoa"));
				p.setEmail(rs.getString("email"));
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
