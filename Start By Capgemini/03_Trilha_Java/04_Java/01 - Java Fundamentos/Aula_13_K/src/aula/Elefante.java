package aula;

// Classe Elefante que herda de Mamifero
public class Elefante extends Mamifero {

    // Implementação do método abstrato cotaDeLeite
    @Override//sobrescrevendo o método
    public double cotaDeLeite() {
        return 30.0;
    }

}
