import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o nome:");
        pessoa.setNome(leitor.next());
        System.out.println("Informe a altura:");
        pessoa.setAltura(leitor.nextDouble());
        System.out.println("Informe a data de nascimento (dd/MM/yyyy):");
        pessoa.setDataNascimento(leitor.next());

        leitor.close();

        System.out.println("\nDados da Pessoa:");
        System.out.println(pessoa.atributosPessoa());

        // Calculando e imprimindo a idade da pessoa
        int idade = pessoa.calcularIdade();
        System.out.println("Idade: " + idade + " anos");
    }
}
