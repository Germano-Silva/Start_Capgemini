package aula;

public class Pessoas {
    // Atributos de pessoas genéricas
    public String nome;
    public String endereco;
    public String telefone;
    public String status;

    //toString
    @Override
    public String toString() {
        return "Pessoas [endereco=" + endereco + ", nome=" + nome + ", status=" + status + ", telefone=" + telefone + "]";
    }


}
