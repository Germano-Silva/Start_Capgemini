package aula;

public class Gado implements InterfaceAnimal {
    // Implementação do método emitirSom
    @Override // Sobrescreve o método emitirSom da InterfaceAnimal
    public void emitirSom() {
        System.out.println("Muuuuuu");
    }

    // Implementação do método comer
    @Override // Sobrescreve o método comer da InterfaceAnimal
    public void comer() {
        System.out.println("Comendo capim");
    }


}
