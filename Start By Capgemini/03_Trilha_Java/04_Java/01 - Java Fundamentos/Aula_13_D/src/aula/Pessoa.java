package aula;
// Classe Pessoa
public class Pessoa {

        //Atributos de classe são variáveis que pertencem ao objeto abstraido do mundo real e que são representados na classe
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
