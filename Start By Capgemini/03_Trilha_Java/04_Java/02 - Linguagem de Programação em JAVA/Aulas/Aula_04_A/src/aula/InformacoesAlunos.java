package aula;

public class InformacoesAlunos {
    public static void main(String[] args) {
        // Criação do objeto aluno
        AulosInformacoes aluno = new AulosInformacoes("João da Silva", "123456", "Engenharia de Software");

        // Programa para adicionar as informações de matrícula
        aluno.solicitarInformacoes();

        // Exibir a situação da matrícula
        System.out.println("Situação da matrícula: " + aluno.getSituacaoDaMatricula());
    }
}