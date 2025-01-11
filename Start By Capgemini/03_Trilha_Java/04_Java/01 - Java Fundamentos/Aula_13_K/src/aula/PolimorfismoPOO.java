package aula;

public class PolimorfismoPOO {
    public static void main(String[] args) {
        // Polimorfismo
        // Atribuição de um objeto de uma subclasse a uma variável de uma superclasse
        // A variável de referência pode chamar qualquer método da superclasse
        // O método chamado será sempre o da subclasse


        // Instanciando um objeto da classe Elefante
        Mamifero elefante = new Elefante();
        // Chamando o método cotaDeLeite da classe Elefante
        System.out.println("Cota diária de leite de um Elefante :" + elefante.cotaDeLeite());
        

        // Instanciando um objeto da classe Vaca
        Mamifero vaca = new Vaca();
        // Chamando o método cotaDeLeite da classe Vaca
        System.out.println("Cota diária de leite de uma Vaca :" + vaca.cotaDeLeite());
    }
}
