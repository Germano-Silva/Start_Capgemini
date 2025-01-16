package controle;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe genérica para gerenciar aeronaves, permitindo que o tipo dos voos seja flexível.
 * @param <T> Tipo genérico dos voos (por exemplo, Integer, String, etc.).
 */
public class AeronaveGenerics<T> {

    // Lista para armazenar os elementos genéricos (números de voo ou outros dados)
    private List<T> listaAeronaves = new ArrayList<>();

    /**
     * Adiciona um elemento genérico à lista de aeronaves.
     * @param nrVoo Elemento a ser adicionado à lista.
     */
    public void addVoo(T nrVoo) {
        listaAeronaves.add(nrVoo);
    }

    /**
     * Retorna o primeiro elemento da lista.
     * @return Primeiro elemento da lista.
     * @throws IllegalStateException se a lista estiver vazia.
     */
    public T primeiroVoo() {
        if (listaAeronaves.isEmpty()) {
            throw new IllegalStateException("Lista está vazia");
        }
        return listaAeronaves.get(0);
    }

    /**
     * Imprime todos os elementos armazenados na lista no formato de array.
     */
    public void listaVoos() {
        System.out.print("[");
        if (!listaAeronaves.isEmpty()) {
            System.out.print(listaAeronaves.get(0));
        }
        for (int i = 1; i < listaAeronaves.size(); i++) {
            System.out.print(", " + listaAeronaves.get(i));
        }
        System.out.print("]");
    }
}
