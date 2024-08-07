import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        Pessoa objetoPessoa = new Pessoa(1.70f,70.0f);

        System.out.println("Digite o Peso da Pessoa:");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite o Altura da Pessoa:");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("O imc é: " + objetoPessoa.calcularIMC());
         
        leitor.close();
        
    }
}
