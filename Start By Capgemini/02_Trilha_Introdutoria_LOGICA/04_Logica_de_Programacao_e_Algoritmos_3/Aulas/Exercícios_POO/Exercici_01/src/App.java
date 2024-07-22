import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o nome:");
        pessoa.setNome(leitor.next());
        System.out.println("Informe a altura:");
        pessoa.setAltura(leitor.nextDouble());
        leitor.nextLine();

        System.out.println("Informe a data de nascimento (dd/MM/yyyy):");
        SimpleDateFormat dateFormatada = new SimpleDateFormat("dd/MM/yyyy");
        String dataNascimentoStr = leitor.nextLine();
        leitor.nextLine();
        java.util.Date dataNascimento = dateFormatada.parse(dataNascimentoStr);
        pessoa.setDataNascimento(dataNascimento);
    
        leitor.close();

        System.out.println("\nDados da Pessoa:");
        System.out.println(pessoa.atributosPessoa());
        
        int idade = pessoa.calcularIdade();
        System.out.println("Idade: " + idade + " anos");
    }
}
