package aula;

import java.util.ArrayList;

public class ArrayList_07 {

    public static void main(String[] args) {
        // Construindo um ArrayList para os carros
        ArrayList<String> carros = new ArrayList<>();
        
        // Adicionando carros ao ArrayList
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");

        // Mostra o ArrayList
        System.out.println(carros);

        // Mostra o tamanho do ArrayList
        System.out.println("Tamanho do array: " + carros.size());
        
        //Variavel de verificação
        boolean encontrou = false;
		// Substituir BMW por BUGATTI
        for (int i = 0; i < carros.size(); i++) {
            // Se o carro for BMW, substitui por BUGATTI
			//.equals verifica condição de igaldade dos dados 
            if ("BMW M3".equals(carros.get(i))) {
				//.set substitui o valor que estiver na posição de igual ao solicitado
                carros.set(i, "BUGATTI");
				//Variavel informa que foi encontrado mudando o valor boleano
                encontrou = true;
                break;
            }
        }

        // Caso BMW não tenha sido encontrado, adiciona BUGATTI
		//true vai se tornar false e não entra na condição
		//false vai se tornar true e vai entrar na condição
        if (!encontrou) {
            carros.add("BUGATTI");
            System.out.println("O Carro BUGATTI foi adicionado");
        }

        // Mostra o ArrayList atualizado
        System.out.println(carros);
    }
}
