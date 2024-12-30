public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;
    
    public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    public String gettipoCombustivel() {
        return tipoCombustivel;
    }
    public void settipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public float getValorLitro() {
        return valorLitro;
    }
    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
    public float getquantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    public void setquantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
            double litros = valor / this.valorLitro;
            System.out.println("Foram abastecidos " + litros + " litros.");
    }

    public void abastecerPorLitro(double litros) {
                double valor = litros * valorLitro;
                System.out.println("O valor a ser pago é R$ " + valor + ".");
    }

    public void alterarValor(double novoValor) {
            this.valorLitro = (float) novoValor;
            System.out.println("O valor do litro foi alterado para R$ " + valorLitro + ".");
    }

    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
        System.out.println("O tipo de combustível foi alterado para " + this.tipoCombustivel + ".");
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
            this.quantidadeCombustivel = (float) novaQuantidade;
            System.out.println("A quantidade de combustível foi alterada para " + this.quantidadeCombustivel + " litros.");
    }

}
