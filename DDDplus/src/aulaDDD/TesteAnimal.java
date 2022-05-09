package aulaDDD;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Shitzu", "Marrom", "Doméstico");
		Gato cat = new Gato("Felino", "Preto", "Doméstico");
		
		System.out.println(dog);
		System.out.println(cat);
				
		System.out.println("Espécie: " + dog.getEspecie());
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Habitate: " + dog.getHabitat());
		System.out.println("Patas: " + dog.getnPatas());
		dog.fazerBarulho();
		
		System.out.println("Espécie: " + cat.getEspecie());
		System.out.println("Cor: " + cat.getCor());
		System.out.println("Habitate: " + cat.getHabitat());
		System.out.println("Patas: " + cat.getnPatas());
		cat.fazerBarulho();
	}
}
