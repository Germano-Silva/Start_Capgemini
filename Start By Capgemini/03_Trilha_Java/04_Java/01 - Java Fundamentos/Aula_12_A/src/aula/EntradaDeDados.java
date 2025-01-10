package aula;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		// Entado de dados via JOptionPane
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		//System.out.println("Sua idade é: " + idade);
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);

		
		//Entrada de dados via scanner
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Digite sua idade");
		//int idade = scanner.nextInt();
		//System.out.println("Sua idade é: " + idade);

		

	}

}
