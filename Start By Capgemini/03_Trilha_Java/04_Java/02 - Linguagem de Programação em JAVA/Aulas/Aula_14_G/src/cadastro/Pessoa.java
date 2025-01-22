package cadastro;

public class Pessoa {
	private int id_pessoa;
	private String nome_pessoa;
	private String email_pessoa;

    public Pessoa(String email_pessoa, int id_pessoa, String nome_pessoa) {
        this.email_pessoa = email_pessoa;
        this.id_pessoa = id_pessoa;
        this.nome_pessoa = nome_pessoa;
    }

    public Pessoa(String email_pessoa, String nome_pessoa) {
        this.email_pessoa = email_pessoa;
        this.nome_pessoa = nome_pessoa;
    }

    public Pessoa() {
    }
	
	
	public int getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public String getNome_pessoa() {
		return nome_pessoa;
	}
	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}
	public String getEmail_pessoa() {
		return email_pessoa;
	}
	public void setEmail_pessoa(String email_pessoa) {
		this.email_pessoa = email_pessoa;
	}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("id_pessoa=").append(id_pessoa);
        sb.append(", nome_pessoa=").append(nome_pessoa);
        sb.append(", email_pessoa=").append(email_pessoa);
        sb.append('}');
        return sb.toString();
    }

	
}
