// Classe
public class Pessoa {
    // Atributo.
    private float peso;
    private float altura;
    
    //Método.
    public float calcularIMC(){
        float imc = peso/(altura*altura);
        return imc;
    }
    //Construtos.
    public Pessoa(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }
    //Métodos acessoares de entrada.
    public void setPeso (float peso){
        this.peso = peso;
    }
    //Métodos acessoares de saida.
    public float getPeso (){
        return peso;
    }
    //Métodos acessoares de entrada.
    public void setAltura(float altura) {
        this.altura = altura;
    }
    //Métodos acessoares de saida.
    public float getAltura() {
        return altura;
    }


}
