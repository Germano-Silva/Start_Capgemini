package aula;

import java.util.LinkedList;

public class LinkedList_01 {

	public static void main(String[] args) {
		//estudando linkedList
		//Metodos:
		/*
			* addFirst()
			* addLast()
			* removeFirst()
			* removeLast()
			* getFirst()
			* getLast()
	 	*/

		//Variavel
		String carro;

		//Estanciando um objeto do tipo string em formato de lista
	    LinkedList<String> cars = new LinkedList<String>();

		//Adicionando nomes de carros a lista 
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    // incluindo Mazda no inicio
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	    
	    // Incluindo Bugatti no fim
	    cars.addLast("Bugatti");
	    System.out.println(cars);
	    
		//Verificando o carro que esta no indice 3
	    carro = cars.get(3);
	    System.out.println(carro);
	    
	    // removendo Mazda
	    cars.removeFirst();
	    System.out.println(cars);    

	    // pega o primeiro
	    System.out.println(cars.getFirst());
	    System.out.println(cars);

		//Limpando linkedList
		cars.clear();
		if(cars.isEmpty()){
			System.out.println("LinkedList vazio");
		}
	}

}
