package ArrayListJava;

import java.util.ArrayList;

public class ArrayLista {
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(-3);
		numeros.add(10);
		numeros.add(30);
		numeros.add(200);
		
		System.out.println(numeros);
		
		for(int i : numeros) {
			System.out.println(i);
		}
		
		for(int i=0; i<numeros.size(); i++) {
			System.out.printf("%d: %d\", i+1, numeros.get(1));
		}
	}

	
	
	
}
