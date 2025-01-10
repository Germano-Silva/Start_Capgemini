package aula;

public class PessoaFisica extends Pessoas {
    public String cpf;
    public String registroGeral;
    
    //ToString
    @Override
    public String toString() {
        return "PessoaFisica [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", status=" + status + ", cpf=" + cpf + ", registroGeral=" + registroGeral + "]";
    }
}
