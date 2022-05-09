package aulaDDD;

public class Cachorro extends Animal{

	public Cachorro(String e, String c, String h) {
		super(e, c, h);
	}
	
	public void fazerBarulho() {
		System.out.println("Auau!");
	}
	
}
