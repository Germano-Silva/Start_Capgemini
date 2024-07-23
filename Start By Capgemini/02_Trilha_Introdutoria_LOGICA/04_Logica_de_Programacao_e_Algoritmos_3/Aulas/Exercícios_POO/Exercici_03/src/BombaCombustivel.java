public class BombaCombustivel {
    private String tipoCombustível;
    private float valorLitro;
    private float quantidadeCombustível;
    
    public BombaCombustivel(String tipoCombustível, float valorLitro, float quantidadeCombustível) {
        this.tipoCombustível = tipoCombustível;
        this.valorLitro = valorLitro;
        this.quantidadeCombustível = quantidadeCombustível;
    }
    
    public String getTipoCombustível() {
        return tipoCombustível;
    }
    public void setTipoCombustível(String tipoCombustível) {
        this.tipoCombustível = tipoCombustível;
    }
    public float getValorLitro() {
        return valorLitro;
    }
    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
    public float getQuantidadeCombustível() {
        return quantidadeCombustível;
    }
    public void setQuantidadeCombustível(float quantidadeCombustível) {
        this.quantidadeCombustível = quantidadeCombustível;
    }

    
    


}
