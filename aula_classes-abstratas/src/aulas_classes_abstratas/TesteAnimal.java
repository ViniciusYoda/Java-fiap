package aulas_classes_abstratas;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.setNome("doguinho");
		System.out.println(dog.getNome());
		dog.fazerBarulho();
		Gato cat = new Gato();
		cat.fazerBarulho();
	}
}
