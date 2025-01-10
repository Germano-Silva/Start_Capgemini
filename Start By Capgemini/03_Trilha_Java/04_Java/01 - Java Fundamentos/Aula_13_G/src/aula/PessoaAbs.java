package aula;

public class PessoaAbs {
    // Atributos da classe são características do mundo real atribuido a uma pessoa
    private  String nome;
    private int idade;
    

    //Encapsulamento é uma técnica que consiste em ocultar os detalhes de implementação de um objeto
    //Gerando toString
    @Override
    public String toString() {
        return "PessoaAbs [nome=" + nome + ", idade=" + idade + "]";
    }

    //gerando getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    // Método para mostrar os dados da pessoa
    public void mostrarDadosPessoa(String nome, int idade) {
        //Ação do método
        // Mostra os dados da pessoa
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
