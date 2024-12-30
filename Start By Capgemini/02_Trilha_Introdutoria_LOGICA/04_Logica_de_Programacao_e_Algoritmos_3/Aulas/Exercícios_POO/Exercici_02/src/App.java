public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta = new ContaCorrente(1234, "Germano", 1000.00);

        System.out.printf("Conta corrente %d criada para %s com saldo inicial de R$ %.2f\n",conta.getNumeroConta(), conta.getNomeCorrentista(), conta.getSaldo());

        conta.deposito(500.50);
        System.out.printf("Novo saldo: R$ %.2f\n", conta.getSaldo());

        conta.saque(200.75);
        System.out.printf("Novo saldo: R$ %.2f\n", conta.getSaldo());

        conta.alterarNome("Giovanne");
        System.out.printf("Nome alterado para: %s\n", conta.getNomeCorrentista());
    }
}
