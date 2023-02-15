package Lists;

import java.util.ArrayList;

public class ListaDinamico {
	public static void main(String[] args) throws Exception{
		// ArrayList<tipo> nome = new ArrayList<tipo>();
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		arrayDinamico.add("Goku");
		arrayDinamico.add("Maria");
		arrayDinamico.add("Pedro");
		arrayDinamico.add("Vegeta");
		arrayDinamico.add("Bob Esponja");
		
		System.out.println("Imprimindo arrayDinamico");

		for(String nome : arrayDinamico){
			System.out.println(nome);
		}

		System.out.println("Remover Pedro"); 
		arrayDinamico.remove(2); // remove um elemento do indice

		arrayDinamico.clear(); // limpa todo o arrayList
		
		for(int indice = 0; indice < arrayDinamico.size(); indice++) {
			System.out.println(arrayDinamico.get(indice));
		}

		ArrayList<String> filmes = new ArrayList<String>();

		/*
		 * Tipo primitivo -> Wrapper Class
		 * int 			  -> Integer
		 * float		  -> Float
		 * double	      -> Double
		 * char			  -> Character
		 */

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(50);

		Pessoa joao = new Pessoa("João", 20);
		Pessoa maria = new Pessoa("Maria", 22);
		Pessoa pedro = new Pessoa("Pedro", 75);

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();;
		pessoas.add(joao);
		pessoas.add(maria);
		pessoas.add(pedro);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}

	}
}
