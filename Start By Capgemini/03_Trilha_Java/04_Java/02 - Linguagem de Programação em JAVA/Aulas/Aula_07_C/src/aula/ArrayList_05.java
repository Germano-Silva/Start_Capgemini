package aula;

import java.util.ArrayList;

public class ArrayList_05 {

	public static void main(String[] args) {
		// construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();
        
        // adicionando Carros ao arraylist
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");
		
        // mostra array
        System.out.println(carros);
        
        // verificar se o array está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        } else {
			System.out.println("O vetor não está vazio");
		}

	}

}
