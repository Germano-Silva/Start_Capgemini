package aula;

import java.util.Scanner;

public class AulosInformacoes {
    //Atributos
    private String nome;
    private String matricula;
    private String curso;
    private STATUS situacaoDaMatricula;

    //Metodo para exibir informações da situação de matricula
    //criando enum para definir a situação da matricula do aluno
    public enum STATUS {
        MATRICULADO,
        TRANCADO,
        DESISTENTE,
        FORMADO,
        EVADIDO,
        CANCELADO,
        SUSPENSO,
        RECUSADA
    }

    //Construtor
    public AulosInformacoes(String nome, String matricula, String curso) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Método para definir a situação da matrícula
    public void setSituacaoDaMatricula(int status) {
        switch (status) {
            case 1:
                this.situacaoDaMatricula = STATUS.MATRICULADO;
                break;
            case 2:
                this.situacaoDaMatricula = STATUS.TRANCADO;
                break;
            case 3:
                this.situacaoDaMatricula = STATUS.DESISTENTE;
                break;
            case 4:
                this.situacaoDaMatricula = STATUS.FORMADO;
                break;
            case 5:
                this.situacaoDaMatricula = STATUS.EVADIDO;
                break;
            case 6:
                this.situacaoDaMatricula = STATUS.CANCELADO;
                break;
            case 7:
                this.situacaoDaMatricula = STATUS.SUSPENSO;
                break;
            case 8:
                this.situacaoDaMatricula = STATUS.RECUSADA;
                break;
            default:
                throw new IllegalArgumentException("Status de matrícula inválido: " + status);
        }
    }

    // Método para exibir a situação da matrícula
    public STATUS getSituacaoDaMatricula() {
        return situacaoDaMatricula;
    }

    // Método para solicitar informações ao usuário
    public void solicitarInformacoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        this.nome = scanner.nextLine();

        System.out.print("Informe a matrícula do aluno: ");
        this.matricula = scanner.nextLine();

        System.out.print("Informe o curso do aluno: ");
        this.curso = scanner.nextLine();

        System.out.println("Informe a situação da matrícula:");
        System.out.println("1 - Matriculado");
        System.out.println("2 - Trancado");
        System.out.println("3 - Desistente");
        System.out.println("4 - Formado");
        System.out.println("5 - Evadido");
        System.out.println("6 - Cancelado");
        System.out.println("7 - Suspenso");
        System.out.println("8 - Recusada");
        int status = scanner.nextInt();

        setSituacaoDaMatricula(status);
    }
}