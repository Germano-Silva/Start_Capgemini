package aula;

import java.util.ArrayList;

public class ArrayList_02 {

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
        
        // substituir FUSCA por MITSUBISHI
        carros.set(4,"MITSUBISHI");
        // mostra array
        System.out.println(carros);
        
        // remover VECTRA
        carros.remove("VECTRA");
        // mostra array
        System.out.println(carros);

	}

}
