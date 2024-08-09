public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno = new Aluno(123456, "João", 7.5, 8.0, 9.0);

        double mediaFinal = aluno.media();
        System.out.println("Média Final: " + mediaFinal);

        double notaProvaFinal = aluno.notaProvaFinal();
        if (notaProvaFinal == 0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno precisa de " + notaProvaFinal + " na prova final.");
        }
    }
}
