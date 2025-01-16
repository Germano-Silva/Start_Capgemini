package controle;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {

    // Lista para armazenar números dos voos
    private List<Integer> listaAeronaves = new ArrayList<>();

    /**
     * Adiciona um número de voo à lista de aeronaves.
     * @param nrVoo Número do voo a ser adicionado.
     */
    public void addVoo(Integer nrVoo) {
        listaAeronaves.add(nrVoo);
    }

    /**
     * Retorna o primeiro número de voo da lista.
     * @return Primeiro número de voo.
     * @throws IllegalStateException se a lista estiver vazia.
     */
    public Integer primeiroVoo() {
        if (listaAeronaves.isEmpty()) {
            throw new IllegalStateException("Lista está vazia");
        }
        return listaAeronaves.get(0);
    }

    /**
     * Imprime todos os números de voos armazenados na lista.
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