package aula;

public class Annotations_03 {
    
        void visualizar(){
            System.out.println("Método Visualizacao");
        }
        
        /**
         * @deprecated replaced by display()
         **/
        void exibir(){
            System.out.println("Mostrando que o método exibir é normal");
        } 
}
