package aula;

public class PessoaJuridica  extends Pessoas{
    public  String cnpj;
    public  String inscricaoEstadual;

    //ToString com os atributos da classe extendida
    @Override
    public String toString() {
        return "PessoaJuridica [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", status=" + status + ", cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + "]";

    }
}
