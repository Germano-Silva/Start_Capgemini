public class ContaCorrente {

    private int numeroConta;
    private String nomeCorrentista;
    private double  saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        if(numeroConta < 0){
            System.out.println("Número da conta obrigatorio");
        }else{
            this.numeroConta = numeroConta;
        }
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
    public void setNomeCorrentista(String nomeCorrentista) {
        if("".equals(nomeCorrentista)){
            System.out.println("Nome do correntista da conta obrigatorio");
        }else{
            this.nomeCorrentista = nomeCorrentista;
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f", valor, " realizado com sucesso.");
        } else {
            System.out.println("Para realizar deposito, o valor deve ser maior que zero.");
        }
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.printf("Saque de R$ %.2f", valor," realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("O valor do saque deve ser maior que zero.");
        }
    }

}
