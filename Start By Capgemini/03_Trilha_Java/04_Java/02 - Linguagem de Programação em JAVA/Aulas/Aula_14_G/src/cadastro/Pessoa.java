package cadastro;

public class Pessoa {
	private int id_pessoa;
	private String nome_Pessoa;
	private String email_Pessoa;
	
	public Pessoa() {
	}

	@Override
	public String toString() {
		return "Pessoa [id_pessoa=" + id_pessoa + ", nome_Pessoa=" + nome_Pessoa + ", email_Pessoa=" + email_Pessoa
				+ "]";
	}

	public Pessoa(int id_pessoa, String nome_Pessoa, String email_Pessoa) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome_Pessoa = nome_Pessoa;
		this.email_Pessoa = email_Pessoa;
	}

	public Pessoa(String nome_Pessoa, String email_Pessoa) {
		super();
		this.nome_Pessoa = nome_Pessoa;
		this.email_Pessoa = email_Pessoa;
	}
	
	public int getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public String getNome_Pessoa() {
		return nome_Pessoa;
	}
	public void setNome_Pessoa(String nome_Pessoa) {
		this.nome_Pessoa = nome_Pessoa;
	}
	public String getEmail_Pessoa() {
		return email_Pessoa;
	}
	public void setEmail_Pessoa(String email_Pessoa) {
		this.email_Pessoa = email_Pessoa;
	}
	
	

}
