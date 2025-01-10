package aula;
//Classe abstrata Pessoa do mundo real e suas características
public class PessoaAbstracao {
        // Atributos da classe são características do mundo real atribuido a uma pessoa
        public String nome;
        public int idade;
        public String sexo;
        
        // Método para mostrar os dados da pessoa
        public void mostrarDadosPessoa(String nome, int idade) {
            //Ação do método
            // Mostra os dados da pessoa
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
}
