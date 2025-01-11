package aula;

public class Alunos {
    private double nota1;
    private double nota2;
    private double nota3;
    //Enum para definir a situação do aluno
    STATUS situacaoDoAluno;

    //Construtor
    public Alunos(double nota1, double nota2, double nota3) {
        super();
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    //Definindo um enumerador
    public enum STATUS{
        APROVADO,
        REPROVADO
    }

    //Método para calcular a média
    public double calcularMedia() {
        //Variável para armazenar a média
        double mediaAluno = 0;
        //Cálculo da média
        mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
        return mediaAluno;
    }

}
