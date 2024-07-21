
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private double altura;
    
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int calcularIdade() {
        int idade;
        
        return idade;
    }
    public String atributosPessoa() {
        return "Nome: " + this.nome + "\n" +
               "Data de Nascimento: " + this.dataNascimento + "\n" +
               "Altura: " + this.altura + " metros";
    }
}
