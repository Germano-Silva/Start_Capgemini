// Classe
public class Pessoa {
    // Atributo
    float peso;
    float altura;
    

    //metodo
    public float calcularIMC(){
        float imc = peso/(altura*altura);
        return imc;
    }
    
}
