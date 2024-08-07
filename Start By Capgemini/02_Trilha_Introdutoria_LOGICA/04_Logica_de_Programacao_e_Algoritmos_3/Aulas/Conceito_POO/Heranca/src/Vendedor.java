

public class Vendedor extends Funcionario{

    private int totalItensVendidos;
    private float comissaoItensVendidos;


    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }


    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }


    public float getComissaoItensVendidos() {
        return comissaoItensVendidos;
    }


    public void setComissaoItensVendidos(float comissaoItensVendidos) {
        this.comissaoItensVendidos = comissaoItensVendidos;
    }


    public Vendedor() {
        super();

    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissaoItensVendidos * this.totalItensVendidos);
    }



}
