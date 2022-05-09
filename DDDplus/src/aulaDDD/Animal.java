package aulaDDD;

public class Animal {
	//atributos
	private String especie;
	private String cor;
	private String habitat;
	
	//construtor
	public Animal(String e, String c, String h) {
		this.especie = e;
		this.cor = c;
		this.habitat = h;
	}
	
	public void fazerBarulho() {
		System.out.println("fazerBarulho");
	}
}
