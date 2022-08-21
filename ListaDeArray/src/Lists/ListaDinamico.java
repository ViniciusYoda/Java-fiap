package Lists;

import java.util.ArrayList;

public class ListaDinamico {
	public static void main(String[] args) {
		// ArrayList<tipo> nome = new ArrayList<tipo>();
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		arrayDinamico.add("Goku");
		arrayDinamico.add("Maria");
		arrayDinamico.add("Pedro");
		arrayDinamico.add("Vegeta");
		arrayDinamico.add("Bob Esponja");
		
		System.out.println("Imprimindo arrayDinamico");
		
		for(int indice = 0; indice < arrayDinamico.size(); indice++) {
			System.out.println(arrayDinamico.get(indice));
		}
	}
}
