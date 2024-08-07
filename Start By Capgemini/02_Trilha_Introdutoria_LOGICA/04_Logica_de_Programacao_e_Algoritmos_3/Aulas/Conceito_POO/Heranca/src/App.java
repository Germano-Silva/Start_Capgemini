import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setCpf("000.000.000.01");
        v.setSalario(1300.00f);
        v.setDataNascimento(new Date());
        v.setComissaoItensVendidos(100.0f);
        v.setTotalItensVendidos(10);

        System.out.println(" O salario do vendedor é: "+ v.calcularSalario());
        
        Motorista m = new Motorista();

    }
}
