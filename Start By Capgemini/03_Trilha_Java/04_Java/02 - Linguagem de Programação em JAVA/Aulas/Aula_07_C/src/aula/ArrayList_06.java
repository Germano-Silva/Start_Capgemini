package aula;

import java.util.ArrayList;

public class ArrayList_06 {

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

		//Mostra o tamanho do array
		System.out.println("Tamanho do array: " + carros.size());
        
		// substituir BMW por BUGATTI
        if (carros.contains("BMW")) {
            // substituindo quando não se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
				// se o carro for BMW substitui por BUGATTI
                if ("BMW".equals(carros.get(i))) {
					// .set substitui um elemento do arraylist
                    carros.set(i, "BUGATTI");
					// break para sair do loop
                    break;
                }
            }
        }

        // mostra array
        System.out.println(carros);

	}

}
