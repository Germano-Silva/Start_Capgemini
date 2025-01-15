package aula;

import javax.swing.JOptionPane;

public class Array_02 {

	public static void main(String[] args) {
		//declarando o array
        String [] paises = new String[4];
        
        //abastecendo o array
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Digite o nome do país: ");
        }

        //imprimindo o array
        for (String lista: paises) {
            System.out.println(lista);
        }

	}

}
