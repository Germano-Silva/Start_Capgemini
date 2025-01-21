package cadastro;

public class Pessoa {
	private int id_Pessoa;
	private String nome_Pessoa;
	private String email_Pessoa;
	
	public Pessoa() {
	}

	@Override
	public String toString() {
		return "Pessoa [id_Pessoa=" + id_Pessoa + ", nome_Pessoa=" + nome_Pessoa + ", email_Pessoa=" + email_Pessoa
				+ "]";
	}

	public Pessoa(int id_Pessoa, String nome_Pessoa, String email_Pessoa) {
		super();
		this.id_Pessoa = id_Pessoa;
		this.nome_Pessoa = nome_Pessoa;
		this.email_Pessoa = email_Pessoa;
	}

	public Pessoa(String nome_Pessoa, String email_Pessoa) {
		super();
		this.nome_Pessoa = nome_Pessoa;
		this.email_Pessoa = email_Pessoa;
	}
	
	public int getId_Pessoa() {
		return id_Pessoa;
	}
	public void setId_Pessoa(int id_Pessoa) {
		this.id_Pessoa = id_Pessoa;
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
