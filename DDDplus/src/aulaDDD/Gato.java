package aulaDDD;

public class Gato extends Animal {
	public Gato(String e, String c, String h) {
		super(e, c, h);
		
	}
	
	public void fazerBarulho() {
		System.out.println("Miau!");
	}
	
}
