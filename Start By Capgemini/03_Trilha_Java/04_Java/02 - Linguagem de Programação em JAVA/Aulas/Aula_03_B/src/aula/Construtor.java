package aula;

public class Construtor {
    public static void main(String[] args) {

        //Instanciando um objeto da classe Alunos
        //Passando as notas como parâmetros
        //Chamando o construtor
        //Sobrecarga de construtores
        Alunos aluno = new Alunos(7.0, 8.0, 9.0);

        //Chamando o método calcularMedia
        double media = aluno.calcularMedia();

        //Definindo a situação do aluno
        if (media < 6) {
            //Atribuindo a situação do aluno adicionando o valor do enumerador
            aluno.situacaoDoAluno = Alunos.STATUS.REPROVADO;
        } else {
            aluno.situacaoDoAluno = Alunos.STATUS.APROVADO;
        }

        //Exibindo a situação do aluno
        System.out.println("Situação do aluno: " + aluno.situacaoDoAluno);

        //Exibindo a média
        System.out.println("Média do aluno: " + media);
    }

}
