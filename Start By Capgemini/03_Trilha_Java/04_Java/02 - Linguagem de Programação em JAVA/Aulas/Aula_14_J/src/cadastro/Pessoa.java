package cadastro;

public class Pessoa {
	private int id_pessoa;
	private String nome_pessoa;
	private String email_pessoa;

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

	//construct
	public Pessoa(int id_pessoa, String nome_pessoa, String email_pessoa) {
        this.id_pessoa = id_pessoa;
        this.nome_pessoa = nome_pessoa;
        this.email_pessoa = email_pessoa;
    }
	//toString method to print object data in a readable format
	@Override
    public String toString() {
        return "Pessoa [id_pessoa=" + id_pessoa + ", nome_pessoa=" + nome_pessoa + ", email_pessoa=" + email_pessoa + "]";
    }

	//default constructor
	public Pessoa() {
    }

	//constructor with only name and email fields
	public Pessoa(String nome_pessoa, String email_pessoa) {
        this.nome_pessoa = nome_pessoa;
        this.email_pessoa = email_pessoa;
    }
	
}
