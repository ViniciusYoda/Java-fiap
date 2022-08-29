package cp4;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		ArrayList<Produto> comanda01 = new ArrayList<Produto>();
		Produto a1 = new Produto(1, "Arroz", 10.00f);
		Produto a2 = new Produto(2, "Feijão", 10.00f);
		Produto a3 = new Produto(3, "Pastel", 5.00f);
		
		a1.toString();
		
	}
}
