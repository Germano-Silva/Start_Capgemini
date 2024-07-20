import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        Pessoa objetoPessoa = new Pessoa();

        System.out.println("Digite o Peso da Pessoa:");
        objetoPessoa.peso = leitor.nextFloat();
        System.out.println("Digite o Altura da Pessoa:");
        objetoPessoa.altura = leitor.nextFloat();

        System.out.println("O imc é: " + objetoPessoa.calcularIMC());
         
        leitor.close();
        
    }
}
