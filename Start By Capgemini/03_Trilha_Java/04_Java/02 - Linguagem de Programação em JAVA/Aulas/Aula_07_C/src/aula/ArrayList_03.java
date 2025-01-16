package aula;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayList_03 {

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
        
        // adicionando Carros ao arraylist com JOPtionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        // mostra array
        System.out.println(carros);
	}

}
