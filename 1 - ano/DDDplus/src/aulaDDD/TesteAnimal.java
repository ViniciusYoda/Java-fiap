package aulaDDD;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Shitzu", "Marrom", "Dom�stico", 4);
		Gato cat = new Gato("Felino", "Preto", "Dom�stico");
		
		System.out.println(dog);
		System.out.println(cat);
				
		System.out.println("Esp�cie: " + dog.getEspecie());
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Habitate: " + dog.getHabitat());
		System.out.println("Patas: " + dog.getnPatas());
		dog.fazerBarulho();
		
		System.out.println("Esp�cie: " + cat.getEspecie());
		System.out.println("Cor: " + cat.getCor());
		System.out.println("Habitate: " + cat.getHabitat());
		
		cat.fazerBarulho();
	}
}
