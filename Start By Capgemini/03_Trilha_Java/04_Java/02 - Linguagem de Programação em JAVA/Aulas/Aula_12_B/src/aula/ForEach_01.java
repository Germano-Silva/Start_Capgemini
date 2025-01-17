package aula;

public class ForEach_01 {
    public static void main(String[] args) {
        // Exemplo prático de manipulação de arrays em Java
        // Este código demonstra como percorrer um vetor utilizando dois métodos:
        // 1. Um loop convencional (for com índice).
        // 2. Um loop simplificado (for-each).

        // Declaração e inicialização de um vetor de inteiros com valores de 1 a 10
        int[] vetorNumeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Varrendo o vetor utilizando um loop for convencional (com índice)
        System.out.println("Varrendo o vetor sem For Each");
        for (int i = 0; i < vetorNumeros.length; i++) {
            // Acessa cada elemento do vetor através do índice `i` e imprime seu valor
            System.out.println("Nr : " + vetorNumeros[i]);
        }

        // Varrendo o vetor utilizando um loop for-each
        System.out.println("Varrendo o vetor usando o For Each");
        for (Integer ListaNumeros : vetorNumeros) {
            // Acessa diretamente cada elemento do vetor e imprime seu valor
            // Não é necessário manipular índices, pois o for-each faz isso automaticamente
            System.out.println("Nr : " + ListaNumeros);
        }

    }
}
