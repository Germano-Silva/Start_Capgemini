package aula;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que solicite ao usuário a entrada de 4 notas 
		 * para cada aluno, calcular a média dos alunos e exibir em tela. 
		 * Ao final mostrar a média da turma. 
		 * Ao lado da média do aluno deve seguir a seguinte regra de negócio.
		 * Se média >= 7,5               Aluno Aprovado
		 * Se média >= 5,5 e <7,5   Aluno em Recuperação
		 * Se média  < 5,5                Aluno Reprovado
		*/
		// Vetor dos alunos
		String [] alunos = {"JOAO","JOSÉ","MARIA"};

		// Matriz das notas
		float [][] notas = new float[3][4];

		// para controlar o somatório das notas de cada aluno
		// para calcular a media do aluno
		float somaNotas, mediaAluno;
		// par armazenar o status do aluno e usar para imprimir o boletim depois
		String statusAluno;

		// informar as notas dos alunos
		// laço externo para associar aluno à nota
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno : " + alunos[i]);
			// laço interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;

			// laço para informar as notas de cada aluno
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " + (j+1) + " do aluno " + alunos[i]));
			    somaNotas = somaNotas + notas[i][j];
			}

			// calculo da média do aluno
			mediaAluno = somaNotas / 4;

			// regra de para definir o status do aluno
			if	(mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "EM RECUPERAÇÃO";
			} else {
				statusAluno = "APROVADO";
			}

			// impressão do boletim
			System.out.println("\n************ BOLETIM *************");
			System.out.println("Aluno.: " + alunos[i]);
			System.out.println("Notas");
			for (int k = 0; k < 4; k++) {
				System.out.println((k+1) + " - " + notas[i][k]);
			}
			System.out.println("Média ..: " + mediaAluno + " - " + statusAluno);
		}


		
	}

}
